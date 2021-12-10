package com.zivy009.demo.springbootshirodwz.services.encounter.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zivy009.demo.springbootshirodwz.persistence.dao.EncounterMapper;
import com.zivy009.demo.springbootshirodwz.persistence.dao.PatientMapper;
import com.zivy009.demo.springbootshirodwz.persistence.model.Encounter;
import com.zivy009.demo.springbootshirodwz.persistence.model.Patient;
import com.zivy009.demo.springbootshirodwz.persistence.tools.CommonMapper;
import com.zivy009.demo.springbootshirodwz.services.encounter.dto.EncounterDto;
import com.zivy009.demo.springbootshirodwz.services.patient.dto.PatientDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EncounterServiceImpl extends ServiceImpl<EncounterMapper, Encounter> implements
    IEncounterService {

  @Autowired
  CommonMapper commonMapper;

  @Autowired
  EncounterMapper encounterMapper;

  @Autowired
  PatientMapper patientMapper;

  String tableName = "encounter e";

  @Override
  public EncounterDto queryActiveEncounterByPatient(Long patientId) {
    Encounter encounter = encounterMapper.queryActiveEncounterByPatient(patientId);
    return EncounterDto.fromEntity(encounter);
  }

  @Transactional(rollbackFor = Exception.class)
  @Override
  public int save(EncounterDto encounterDto) {
    Encounter encounter = encounterDto.toEntity();
    return baseMapper.insert(encounter);
  }

  @Transactional(rollbackFor = Exception.class)
  @Override
  public int update(EncounterDto encounterDto) {
    Encounter encounter = encounterDto.toEntity();
    return baseMapper.updateById(encounter);
  }

  @Override
  public EncounterDto selectById(Integer id) {

    Encounter encounter = baseMapper.selectById(id);
    return EncounterDto.fromEntity(encounter);
  }
}
