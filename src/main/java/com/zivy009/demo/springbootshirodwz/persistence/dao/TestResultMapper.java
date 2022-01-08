package com.zivy009.demo.springbootshirodwz.persistence.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zivy009.demo.springbootshirodwz.persistence.model.BloodTested;
import com.zivy009.demo.springbootshirodwz.persistence.model.TestResult;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TestResultMapper extends BaseMapper<TestResult> {
  @Select("SELECT * FROM test_result where treat_course_id = #{treatCourseId} AND status = 'active'")
  List<TestResult> queryByTreatCourseId(String treatCourseId);
}