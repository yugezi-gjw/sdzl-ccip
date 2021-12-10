package com.zivy009.demo.springbootshirodwz.persistence.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zivy009.demo.springbootshirodwz.persistence.model.Encounter;
import com.zivy009.demo.springbootshirodwz.persistence.model.PatientBilling;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PatientBillingMapper extends BaseMapper<PatientBilling> {
//  @Select("SELECT pb.*, bi.name, bi. FROM patient_billing pb, encounter e, billing_item bi WHERE pb.encounter_id = e.id AND pb.billing_code = bi.code AND e.status = 'in_progress' AND e.patient_id = #{patientId}")
}