package com.zivy009.demo.springbootshirodwz.services.bloodtested.service;

import com.zivy009.demo.springbootshirodwz.services.bloodtested.dto.BloodTestedDto;
import java.util.List;

public interface IBloodTestedService {
  int save(BloodTestedDto bloodTestedDto);
  int update(BloodTestedDto bloodTestedDto);
  BloodTestedDto selectById(Long id);
  List<BloodTestedDto> queryByTreatCourseId(String treatCourseId);
  int del(Long id);
}
