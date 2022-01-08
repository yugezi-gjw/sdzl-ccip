package com.zivy009.demo.springbootshirodwz.services.multiprimary.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zivy009.demo.springbootshirodwz.persistence.dao.MultiPrimaryMapper;
import com.zivy009.demo.springbootshirodwz.persistence.model.MultiPrimary;
import com.zivy009.demo.springbootshirodwz.services.multiprimary.dto.MultiPrimaryDto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MultiPrimaryServiceImpl extends
    ServiceImpl<MultiPrimaryMapper, MultiPrimary> implements IMultiPrimaryService {

  @Autowired
  MultiPrimaryMapper commonMapper;

  @Transactional(rollbackFor = Exception.class)
  @Override
  public int save(MultiPrimaryDto dto) {
    MultiPrimary entity = dto.toEntity();
    return baseMapper.insert(entity);
  }

  @Transactional(rollbackFor = Exception.class)
  @Override
  public int update(MultiPrimaryDto dto) {
    MultiPrimary entity = dto.toEntity();
    return baseMapper.updateById(entity);
  }

  @Transactional(rollbackFor = Exception.class)
  @Override
  public void deleteByTreatCourseId(String treatCourseId) {
    commonMapper.deleteByTreatCourseId(treatCourseId);
  }

  @Override
  public List<MultiPrimaryDto> selectByTreatCourseId(String treatCourseId) {
    List<MultiPrimary> entityList = commonMapper.selectByTreatCourseId(treatCourseId);
    return MultiPrimaryDto.fromEntityList(entityList);
  }
}
