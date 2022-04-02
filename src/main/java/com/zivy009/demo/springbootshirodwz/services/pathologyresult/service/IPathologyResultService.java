package com.zivy009.demo.springbootshirodwz.services.pathologyresult.service;

import com.zivy009.demo.springbootshirodwz.services.pathologyresult.dto.PathologyResultDto;
import java.util.List;

public interface IPathologyResultService {
  int save(PathologyResultDto dto);
  int del(Long id);
  int update(PathologyResultDto dto);
  List<PathologyResultDto> queryByTreatCourseId(String treatCourseId);
}
