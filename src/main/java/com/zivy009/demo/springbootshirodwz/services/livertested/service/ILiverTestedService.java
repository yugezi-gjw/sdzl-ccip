package com.zivy009.demo.springbootshirodwz.services.livertested.service;

import com.zivy009.demo.springbootshirodwz.services.livertested.dto.LiverTestedDto;
import java.util.List;

public interface ILiverTestedService {
  int save(LiverTestedDto dto);
  int update(LiverTestedDto dto);
  LiverTestedDto selectById(Long id);
  List<LiverTestedDto> queryByTreatCourseId(String treatCourseId);
  int del(Long id);
}
