package com.zivy009.demo.springbootshirodwz.services.encounter.service;

import com.baomidou.mybatisplus.service.IService;
import com.zivy009.demo.springbootshirodwz.persistence.model.Encounter;
import com.zivy009.demo.springbootshirodwz.services.encounter.dto.EncounterDto;

public interface IEncounterService extends IService<Encounter> {
  int save(EncounterDto encounterDto);
  int update(EncounterDto encounterDto);
  EncounterDto selectById(Integer id);
  EncounterDto queryActiveEncounterByPatient(Long patientId);
}
