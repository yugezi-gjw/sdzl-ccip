package com.zivy009.demo.springbootshirodwz.services.bloodtested.service;

import com.zivy009.demo.springbootshirodwz.services.bloodtested.dto.BloodTestedDto;
import java.util.List;

public interface IBloodTestedService {
  int save(BloodTestedDto bloodTestedDto);
  int update(BloodTestedDto bloodTestedDto);
  BloodTestedDto selectById(Integer id);
  List<BloodTestedDto> queryByEncounterId(Long encounterId);
  int del(Long id);
}
