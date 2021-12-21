package com.zivy009.demo.springbootshirodwz.services.treatcourse.service;

import com.zivy009.demo.springbootshirodwz.services.treatcourse.dto.ChestDto;

public interface IChestService {
  int save(ChestDto chestDto);
  int update(ChestDto chestDto);
  ChestDto selectByTreatCourseId(String treatCourseId);
}
