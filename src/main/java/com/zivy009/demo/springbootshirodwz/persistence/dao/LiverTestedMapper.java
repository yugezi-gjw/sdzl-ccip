package com.zivy009.demo.springbootshirodwz.persistence.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zivy009.demo.springbootshirodwz.persistence.model.LiverTested;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LiverTestedMapper extends BaseMapper<LiverTested> {
  @Select("SELECT * FROM liver_tested where treat_course_id = #{treatCourseId} AND status = 'active'")
  List<LiverTested> queryByTreatCourseId(String treatCourseId);
}