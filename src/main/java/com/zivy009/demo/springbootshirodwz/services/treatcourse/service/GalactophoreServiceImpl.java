package com.zivy009.demo.springbootshirodwz.services.treatcourse.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zivy009.demo.springbootshirodwz.persistence.dao.TreatCourseChestMapper;
import com.zivy009.demo.springbootshirodwz.persistence.dao.TreatCourseGalactophoreMapper;
import com.zivy009.demo.springbootshirodwz.persistence.model.TreatCourseChest;
import com.zivy009.demo.springbootshirodwz.persistence.model.TreatCourseGalactophore;
import com.zivy009.demo.springbootshirodwz.persistence.tools.CommonMapper;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.dto.ChestDto;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.dto.GalactophoreDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GalactophoreServiceImpl extends ServiceImpl<TreatCourseGalactophoreMapper, TreatCourseGalactophore> implements
    IGalactophoreService {

  @Autowired
  CommonMapper commonMapper;


  @Transactional(rollbackFor = Exception.class)
  @Override
  public int save(GalactophoreDto dto) {
    TreatCourseGalactophore entity = dto.toEntity();
    return baseMapper.insert(entity);
  }

  @Transactional(rollbackFor = Exception.class)
  @Override
  public int update(GalactophoreDto dto) {
    TreatCourseGalactophore entity = dto.toEntity();
    return baseMapper.updateById(entity);
  }

  @Override
  public GalactophoreDto selectByTreatCourseId(String treatCourseId) {
    TreatCourseGalactophore entity = baseMapper.queryByTreatCourseId(treatCourseId);
    return GalactophoreDto.fromEntity(entity);
  }
}
