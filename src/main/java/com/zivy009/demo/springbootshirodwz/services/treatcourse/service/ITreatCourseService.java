package com.zivy009.demo.springbootshirodwz.services.treatcourse.service;

import com.zivy009.demo.springbootshirodwz.services.treatcourse.dto.TreatCourseDto;
import java.util.List;

public interface ITreatCourseService {
  int save(TreatCourseDto treatCourseDto);
  int update(TreatCourseDto treatCourseDto);
  TreatCourseDto selectById(Long id);
  int del(Long id);
  List<TreatCourseDto> selectByPatientId(Long patientId);
}
