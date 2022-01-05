package com.zivy009.demo.springbootshirodwz.services.treatcourse.service;

import com.zivy009.demo.springbootshirodwz.services.impexp.dto.ChestPatientExcelDto;
import com.zivy009.demo.springbootshirodwz.services.patient.dto.PatientAdvSearchDto;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.dto.ChestDto;
import java.util.List;

public interface IChestService {
  int save(ChestDto chestDto);
  int update(ChestDto chestDto);
  ChestDto selectByTreatCourseId(String treatCourseId);

  List<ChestPatientExcelDto> list(PatientAdvSearchDto dto);
}
