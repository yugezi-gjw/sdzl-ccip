package com.zivy009.demo.springbootshirodwz.services.treatcourse.service;

import static org.apache.commons.lang3.StringUtils.isNotEmpty;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zivy009.demo.springbootshirodwz.persistence.dao.TreatCourseChestMapper;
import com.zivy009.demo.springbootshirodwz.persistence.model.TreatCourseChest;
import com.zivy009.demo.springbootshirodwz.persistence.model.TreatHistory;
import com.zivy009.demo.springbootshirodwz.persistence.tools.CommonMapper;
import com.zivy009.demo.springbootshirodwz.persistence.tools.other.MysqlGenerateSQL;
import com.zivy009.demo.springbootshirodwz.services.bloodtested.dto.BloodTestedDto;
import com.zivy009.demo.springbootshirodwz.services.bloodtested.service.IBloodTestedService;
import com.zivy009.demo.springbootshirodwz.services.impexp.dto.BloodTestedExcelDto;
import com.zivy009.demo.springbootshirodwz.services.impexp.dto.ChestPatientExcelDto;
import com.zivy009.demo.springbootshirodwz.services.multiprimary.dto.MultiPrimaryDto;
import com.zivy009.demo.springbootshirodwz.services.multiprimary.service.IMultiPrimaryService;
import com.zivy009.demo.springbootshirodwz.services.patient.dto.PatientAdvSearchDto;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.dto.ChestDto;
import com.zivy009.demo.springbootshirodwz.services.treathistory.dto.TreatHistoryDto;
import com.zivy009.demo.springbootshirodwz.services.treathistory.service.ITreatHistoryService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ChestServiceImpl extends
    ServiceImpl<TreatCourseChestMapper, TreatCourseChest> implements
    IChestService {

  @Autowired
  CommonMapper commonMapper;
  @Autowired
  IBloodTestedService bloodTestedService;
  @Autowired
  IMultiPrimaryService multiPrimaryService;
  @Autowired
  ITreatHistoryService treatHistoryService;



  @Transactional(rollbackFor = Exception.class)
  @Override
  public int save(ChestDto chestDto) {
    List<MultiPrimaryDto> multiPrimaryDtoList = chestDto.getMultiPrimaryList();
    if (CollectionUtils.isNotEmpty(multiPrimaryDtoList)) {
      multiPrimaryDtoList.forEach(dto -> {
        multiPrimaryService.save(dto);
      });
    }
    List<TreatHistoryDto> treatHistoryList = chestDto.getTreatHistoryList();
    if (CollectionUtils.isNotEmpty(treatHistoryList)) {
      treatHistoryList.forEach(dto -> {
        treatHistoryService.save(dto);
      });
    }

    TreatCourseChest entity = chestDto.toEntity();
    return baseMapper.insert(entity);
  }

  @Transactional(rollbackFor = Exception.class)
  @Override
  public int update(ChestDto chestDto) {
    multiPrimaryService.deleteByTreatCourseId(chestDto.getTreatCourseId());
    treatHistoryService.deleteByTreatCourseId(chestDto.getTreatCourseId());
    List<MultiPrimaryDto> multiPrimaryDtoList = chestDto.getMultiPrimaryList();
    if (CollectionUtils.isNotEmpty(multiPrimaryDtoList)) {
      multiPrimaryDtoList.forEach(dto -> {
        multiPrimaryService.save(dto);
      });
    }
    List<TreatHistoryDto> treatHistoryList = chestDto.getTreatHistoryList();
    if (CollectionUtils.isNotEmpty(treatHistoryList)) {
      treatHistoryList.forEach(dto -> {
        treatHistoryService.save(dto);
      });
    }

    TreatCourseChest entity = chestDto.toEntity();
    return baseMapper.updateById(entity);
  }

  @Override
  public ChestDto selectByTreatCourseId(String treatCourseId) {
    TreatCourseChest chest = baseMapper.queryByTreatCourseId(treatCourseId);
    return ChestDto.fromEntity(chest);
  }

  @Override
  public List<ChestPatientExcelDto> list(PatientAdvSearchDto dto) {
    Map<String, Object> map = new HashMap<String, Object>();
    MysqlGenerateSQL sql = new MysqlGenerateSQL();

    sql.SELECT("p.*, tcc.*");
    sql.FROM("patient p");
    sql.WHERE("p.status!='deleted'");
    sql.INNER_JOIN("treat_course tc on p.id = tc.patient_id");
    sql.LEFT_OUTER_JOIN("treat_course_chest tcc on tc.treat_course_id=tcc.treat_course_id");
    sql.WHERE("tc.bodypart_code = 'chest'");
    if (isNotEmpty(dto.getEgfr())) {
      sql.WHERE("tcc.egfr like #{paramMap.egfr}");
      map.put("egfr", "%" + dto.getEgfr() + "%");
    }
    if (isNotEmpty(dto.getTreatType())) {
      sql.WHERE("tcc.treat_type = #{paramMap.treat_type}");
      map.put("treat_type", dto.getTreatType());
    }
    if (isNotEmpty(dto.getSynchronous())) {
      sql.WHERE("tcc.synchronous = #{paramMap.synchronous}");
      map.put("synchronous", dto.getSynchronous());
    }
    if (isNotEmpty(dto.getIsPulmonaryRadiation())) {
      sql.WHERE("tcc.is_pulmonary_radiation = #{paramMap.is_pulmonary_radiation}");
      map.put("is_pulmonary_radiation", dto.getIsPulmonaryRadiation());
    }
    if (isNotEmpty(dto.getPulmonaryMetastasisRadiation())) {
      sql.WHERE(
          "tcc.pulmonary_metastasis_radiation like #{paramMap.pulmonary_metastasis_radiation}");
      map.put("pulmonary_metastasis_radiation",
          "%" + dto.getPulmonaryMetastasisRadiation() + "%");
    }
    if (isNotEmpty(dto.getCmdTimeSeq())) {
      sql.WHERE("tcc.cmd_time_seq like #{paramMap.cmd_time_seq}");
      map.put("cmd_time_seq", "%" + dto.getCmdTimeSeq() + "%");
    }
    if (isNotEmpty(dto.getCmsTimeSeq())) {
      sql.WHERE("tcc.cms_time_seq like #{paramMap.cms_time_seq}");
      map.put("cms_time_seq", "%" + dto.getCmsTimeSeq() + "%");
    }
    if (isNotEmpty(dto.getSideReaction())) {
      sql.WHERE("tcc.side_reaction like #{paramMap.side_reaction}");
      map.put("side_reaction", "%" + dto.getSideReaction() + "%");
    }
    if (isNotEmpty(dto.getTki())) {
      sql.WHERE("tcc.tki = #{paramMap.tki}");
      map.put("tki", dto.getTki());
    }
    if (isNotEmpty(dto.getPlatinumDoublet())) {
      sql.WHERE("tcc.platinum_doublet = #{paramMap.platinum_doublet}");
      map.put("platinum_doublet", dto.getPlatinumDoublet());
    }
    if (isNotEmpty(dto.getGefitinib())) {
      sql.WHERE("tcc.gefitinib = #{paramMap.gefitinib}");
      map.put("gefitinib", dto.getGefitinib());
    }
    if (isNotEmpty(dto.getAngiostatin())) {
      sql.WHERE("tcc.angiostatin = #{paramMap.angiostatin}");
      map.put("angiostatin", dto.getAngiostatin());
    }
    if (isNotEmpty(dto.getIcotinib())) {
      sql.WHERE("tcc.icotinib = #{paramMap.icotinib}");
      map.put("icotinib", dto.getIcotinib());
    }
    if (isNotEmpty(dto.getStage())) {
      sql.WHERE("tcc.stage = #{paramMap.stage}");
      map.put("stage", dto.getStage());
    }
    if (isNotEmpty(dto.getDiagnosisDt())) {
      sql.WHERE("tcc.diagnosis_dt= #{paramMap.diagnosis_dt}");
      map.put("diagnosis_dt", dto.getDiagnosisDt());
    }
    if (isNotEmpty(dto.getDeathDt())) {
      sql.WHERE("tcc.death_dt= #{paramMap.death_dt}");
      map.put("death_dt", dto.getDeathDt());
    }
    if (isNotEmpty(dto.getLastInpatientDt())) {
      sql.WHERE("tcc.last_inpatient_dt= #{paramMap.last_inpatient_dt}");
      map.put("last_inpatient_dt", dto.getLastInpatientDt());
    }
    if (isNotEmpty(dto.getAccurateOs())) {
      sql.WHERE("tcc.accurate_os like #{paramMap.accurate_os}");
      map.put("accurate_os", "%" + dto.getAccurateOs() + "%");
    }
    if (isNotEmpty(dto.getAlive())) {
      sql.WHERE("tcc.alive= #{paramMap.alive}");
      map.put("alive", dto.getAlive());
    }
    if (isNotEmpty(dto.getProgressDt())) {
      sql.WHERE("tcc.progress_dt= #{paramMap.progress_dt}");
      map.put("progress_dt", dto.getProgressDt());
    }
    if (isNotEmpty(dto.getDeliveredFraction())) {
      sql.WHERE("tcc.delivered_fraction= #{paramMap.delivered_fraction}");
      map.put("delivered_fraction", dto.getDeliveredFraction());
    }
    if (isNotEmpty(dto.getMetastasisSites())) {
      sql.WHERE("tcc.metastasis_sites= #{paramMap.metastasis_sites}");
      map.put("metastasis_sites", dto.getMetastasisSites());
    }
    if (isNotEmpty(dto.getIsMultiSites())) {
      sql.WHERE("tcc.is_multi_sites= #{paramMap.is_multi_sites}");
      map.put("is_multi_sites", dto.getIsMultiSites());
    }
    if (isNotEmpty(dto.getIsBrainMetastases())) {
      sql.WHERE("tcc.is_brain_metastases= #{paramMap.is_brain_metastases}");
      map.put("is_brain_metastases", dto.getIsBrainMetastases());
    }
    if (isNotEmpty(dto.getIsBrainRadiation())) {
      sql.WHERE("tcc.is_brain_radiation= #{paramMap.is_brain_radiation}");
      map.put("is_brain_radiation", dto.getIsBrainRadiation());
    }
    if (isNotEmpty(dto.getBrainMetastasisRadiation())) {
      sql.WHERE("tcc.brain_metastasis_radiation like #{paramMap.brain_metastasis_radiation}");
      map.put("brain_metastasis_radiation", "%" + dto.getBrainMetastasisRadiation() + "%");
    }
    if (isNotEmpty(dto.getIsBoneMetastases())) {
      sql.WHERE("tcc.is_bone_metastases= #{paramMap.is_bone_metastases}");
      map.put("is_bone_metastases", dto.getIsBoneMetastases());
    }
    if (isNotEmpty(dto.getIsBoneRadiation())) {
      sql.WHERE("tcc.is_bone_radiation= #{paramMap.is_bone_radiation}");
      map.put("is_bone_radiation", dto.getIsBoneRadiation());
    }
    if (isNotEmpty(dto.getBoneMetastasisRadiation())) {
      sql.WHERE("tcc.bone_metastasis_radiation like #{paramMap.bone_metastasis_radiation}");
      map.put("bone_metastasis_radiation", "%" + dto.getBoneMetastasisRadiation() + "%");
    }
    if (isNotEmpty(dto.getAdrenalMetastasisRadiation())) {
      sql.WHERE("tcc.adrenal_metastasis_radiation like #{paramMap.adrenal_metastasis_radiation}");
      map.put("adrenal_metastasis_radiation", "%" + dto.getAdrenalMetastasisRadiation() + "%");
    }
    if (isNotEmpty(dto.getOtherMetastasisRadiation())) {
      sql.WHERE("tcc.other_metastasis_radiation like #{paramMap.other_metastasis_radiation}");
      map.put("other_metastasis_radiation", "%" + dto.getOtherMetastasisRadiation() + "%");
    }
    if (isNotEmpty(dto.getHolisticTx())) {
      sql.WHERE("tcc.holistic_tx1 like #{paramMap.holistic_tx1}");
      map.put("holistic_tx1", "%" + dto.getHolisticTx() + "%");
      sql.OR();
      sql.WHERE("tcc.holistic_tx2 like #{paramMap.holistic_tx2}");
      map.put("holistic_tx2", "%" + dto.getHolisticTx() + "%");
      sql.OR();
      sql.WHERE("tcc.holistic_tx3 like #{paramMap.holistic_tx3}");
      map.put("holistic_tx3", "%" + dto.getHolisticTx() + "%");
      sql.OR();
      sql.WHERE("tcc.holistic_tx4 like #{paramMap.holistic_tx4}");
      map.put("holistic_tx4", "%" + dto.getHolisticTx() + "%");
      sql.OR();
      sql.WHERE("tcc.holistic_tx5 like #{paramMap.holistic_tx5}");
      map.put("holistic_tx5", "%" + dto.getHolisticTx() + "%");
      sql.OR();
      sql.WHERE("tcc.holistic_tx6 like #{paramMap.holistic_tx6}");
      map.put("holistic_tx6", "%" + dto.getHolisticTx() + "%");
      sql.OR();
      sql.WHERE("tcc.holistic_tx7 like #{paramMap.holistic_tx7}");
      map.put("holistic_tx7", "%" + dto.getHolisticTx() + "%");
    }
    if (isNotEmpty(dto.getBackup1())) {
      sql.WHERE("tcc.backup1 like #{paramMap.backup1}");
      map.put("backup1", "%" + dto.getBackup1() + "%");
    }
    if (isNotEmpty(dto.getBackup2())) {
      sql.WHERE("tcc.backup2 like #{paramMap.backup2}");
      map.put("backup2", "%" + dto.getBackup2() + "%");
    }
    if (isNotEmpty(dto.getBackup3())) {
      sql.WHERE("tcc.backup3 like #{paramMap.backup3}");
      map.put("backup3", "%" + dto.getBackup3() + "%");
    }
    if (isNotEmpty(dto.getBackup4())) {
      sql.WHERE("tcc.backup4 like #{paramMap.backup4}");
      map.put("backup4", "%" + dto.getBackup4() + "%");
    }
    if (isNotEmpty(dto.getBackup5())) {
      sql.WHERE("tcc.backup5 like #{paramMap.backup5}");
      map.put("backup5", "%" + dto.getBackup5() + "%");
    }
    if (isNotEmpty(dto.getBackup6())) {
      sql.WHERE("tcc.backup6 like #{paramMap.backup6}");
      map.put("backup6", "%" + dto.getBackup6() + "%");
    }
    if (isNotEmpty(dto.getBackup7())) {
      sql.WHERE("tcc.backup7 like #{paramMap.backup7}");
      map.put("backup7", "%" + dto.getBackup7() + "%");
    }
    if (isNotEmpty(dto.getBackup8())) {
      sql.WHERE("tcc.backup8 like #{paramMap.backup8}");
      map.put("backup8", "%" + dto.getBackup8() + "%");
    }
    if (isNotEmpty(dto.getBackup9())) {
      sql.WHERE("tcc.backup9 like #{paramMap.backup9}");
      map.put("backup9", "%" + dto.getBackup9() + "%");
    }
    if (isNotEmpty(dto.getBackup10())) {
      sql.WHERE("tcc.backup10 like #{paramMap.backup10}");
      map.put("backup10", "%" + dto.getBackup10() + "%");
    }

    sql.ORDER_BY("p.created_at desc");

    List<Map<String, Object>> list = commonMapper.queryList(sql.toString(), map);
    List<ChestPatientExcelDto> result = new ArrayList<>();
    list.forEach(p -> result.add(ChestPatientExcelDto.fromMap(p)));

    for (ChestPatientExcelDto chestPatientExcelDto : result) {
      if (StringUtils.isNotEmpty(chestPatientExcelDto.getTreatCourseId())) {
        List<BloodTestedDto> bloodTestedDtoList = bloodTestedService.queryByTreatCourseId(chestPatientExcelDto.getTreatCourseId());
        chestPatientExcelDto.setBloodTestedExcelDtoList(BloodTestedExcelDto.fromDtoList(bloodTestedDtoList));
      }
    }

    return result;
  }
}
