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
  public List<PatientDto> list(PageHandler page, String keyword) {
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
    List<PatientDto> result = new ArrayList<>();
    list.forEach(p -> result.add(PatientDto.fromMap(p)));

    // 2.得到总数
    Long countInt = commonMapper.queryCount(sql.getCountSQL(), map);
    page.setTotalCount(countInt.intValue());

    return result;
  }

  @Transactional(readOnly = true)
  @Override
  public List<PatientDto> list(PageHandler page, PatientAdvSearchDto dto) {
    // 1.得到记录集
    Map<String, Object> map = new HashMap<String, Object>();
    MysqlGenerateSQL sql = new MysqlGenerateSQL();

    if (dto.isSearchByChest()) {
      sql.SELECT("p.*");
      sql.FROM(tableName);
      sql.LEFT_OUTER_JOIN("treat_course tc on p.id = tc.patient_id");
      sql.LEFT_OUTER_JOIN("treat_course_chest tcc on tc.treat_course_id=tcc.treat_course_id");
      sql.WHERE("p.status!='deleted'");
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
    }
    else if (dto.isSearchByGalactophore()) {
      sql.SELECT("p.*");
      sql.FROM(tableName);
      sql.LEFT_OUTER_JOIN("treat_course tc on p.id = tc.patient_id");
      sql.LEFT_OUTER_JOIN("treat_course_galactophore tcg on tc.treat_course_id=tcg.treat_course_id");
      sql.WHERE("p.status!='deleted'");
      if (isNotEmpty(dto.getMenarcheAge())) {
        sql.WHERE("tcg.menarche_age = #{paramMap.menarche_age}");
        map.put("menarche_age", dto.getMenarcheAge());
      }
      if (isNotEmpty(dto.getAmenorrheaAge())) {
        sql.WHERE("tcg.amenorrhea_age = #{paramMap.amenorrhea_age}");
        map.put("amenorrhea_age", dto.getAmenorrheaAge());
      }
      if (isNotEmpty(dto.getMolecularSubtyping())) {
        sql.WHERE("tcg.molecular_subtyping like #{paramMap.molecular_subtyping}");
        map.put("molecular_subtyping", "%" + dto.getMolecularSubtyping() + "%");
      }
      if (isNotEmpty(dto.getEr())) {
        sql.WHERE("tcg.er like #{paramMap.er}");
        map.put("er", "%" + dto.getEr() + "%");
      }
      if (isNotEmpty(dto.getPr())) {
        sql.WHERE("tcg.pr like #{paramMap.pr}");
        map.put("pr", "%" + dto.getPr() + "%");
      }
      if (isNotEmpty(dto.getHer2())) {
        sql.WHERE("tcg.her2 like #{paramMap.her2}");
        map.put("her2", "%" + dto.getHer2() + "%");
      }
      if (isNotEmpty(dto.getKi67())) {
        sql.WHERE("tcg.ki67 like #{paramMap.ki67}");
        map.put("ki67", "%" + dto.getKi67() + "%");
      }
      if (isNotEmpty(dto.getSurgeryMode())) {
        sql.WHERE("tcg.surgery_mode like #{paramMap.surgery_mode}");
        map.put("surgery_mode", "%" + dto.getSurgeryMode() + "%");
      }
      if (isNotEmpty(dto.getFishAugmentation())) {
        sql.WHERE("tcg.fish_augmentation like #{paramMap.fish_augmentation}");
        map.put("fish_augmentation", "%" + dto.getFishAugmentation() + "%");
      }
      if (isNotEmpty(dto.getGeneticTest())) {
        sql.WHERE("tcg.genetic_test like #{paramMap.genetic_test}");
        map.put("genetic_test", "%" + dto.getGeneticTest() + "%");
      }
      if (isNotEmpty(dto.getSteepGrade())) {
        sql.WHERE("tcg.steep_grade like #{paramMap.steep_grade}");
        map.put("steep_grade", "%" + dto.getSteepGrade() + "%");
      }
      if (isNotEmpty(dto.getIsGalactophoreRadiation())) {
        sql.WHERE("tcg.is_galactophore_radiation = #{paramMap.is_galactophore_radiation}");
        map.put("is_galactophore_radiation", dto.getIsGalactophoreRadiation());
      }
      if (isNotEmpty(dto.getGalactophoreRadiation())) {
        sql.WHERE("tcg.galactophore_radiation like #{paramMap.galactophore_radiation}");
        map.put("galactophore_radiation", "%" + dto.getGalactophoreRadiation() + "%");
      }
      if (isNotEmpty(dto.getHer2Drug())) {
        sql.WHERE("tcg.her2_drug = #{paramMap.her2_drug}");
        map.put("her2_drug", dto.getHer2Drug());
      }
      if (isNotEmpty(dto.getIncretion())) {
        sql.WHERE("tcg.incretion = #{paramMap.incretion}");
        map.put("incretion", dto.getIncretion());
      }
      if (isNotEmpty(dto.getImmunized())) {
        sql.WHERE("tcg.immunized = #{paramMap.immunized}");
        map.put("immunized", dto.getImmunized());
      }
    }
    else {
      sql.SELECT("*");
      StringBuffer tmpSql = new StringBuffer("(select distinct tmp.id, tmp.inpatient_id, tmp.patient_name, tmp.gender, tmp.birth_date, tmp.national_id, tmp.telephone, tmp.telephone2, tmp.smoker, tmp.created_at from");
      tmpSql.append("(select p.* from patient p left join treat_course tc on p.id = tc.patient_id left join treat_course_chest tcc on tc.treat_course_id=tcc.treat_course_id where 1=1");

      if (isNotEmpty(dto.getStage())) {
        tmpSql.append(" and tcc.stage like '%").append(dto.getStage()).append("%'");
      }
      if (isNotEmpty(dto.getDiagnosisDt())) {
        tmpSql.append(" and tcc.diagnosis_dt = '").append(dto.getDiagnosisDt()).append("'");
      }
      if (isNotEmpty(dto.getDeathDt())) {
        tmpSql.append(" and tcc.death_dt = '").append(dto.getDeathDt()).append("'");
      }
      if (isNotEmpty(dto.getLastInpatientDt())) {
        tmpSql.append(" and tcc.last_inpatient_dt = '").append(dto.getLastInpatientDt()).append("'");
      }
      if (isNotEmpty(dto.getAccurateOs())) {
        tmpSql.append(" and tcc.accurate_os like '%").append(dto.getAccurateOs()).append("%'");
      }
      if (isNotEmpty(dto.getAlive())) {
        tmpSql.append(" and tcc.alive = '").append(dto.getAlive()).append("'");
      }
      if (isNotEmpty(dto.getProgressDt())) {
        tmpSql.append(" and tcc.progress_dt = '").append(dto.getProgressDt()).append("'");
      }
      if (isNotEmpty(dto.getDeliveredFraction())) {
        tmpSql.append(" and tcc.delivered_fraction = '").append(dto.getDeliveredFraction()).append("'");
      }
      if (isNotEmpty(dto.getMetastasisSites())) {
        tmpSql.append(" and tcc.metastasis_sites = '").append(dto.getMetastasisSites()).append("'");
      }
      if (isNotEmpty(dto.getIsMultiSites())) {
        tmpSql.append(" and tcc.is_multi_sites = '").append(dto.getIsMultiSites()).append("'");
      }
      if (isNotEmpty(dto.getIsBrainMetastases())) {
        tmpSql.append(" and tcc.is_brain_metastases = '").append(dto.getIsBrainMetastases()).append("'");
      }
      if (isNotEmpty(dto.getIsBrainRadiation())) {
        tmpSql.append(" and tcc.is_brain_radiation = '").append(dto.getIsBrainRadiation()).append("'");
      }
      if (isNotEmpty(dto.getBrainMetastasisRadiation())) {
        tmpSql.append(" and tcc.brain_metastasis_radiation like '%").append(dto.getAccurateOs()).append("%'");
      }
      if (isNotEmpty(dto.getIsBoneMetastases())) {
        tmpSql.append(" and tcc.is_bone_metastases = '").append(dto.getIsBoneMetastases()).append("'");
      }
      if (isNotEmpty(dto.getIsBoneRadiation())) {
        tmpSql.append(" and tcc.is_bone_radiation = '").append(dto.getIsBoneRadiation()).append("'");
      }
      if (isNotEmpty(dto.getBoneMetastasisRadiation())) {
        tmpSql.append(" and tcc.bone_metastasis_radiation like '%").append(dto.getBoneMetastasisRadiation()).append("%'");
      }
      if (isNotEmpty(dto.getAdrenalMetastasisRadiation())) {
        tmpSql.append(" and tcc.adrenal_metastasis_radiation like '%").append(dto.getAdrenalMetastasisRadiation()).append("%'");
      }
      if (isNotEmpty(dto.getOtherMetastasisRadiation())) {
        tmpSql.append(" and tcc.other_metastasis_radiation like '%").append(dto.getOtherMetastasisRadiation()).append("%'");
      }
      if (isNotEmpty(dto.getHolisticTx1())) {
        tmpSql.append(" and tcc.holistic_tx1 like '%").append(dto.getHolisticTx1()).append("%'");
      }
      if (isNotEmpty(dto.getHolisticTx2())) {
        tmpSql.append(" and tcc.holistic_tx2 like '%").append(dto.getHolisticTx2()).append("%'");
      }
      if (isNotEmpty(dto.getHolisticTx3())) {
        tmpSql.append(" and tcc.holistic_tx3 like '%").append(dto.getHolisticTx3()).append("%'");
      }
      if (isNotEmpty(dto.getHolisticTx4())) {
        tmpSql.append(" and tcc.holistic_tx4 like '%").append(dto.getHolisticTx4()).append("%'");
      }
      if (isNotEmpty(dto.getHolisticTx5())) {
        tmpSql.append(" and tcc.holistic_tx5 like '%").append(dto.getHolisticTx5()).append("%'");
      }
      if (isNotEmpty(dto.getHolisticTx6())) {
        tmpSql.append(" and tcc.holistic_tx6 like '%").append(dto.getHolisticTx6()).append("%'");
      }
      if (isNotEmpty(dto.getHolisticTx7())) {
        tmpSql.append(" and tcc.holistic_tx7 like '%").append(dto.getHolisticTx7()).append("%'");
      }
      tmpSql.append(" union all");
      tmpSql.append(" select p.* from patient p left join treat_course tc on p.id = tc.patient_id left join treat_course_galactophore tcg on tc.treat_course_id=tcg.treat_course_id where 1=1");
      if (isNotEmpty(dto.getStage())) {
        tmpSql.append(" and tcg.stage like '%").append(dto.getStage()).append("%'");
      }
      if (isNotEmpty(dto.getDiagnosisDt())) {
        tmpSql.append(" and tcg.diagnosis_dt = '").append(dto.getDiagnosisDt()).append("'");
      }
      if (isNotEmpty(dto.getDeathDt())) {
        tmpSql.append(" and tcg.death_dt = '").append(dto.getDeathDt()).append("'");
      }
      if (isNotEmpty(dto.getLastInpatientDt())) {
        tmpSql.append(" and tcg.last_inpatient_dt = '").append(dto.getLastInpatientDt()).append("'");
      }
      if (isNotEmpty(dto.getAccurateOs())) {
        tmpSql.append(" and tcg.accurate_os like '%").append(dto.getAccurateOs()).append("%'");
      }
      if (isNotEmpty(dto.getAlive())) {
        tmpSql.append(" and tcg.alive = '").append(dto.getAlive()).append("'");
      }
      if (isNotEmpty(dto.getProgressDt())) {
        tmpSql.append(" and tcg.progress_dt = '").append(dto.getProgressDt()).append("'");
      }
      if (isNotEmpty(dto.getDeliveredFraction())) {
        tmpSql.append(" and tcg.delivered_fraction = '").append(dto.getDeliveredFraction()).append("'");
      }
      if (isNotEmpty(dto.getMetastasisSites())) {
        tmpSql.append(" and tcg.metastasis_sites = '").append(dto.getMetastasisSites()).append("'");
      }
      if (isNotEmpty(dto.getIsMultiSites())) {
        tmpSql.append(" and tcg.is_multi_sites = '").append(dto.getIsMultiSites()).append("'");
      }
      if (isNotEmpty(dto.getIsBrainMetastases())) {
        tmpSql.append(" and tcg.is_brain_metastases = '").append(dto.getIsBrainMetastases()).append("'");
      }
      if (isNotEmpty(dto.getIsBrainRadiation())) {
        tmpSql.append(" and tcg.is_brain_radiation = '").append(dto.getIsBrainRadiation()).append("'");
      }
      if (isNotEmpty(dto.getBrainMetastasisRadiation())) {
        tmpSql.append(" and tcg.brain_metastasis_radiation like '%").append(dto.getAccurateOs()).append("%'");
      }
      if (isNotEmpty(dto.getIsBoneMetastases())) {
        tmpSql.append(" and tcg.is_bone_metastases = '").append(dto.getIsBoneMetastases()).append("'");
      }
      if (isNotEmpty(dto.getIsBoneRadiation())) {
        tmpSql.append(" and tcg.is_bone_radiation = '").append(dto.getIsBoneRadiation()).append("'");
      }
      if (isNotEmpty(dto.getBoneMetastasisRadiation())) {
        tmpSql.append(" and tcg.bone_metastasis_radiation like '%").append(dto.getBoneMetastasisRadiation()).append("%'");
      }
      if (isNotEmpty(dto.getAdrenalMetastasisRadiation())) {
        tmpSql.append(" and tcg.adrenal_metastasis_radiation like '%").append(dto.getAdrenalMetastasisRadiation()).append("%'");
      }
      if (isNotEmpty(dto.getOtherMetastasisRadiation())) {
        tmpSql.append(" and tcg.other_metastasis_radiation like '%").append(dto.getOtherMetastasisRadiation()).append("%'");
      }
      if (isNotEmpty(dto.getHolisticTx1())) {
        tmpSql.append(" and tcg.holistic_tx1 like '%").append(dto.getHolisticTx1()).append("%'");
      }
      if (isNotEmpty(dto.getHolisticTx2())) {
        tmpSql.append(" and tcg.holistic_tx2 like '%").append(dto.getHolisticTx2()).append("%'");
      }
      if (isNotEmpty(dto.getHolisticTx3())) {
        tmpSql.append(" and tcg.holistic_tx3 like '%").append(dto.getHolisticTx3()).append("%'");
      }
      if (isNotEmpty(dto.getHolisticTx4())) {
        tmpSql.append(" and tcg.holistic_tx4 like '%").append(dto.getHolisticTx4()).append("%'");
      }
      if (isNotEmpty(dto.getHolisticTx5())) {
        tmpSql.append(" and tcg.holistic_tx5 like '%").append(dto.getHolisticTx5()).append("%'");
      }
      if (isNotEmpty(dto.getHolisticTx6())) {
        tmpSql.append(" and tcg.holistic_tx6 like '%").append(dto.getHolisticTx6()).append("%'");
      }
      if (isNotEmpty(dto.getHolisticTx7())) {
        tmpSql.append(" and tcg.holistic_tx7 like '%").append(dto.getHolisticTx7()).append("%'");
      }

      tmpSql.append(" ) tmp) tmp2");
      sql.FROM(tmpSql.toString());
    }

    if (isNotEmpty(dto.getPatientName())) {
      sql.WHERE("patient_name like #{paramMap.patient_name}");
      map.put("patient_name", "%" + dto.getPatientName() + "%");
    }
    if (isNotEmpty(dto.getInpatientId())) {
      sql.WHERE("inpatient_id like #{paramMap.inpatient_id}");
      map.put("inpatient_id", "%" + dto.getInpatientId() + "%");
    }
    if (isNotEmpty(dto.getGender())) {
      sql.WHERE("gender = #{paramMap.gender}");
      map.put("gender", dto.getGender());
    }
    if (isNotEmpty(dto.getNationalId())) {
      sql.WHERE("national_id = #{paramMap.national_id}");
      map.put("national_id", dto.getNationalId());
    }

    sql.ORDER_BY("created_at desc");
    sql.limit(page.getStartRow(), page.getPageSize());

    List<Map<String, Object>> list = commonMapper.queryList(sql.toString(), map);
    List<PatientDto> result = new ArrayList<>();
    list.forEach(p -> result.add(PatientDto.fromMap(p)));

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
