package com.zivy009.demo.springbootshirodwz.services.testresult.service;

import com.zivy009.demo.springbootshirodwz.services.testresult.dto.TestResultDto;
import java.util.List;

public interface ITestResultService {
  int save(TestResultDto dto);
  int del(Long id);
  int update(TestResultDto dto);
  List<TestResultDto> queryByTreatCourseId(String treatCourseId);
}
