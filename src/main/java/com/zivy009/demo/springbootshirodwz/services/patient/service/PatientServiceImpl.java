package com.zivy009.demo.springbootshirodwz.services.patient.service;

import static org.apache.commons.lang3.StringUtils.isNotEmpty;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zivy009.demo.springbootshirodwz.common.PageHandler;
import com.zivy009.demo.springbootshirodwz.persistence.dao.EncounterMapper;
import com.zivy009.demo.springbootshirodwz.persistence.dao.PatientMapper;
import com.zivy009.demo.springbootshirodwz.persistence.model.Patient;
import com.zivy009.demo.springbootshirodwz.persistence.tools.CommonMapper;
import com.zivy009.demo.springbootshirodwz.persistence.tools.other.MysqlGenerateSQL;
import com.zivy009.demo.springbootshirodwz.services.patient.dto.PatientAdvSearchDto;
import com.zivy009.demo.springbootshirodwz.services.patient.dto.PatientDto;
import com.zivy009.demo.springbootshirodwz.services.patient.vo.PatientListVo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PatientServiceImpl extends ServiceImpl<PatientMapper, Patient> implements
    IPatientService {

  @Autowired
  CommonMapper commonMapper;

  @Autowired
  EncounterMapper encounterMapper;

  @Autowired
  PatientMapper patientMapper;

  String tableName = "patient p";


  @Transactional(readOnly = true)
  @Override
  public List<PatientListVo> list(PageHandler page, String keyword) {
    // 1.得到记录集
    Map<String, Object> map = new HashMap<String, Object>();
    MysqlGenerateSQL sql = new MysqlGenerateSQL();
    sql.SELECT(
        "p.*");
    sql.FROM(tableName);
//    sql.LEFT_OUTER_JOIN("encounter e on p.id = e.patient_id");
    sql.WHERE("p.status!='deleted'");
    if (isNotEmpty(keyword)) {
      sql.WHERE("p.patient_name like #{paramMap.patient_name}");
      map.put("patient_name", "%" + keyword + "%");

      sql.OR();
      sql.WHERE("p.inpatient_id like #{paramMap.inpatient_id}");
      map.put("inpatient_id", "%" + keyword + "%");
    }
    sql.ORDER_BY("p.created_at desc");
    sql.limit(page.getStartRow(), page.getPageSize());

    List<Map<String, Object>> list = commonMapper.queryList(sql.toString(), map);
    List<PatientListVo> result = new ArrayList<>();
    list.forEach(p -> result.add(PatientListVo.fromMap(p)));

    // 2.得到总数
    Long countInt = commonMapper.queryCount(sql.getCountSQL(), map);
    page.setTotalCount(countInt.intValue());

    return result;
  }

  @Transactional(readOnly = true)
  @Override
  public List<PatientListVo> list(PageHandler page, PatientAdvSearchDto dto) {
    // 1.得到记录集
    Map<String, Object> map = new HashMap<String, Object>();
    MysqlGenerateSQL sql = new MysqlGenerateSQL();
    sql.SELECT(
        "p.*, e.*");
    sql.FROM(tableName);
    sql.LEFT_OUTER_JOIN("encounter e on p.id = e.patient_id");
    sql.WHERE("p.status!='deleted'");
    if (isNotEmpty(dto.getPatientName())) {
      sql.WHERE("p.patient_name like #{paramMap.patient_name}");
      map.put("patient_name", "%" + dto.getPatientName() + "%");
    }
    if (isNotEmpty(dto.getInpatientId())) {
      sql.WHERE("p.inpatient_id like #{paramMap.inpatient_id}");
      map.put("inpatient_id", "%" + dto.getInpatientId() + "%");
    }
    if (isNotEmpty(dto.getGender())) {
      sql.WHERE("p.gender = #{paramMap.gender}");
      map.put("gender", dto.getGender());
    }
    if (isNotEmpty(dto.getNationalId())) {
      sql.WHERE("p.national_id = #{paramMap.national_id}");
      map.put("national_id", dto.getNationalId());
    }
    if (isNotEmpty(dto.getStage())) {
      sql.WHERE("e.stage like #{paramMap.stage}");
      map.put("stage", "%" + dto.getStage() + "%");
    }
    if (isNotEmpty(dto.getEgfr())) {
      sql.WHERE("e.egfr like #{paramMap.egfr}");
      map.put("egfr", "%" + dto.getEgfr() + "%");
    }
    if (isNotEmpty(dto.getDiagnosisDt())) {
      sql.WHERE("e.diagnosis_dt = #{paramMap.diagnosis_dt}");
      map.put("diagnosis_dt", dto.getDiagnosisDt());
    }
    if (isNotEmpty(dto.getDeathDt())) {
      sql.WHERE("e.death_dt = #{paramMap.death_dt}");
      map.put("death_dt", dto.getDeathDt());
    }
    if (isNotEmpty(dto.getLastInpatientDt())) {
      sql.WHERE("e.last_inpatient_dt = #{paramMap.last_inpatient_dt}");
      map.put("last_inpatient_dt", dto.getLastInpatientDt());
    }
    if (isNotEmpty(dto.getAccurateOs())) {
      sql.WHERE("e.accurate_os like #{paramMap.accurate_os}");
      map.put("accurate_os", "%" + dto.getAccurateOs() + "%");
    }
    if (isNotEmpty(dto.getAlive())) {
      sql.WHERE("e.alive = #{paramMap.alive}");
      map.put("alive", dto.getAlive());
    }
    if (isNotEmpty(dto.getProgressDt())) {
      sql.WHERE("e.progress_dt = #{paramMap.progress_dt}");
      map.put("progress_dt", dto.getProgressDt());
    }
    if (isNotEmpty(dto.getDeliveredFraction())) {
      sql.WHERE("e.delivered_fraction = #{paramMap.delivered_fraction}");
      map.put("delivered_fraction", dto.getDeliveredFraction());
    }
    if (isNotEmpty(dto.getTreatType())) {
      sql.WHERE("e.treat_type = #{paramMap.treat_type}");
      map.put("treat_type", dto.getTreatType());
    }
    if (isNotEmpty(dto.getSynchronous())) {
      sql.WHERE("e.synchronous = #{paramMap.synchronous}");
      map.put("synchronous", dto.getSynchronous());
    }
    if (isNotEmpty(dto.getMetastasisSites())) {
      sql.WHERE("e.metastasis_sites = #{paramMap.metastasis_sites}");
      map.put("metastasis_sites", dto.getMetastasisSites());
    }
    if (isNotEmpty(dto.getIsMultiSites())) {
      sql.WHERE("e.is_multi_sites = #{paramMap.is_multi_sites}");
      map.put("is_multi_sites", dto.getIsMultiSites());
    }
    if (isNotEmpty(dto.getIsPulmonaryRadiation())) {
      sql.WHERE("e.is_pulmonary_radiation = #{paramMap.is_pulmonary_radiation}");
      map.put("is_pulmonary_radiation", dto.getIsPulmonaryRadiation());
    }
    if (isNotEmpty(dto.getPulmonaryMetastasisRadiation())) {
      sql.WHERE("e.pulmonary_metastasis_radiation like #{paramMap.pulmonary_metastasis_radiation}");
      map.put("pulmonary_metastasis_radiation", "%" +  dto.getPulmonaryMetastasisRadiation() + "%");
    }
    if (isNotEmpty(dto.getIsBrainMetastases())) {
      sql.WHERE("e.is_brain_metastases = #{paramMap.is_brain_metastases}");
      map.put("is_brain_metastases", dto.getIsBrainMetastases());
    }
    if (isNotEmpty(dto.getIsBrainRadiation())) {
      sql.WHERE("e.is_brain_radiation = #{paramMap.is_brain_radiation}");
      map.put("is_brain_radiation", dto.getIsBrainRadiation());
    }
    if (isNotEmpty(dto.getBrainMetastasisRadiation())) {
      sql.WHERE("e.brain_metastasis_radiation like #{paramMap.brain_metastasis_radiation}");
      map.put("brain_metastasis_radiation", "%" +  dto.getBrainMetastasisRadiation() + "%");
    }
    if (isNotEmpty(dto.getIsBoneMetastases())) {
      sql.WHERE("e.is_bone_metastases = #{paramMap.is_bone_metastases}");
      map.put("is_bone_metastases", dto.getIsBoneMetastases());
    }
    if (isNotEmpty(dto.getIsBoneRadiation())) {
      sql.WHERE("e.is_bone_radiation = #{paramMap.is_bone_radiation}");
      map.put("is_bone_radiation", dto.getIsBoneRadiation());
    }
    if (isNotEmpty(dto.getBoneMetastasisRadiation())) {
      sql.WHERE("e.bone_metastasis_radiation like #{paramMap.bone_metastasis_radiation}");
      map.put("bone_metastasis_radiation", "%" +  dto.getBoneMetastasisRadiation() + "%");
    }
    if (isNotEmpty(dto.getAdrenalMetastasisRadiation())) {
      sql.WHERE("e.adrenal_metastasis_radiation like #{paramMap.adrenal_metastasis_radiation}");
      map.put("adrenal_metastasis_radiation", "%" +  dto.getAdrenalMetastasisRadiation() + "%");
    }
    if (isNotEmpty(dto.getOtherMetastasisRadiation())) {
      sql.WHERE("e.other_metastasis_radiation like #{paramMap.other_metastasis_radiation}");
      map.put("other_metastasis_radiation", "%" +  dto.getOtherMetastasisRadiation() + "%");
    }
    if (isNotEmpty(dto.getCmdTimeSeq())) {
      sql.WHERE("e.cmd_time_seq like #{paramMap.cmd_time_seq}");
      map.put("cmd_time_seq", "%" +  dto.getCmdTimeSeq() + "%");
    }
    if (isNotEmpty(dto.getCmsTimeSeq())) {
      sql.WHERE("e.cms_time_seq like #{paramMap.cms_time_seq}");
      map.put("cms_time_seq", "%" +  dto.getCmsTimeSeq() + "%");
    }
    if (isNotEmpty(dto.getSideReaction())) {
      sql.WHERE("e.side_reaction like #{paramMap.side_reaction}");
      map.put("side_reaction", "%" +  dto.getSideReaction() + "%");
    }
    if (isNotEmpty(dto.getTki())) {
      sql.WHERE("e.tki = #{paramMap.tki}");
      map.put("tki", dto.getTki());
    }
    if (isNotEmpty(dto.getPlatinumDoublet())) {
      sql.WHERE("e.platinum_doublet = #{paramMap.platinum_doublet}");
      map.put("platinum_doublet", dto.getPlatinumDoublet());
    }
    if (isNotEmpty(dto.getGefitinib())) {
      sql.WHERE("e.gefitinib = #{paramMap.gefitinib}");
      map.put("gefitinib", dto.getGefitinib());
    }
    if (isNotEmpty(dto.getAngiostatin())) {
      sql.WHERE("e.angiostatin = #{paramMap.angiostatin}");
      map.put("angiostatin", dto.getAngiostatin());
    }
    if (isNotEmpty(dto.getIcotinib())) {
      sql.WHERE("e.icotinib = #{paramMap.icotinib}");
      map.put("icotinib", dto.getIcotinib());
    }
    if (isNotEmpty(dto.getHolisticTx1())) {
      sql.WHERE("e.holistic_tx1 like #{paramMap.holistic_tx1}");
      map.put("holistic_tx1", "%" +  dto.getHolisticTx1() + "%");
    }
    if (isNotEmpty(dto.getHolisticTx2())) {
      sql.WHERE("e.holistic_tx2 like #{paramMap.holistic_tx2}");
      map.put("holistic_tx2", "%" +  dto.getHolisticTx2() + "%");
    }
    if (isNotEmpty(dto.getHolisticTx3())) {
      sql.WHERE("e.holistic_tx3 like #{paramMap.holistic_tx3}");
      map.put("holistic_tx3", "%" +  dto.getHolisticTx3() + "%");
    }
    if (isNotEmpty(dto.getHolisticTx4())) {
      sql.WHERE("e.holistic_tx4 like #{paramMap.holistic_tx4}");
      map.put("holistic_tx4", "%" +  dto.getHolisticTx4() + "%");
    }
    if (isNotEmpty(dto.getHolisticTx5())) {
      sql.WHERE("e.holistic_tx5 like #{paramMap.holistic_tx5}");
      map.put("holistic_tx5", "%" +  dto.getHolisticTx5() + "%");
    }
    if (isNotEmpty(dto.getHolisticTx6())) {
      sql.WHERE("e.holistic_tx6 like #{paramMap.holistic_tx6}");
      map.put("holistic_tx6", "%" +  dto.getHolisticTx6() + "%");
    }
    if (isNotEmpty(dto.getHolisticTx7())) {
      sql.WHERE("e.holistic_tx7 like #{paramMap.holistic_tx7}");
      map.put("holistic_tx7", "%" +  dto.getHolisticTx7() + "%");
    }
    sql.ORDER_BY("p.created_at desc");
    sql.limit(page.getStartRow(), page.getPageSize());

    List<Map<String, Object>> list = commonMapper.queryList(sql.toString(), map);
    List<PatientListVo> result = new ArrayList<>();
    list.forEach(p -> result.add(PatientListVo.fromMap(p)));

    // 2.得到总数
    Long countInt = commonMapper.queryCount(sql.getCountSQL(), map);
    page.setTotalCount(countInt.intValue());

    return result;
  }

  @Transactional(rollbackFor = Exception.class)
  @Override
  public int save(PatientDto patientDto) {
    Patient patient = patientDto.toPatient();
    return baseMapper.insert(patient);
  }

  @Override
  public int del(Long id) {
    int rInt = baseMapper.deleteById(id);
    return rInt;
  }

  @Override
  public int delLogical(Long id) {
    Patient entity = new Patient();
    entity.setId(id);
    entity.setStatus("deleted");
    int rInt = baseMapper.updateById(entity);
    return rInt;
  }

  @Override
  public PatientDto selectById(Long id) {

    Patient patient = baseMapper.selectById(id);
//    Encounter encounter = encounterMapper.queryActiveEncounterByPatient(patient.getPatientId());

    PatientDto patientDto = new PatientDto();
    return patientDto.fromPatientEntity(patient);
  }

  @Transactional(rollbackFor = Exception.class)
  @Override
  public int update(PatientDto patientDto) {
    Patient p = patientDto.toPatient();
    return baseMapper.updateById(p);
  }

}
