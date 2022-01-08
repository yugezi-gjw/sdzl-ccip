package com.zivy009.demo.springbootshirodwz.services.treathistory.service;

import com.zivy009.demo.springbootshirodwz.services.treathistory.dto.TreatHistoryDto;
import java.util.List;

public interface ITreatHistoryService {
  int save(TreatHistoryDto dto);
  int update(TreatHistoryDto dto);
  void deleteByTreatCourseId(String treatCourseId);
  List<TreatHistoryDto> selectByTreatCourseId(String treatCourseId);
}
