package com.zivy009.demo.springbootshirodwz.persistence.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zivy009.demo.springbootshirodwz.persistence.model.MultiPrimary;
import com.zivy009.demo.springbootshirodwz.persistence.model.TreatHistory;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface TreatHistoryMapper extends BaseMapper<TreatHistory> {
  @Update("UPDATE treat_history SET status = 'deleted' WHERE treat_course_id = #{treatCourseId}")
  void deleteByTreatCourseId(String treatCourseId);
  @Select("SELECT * FROM treat_history WHERE treat_course_id = #{treatCourseId} AND status = 'active' ORDER BY treat_type, created_at")
  List<TreatHistory> selectByTreatCourseId(String treatCourseId);
}