package com.zivy009.demo.springbootshirodwz.services.patient.service;

import com.baomidou.mybatisplus.service.IService;
import com.zivy009.demo.springbootshirodwz.common.PageHandler;
import com.zivy009.demo.springbootshirodwz.persistence.model.Patient;
import com.zivy009.demo.springbootshirodwz.services.patient.dto.PatientAdvSearchDto;
import com.zivy009.demo.springbootshirodwz.services.patient.dto.PatientDto;
import com.zivy009.demo.springbootshirodwz.services.patient.vo.PatientListVo;
import java.util.List;

public interface IPatientService extends IService<Patient> {
  List<PatientListVo> list(PageHandler page, String keyword);
  List<PatientListVo> list(PageHandler page, PatientAdvSearchDto dto);
  int save(PatientDto patientDto);
  int delLogical(Long id);
  int del(Long id);
  PatientDto selectById(Integer id);
  int update(PatientDto patientDto);
}
