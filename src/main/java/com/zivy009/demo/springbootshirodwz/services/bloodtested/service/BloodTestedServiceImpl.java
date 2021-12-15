package com.zivy009.demo.springbootshirodwz.services.bloodtested.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zivy009.demo.springbootshirodwz.persistence.dao.BloodTestedMapper;
import com.zivy009.demo.springbootshirodwz.persistence.model.BloodTested;
import com.zivy009.demo.springbootshirodwz.persistence.tools.CommonMapper;
import com.zivy009.demo.springbootshirodwz.services.bloodtested.dto.BloodTestedDto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BloodTestedServiceImpl extends ServiceImpl<BloodTestedMapper, BloodTested> implements
    IBloodTestedService {

  @Autowired
  CommonMapper commonMapper;

  @Autowired
  BloodTestedMapper bloodTestedMapper;


  @Override
  public List<BloodTestedDto> queryByEncounterId(Long encounterId) {
    List<BloodTested> bloodTestedList = bloodTestedMapper.queryByEncounterId(encounterId);
    return BloodTestedDto.fromEntityList(bloodTestedList);
  }

  @Transactional(rollbackFor = Exception.class)
  @Override
  public int save(BloodTestedDto bloodTestedDto) {
    BloodTested entity = bloodTestedDto.toEntity();
    return baseMapper.insert(entity);
  }

  @Transactional(rollbackFor = Exception.class)
  @Override
  public int update(BloodTestedDto bloodTestedDto) {
    BloodTested entity = bloodTestedDto.toEntity();
    return baseMapper.updateById(entity);
  }

  @Override
  public BloodTestedDto selectById(Integer id) {
    BloodTested bloodTested = baseMapper.selectById(id);
    return BloodTestedDto.fromEntity(bloodTested);
  }

  @Override
  public int del(Long id) {
    int rInt = baseMapper.deleteById(id);
    return rInt;
  }
}
