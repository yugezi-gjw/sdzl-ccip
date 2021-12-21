package com.zivy009.demo.springbootshirodwz.services.treatcourse.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zivy009.demo.springbootshirodwz.persistence.dao.TreatCourseChestMapper;
import com.zivy009.demo.springbootshirodwz.persistence.dao.TreatCourseMapper;
import com.zivy009.demo.springbootshirodwz.persistence.model.TreatCourse;
import com.zivy009.demo.springbootshirodwz.persistence.model.TreatCourseChest;
import com.zivy009.demo.springbootshirodwz.persistence.tools.CommonMapper;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.dto.ChestDto;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.dto.TreatCourseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ChestServiceImpl extends ServiceImpl<TreatCourseChestMapper, TreatCourseChest> implements
    IChestService {

  @Autowired
  CommonMapper commonMapper;


  @Transactional(rollbackFor = Exception.class)
  @Override
  public int save(ChestDto chestDto) {
    TreatCourseChest entity = chestDto.toEntity();
    return baseMapper.insert(entity);
  }

  @Transactional(rollbackFor = Exception.class)
  @Override
  public int update(ChestDto treatCourseDto) {
    TreatCourseChest entity = treatCourseDto.toEntity();
    return baseMapper.updateById(entity);
  }

  @Override
  public ChestDto selectByTreatCourseId(String treatCourseId) {
    TreatCourseChest chest = baseMapper.queryByTreatCourseId(treatCourseId);
    return ChestDto.fromEntity(chest);
  }
}
