package com.zivy009.demo.springbootshirodwz.services.treathistory.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zivy009.demo.springbootshirodwz.persistence.dao.MultiPrimaryMapper;
import com.zivy009.demo.springbootshirodwz.persistence.dao.TreatHistoryMapper;
import com.zivy009.demo.springbootshirodwz.persistence.model.TreatHistory;
import com.zivy009.demo.springbootshirodwz.services.treathistory.dto.TreatHistoryDto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TreatHistoryServiceImpl extends
    ServiceImpl<TreatHistoryMapper, TreatHistory> implements ITreatHistoryService {

  @Autowired
  TreatHistoryMapper commonMapper;

  @Transactional(rollbackFor = Exception.class)
  @Override
  public int save(TreatHistoryDto dto) {
    TreatHistory entity = dto.toEntity();
    return baseMapper.insert(entity);
  }

  @Transactional(rollbackFor = Exception.class)
  @Override
  public int update(TreatHistoryDto dto) {
    TreatHistory entity = dto.toEntity();
    return baseMapper.updateById(entity);
  }

  @Transactional(rollbackFor = Exception.class)
  @Override
  public void deleteByTreatCourseId(String treatCourseId) {
    commonMapper.deleteByTreatCourseId(treatCourseId);
  }

  @Override
  public List<TreatHistoryDto> selectByTreatCourseId(String treatCourseId) {
    List<TreatHistory> entityList = commonMapper.selectByTreatCourseId(treatCourseId);
    return TreatHistoryDto.fromEntityList(entityList);
  }
}
