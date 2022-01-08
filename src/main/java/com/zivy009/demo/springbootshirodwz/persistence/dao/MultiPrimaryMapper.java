package com.zivy009.demo.springbootshirodwz.persistence.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zivy009.demo.springbootshirodwz.persistence.model.MultiPrimary;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MultiPrimaryMapper extends BaseMapper<MultiPrimary> {
  @Update("UPDATE multi_primary SET status = 'deleted' WHERE treat_course_id = #{treatCourseId}")
  void deleteByTreatCourseId(String treatCourseId);
  @Select("SELECT * FROM multi_primary WHERE treat_course_id = #{treatCourseId} AND status = 'active'")
  List<MultiPrimary> selectByTreatCourseId(String treatCourseId);
}