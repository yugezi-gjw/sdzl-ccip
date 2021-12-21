package com.zivy009.demo.springbootshirodwz.persistence.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zivy009.demo.springbootshirodwz.persistence.model.BloodTested;
import com.zivy009.demo.springbootshirodwz.persistence.model.TreatCourseChest;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TreatCourseChestMapper extends BaseMapper<TreatCourseChest> {
//  @Select("SELECT a.* FROM treat_course_chest a, treat_course b WHERE a.treat_course_id = b.treat_course_id AND b.patient_id = #{patientId} AND bodypart_code = 'chest'")
//  TreatCourseChest queryByPatientId(Long patientId);
    @Select("SELECT * FROM treat_course_chest where treat_course_id = #{treatCourseId}")
    TreatCourseChest queryByTreatCourseId(String treatCourseId);
}