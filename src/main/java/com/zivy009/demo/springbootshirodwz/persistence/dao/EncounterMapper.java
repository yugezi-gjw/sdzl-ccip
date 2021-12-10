package com.zivy009.demo.springbootshirodwz.persistence.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zivy009.demo.springbootshirodwz.persistence.model.Encounter;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EncounterMapper extends BaseMapper<Encounter> {
  @Select("SELECT * FROM encounter WHERE status = 'in_progress' AND patient_id = #{patientId}")
  Encounter queryActiveEncounterByPatient(Long patientId);
}