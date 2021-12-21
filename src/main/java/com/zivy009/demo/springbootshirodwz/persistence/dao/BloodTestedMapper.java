package com.zivy009.demo.springbootshirodwz.persistence.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zivy009.demo.springbootshirodwz.persistence.model.BloodTested;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BloodTestedMapper extends BaseMapper<BloodTested> {
  @Select("SELECT * FROM blood_tested where treat_course_id = #{treatCourseId}")
  List<BloodTested> queryByTreatCourseId(String treatCourseId);
}