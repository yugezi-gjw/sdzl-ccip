package com.zivy009.demo.springbootshirodwz.services.patient.service;

import static org.apache.commons.lang3.StringUtils.isNotEmpty;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zivy009.demo.springbootshirodwz.common.PageHandler;
import com.zivy009.demo.springbootshirodwz.persistence.dao.EncounterMapper;
import com.zivy009.demo.springbootshirodwz.persistence.dao.PatientMapper;
import com.zivy009.demo.springbootshirodwz.persistence.model.Patient;
import com.zivy009.demo.springbootshirodwz.persistence.tools.CommonMapper;
import com.zivy009.demo.springbootshirodwz.persistence.tools.other.MysqlGenerateSQL;
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
        "p.*, e.*");
    sql.FROM(tableName);
    sql.LEFT_OUTER_JOIN("encounter e on p.id = e.patient_id");
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
  public PatientDto selectById(Integer id) {

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
