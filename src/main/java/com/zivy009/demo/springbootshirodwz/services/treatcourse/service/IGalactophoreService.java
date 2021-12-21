package com.zivy009.demo.springbootshirodwz.services.treatcourse.service;

import com.zivy009.demo.springbootshirodwz.services.treatcourse.dto.GalactophoreDto;

public interface IGalactophoreService {
  int save(GalactophoreDto dto);
  int update(GalactophoreDto dto);
  GalactophoreDto selectByTreatCourseId(String treatCourseId);
}
