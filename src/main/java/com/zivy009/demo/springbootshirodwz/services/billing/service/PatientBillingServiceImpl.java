package com.zivy009.demo.springbootshirodwz.services.billing.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zivy009.demo.springbootshirodwz.common.PageHandler;
import com.zivy009.demo.springbootshirodwz.persistence.dao.PatientBillingMapper;
import com.zivy009.demo.springbootshirodwz.persistence.model.PatientBilling;
import com.zivy009.demo.springbootshirodwz.persistence.tools.CommonMapper;
import com.zivy009.demo.springbootshirodwz.persistence.tools.other.MysqlGenerateSQL;
import com.zivy009.demo.springbootshirodwz.services.billing.dto.PatientBillingDto;
import com.zivy009.demo.springbootshirodwz.services.patient.service.IPatientService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PatientBillingServiceImpl extends ServiceImpl<PatientBillingMapper, PatientBilling> implements
    IBillingService {

  @Autowired
  CommonMapper commonMapper;
  @Autowired
  IPatientService patientService;

  String tableName = "patient_billing pb";

  @Transactional(readOnly = true)
  public List<PatientBillingDto> list(PageHandler page, String patientId) {
    // 1.得到记录集
    Map<String, Object> map = new HashMap<String, Object>();
    MysqlGenerateSQL sql = new MysqlGenerateSQL();
    sql.SELECT(
        "pb.*, bi.name billing_name, bi.unit, bi.price");
    sql.FROM(tableName);
    sql.JOIN("encounter e on pb.encounter_id = e.id");
    sql.JOIN("billing_item bi on bi.code = pb.billing_code");
    sql.WHERE("e.status = 'in_progress'");
    sql.WHERE("e.patient_id = #{paramMap.patient_id}");
    map.put("patient_id", patientId);
    sql.ORDER_BY("created_at");
    sql.limit(page.getStartRow(), page.getPageSize());

    List<Map<String, Object>> list = commonMapper.queryList(sql.toString(), map);
    List<PatientBillingDto> result = new ArrayList<>();
    list.forEach(p -> result.add(PatientBillingDto.fromMap(p)));

    // 2.得到总数
    Long countInt = commonMapper.queryCount(sql.getCountSQL(), map);
    page.setTotalCount(countInt.intValue());

    return result;
  }

  @Transactional(readOnly = true)
  public List<PatientBillingDto> list(String patientId) {
    // 1.得到记录集
    Map<String, Object> map = new HashMap<String, Object>();
    MysqlGenerateSQL sql = new MysqlGenerateSQL();
    sql.SELECT(
        "pb.*, bi.name billing_name, bi.unit, bi.price");
    sql.FROM(tableName);
    sql.JOIN("encounter e on pb.encounter_id = e.id");
    sql.JOIN("billing_item bi on bi.code = pb.billing_code");
    sql.WHERE("e.status = 'in_progress'");
    sql.WHERE("e.patient_id = #{paramMap.patient_id}");
    sql.WHERE("pb.status != 'deleted'");
    map.put("patient_id", patientId);
    sql.ORDER_BY("created_at");

    List<Map<String, Object>> list = commonMapper.queryList(sql.toString(), map);
    List<PatientBillingDto> result = new ArrayList<>();
    list.forEach(p -> result.add(PatientBillingDto.fromMap(p)));

    return result;
  }

  @Transactional(rollbackFor = Exception.class)
  public int save(PatientBillingDto patientBillingDto) {
    return baseMapper.insert(patientBillingDto.toEntity());
  }

  public int delLogical(Long id) {
    PatientBilling entity = new PatientBilling();
    entity.setId(id);
    entity.setStatus("deleted");
    int rInt = baseMapper.updateById(entity);
    return rInt;
  }


}
