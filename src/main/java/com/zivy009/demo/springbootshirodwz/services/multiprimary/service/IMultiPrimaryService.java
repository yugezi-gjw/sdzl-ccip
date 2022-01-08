package com.zivy009.demo.springbootshirodwz.services.multiprimary.service;

import com.zivy009.demo.springbootshirodwz.services.multiprimary.dto.MultiPrimaryDto;
import java.util.List;

public interface IMultiPrimaryService {
  int save(MultiPrimaryDto dto);
  int update(MultiPrimaryDto dto);
  void deleteByTreatCourseId(String treatCourseId);
  List<MultiPrimaryDto> selectByTreatCourseId(String treatCourseId);
}
