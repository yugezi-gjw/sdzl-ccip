package com.zivy009.demo.springbootshirodwz.persistence.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zivy009.demo.springbootshirodwz.persistence.model.TreatCourse;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TreatCourseMapper extends BaseMapper<TreatCourse> {
  @Select("SELECT a.patient_id,a.treat_course_id,a.bodypart_code,b.bodypart FROM treat_course a, bodypart b WHERE a.bodypart_code = b.bodypart_code AND patient_id = #{patientId}")
  List<TreatCourse> selectByPatientId(Long patientId);
}