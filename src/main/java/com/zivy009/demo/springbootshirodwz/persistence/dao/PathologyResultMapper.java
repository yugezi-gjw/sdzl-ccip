package com.zivy009.demo.springbootshirodwz.persistence.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zivy009.demo.springbootshirodwz.persistence.model.PathologyResult;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PathologyResultMapper extends BaseMapper<PathologyResult> {

  @Select("SELECT * FROM pathology_result where treat_course_id = #{treatCourseId} AND status = 'active'")
  List<PathologyResult> queryByTreatCourseId(String treatCourseId);

}