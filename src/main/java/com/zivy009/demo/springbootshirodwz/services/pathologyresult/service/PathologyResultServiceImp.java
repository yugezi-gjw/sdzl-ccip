package com.zivy009.demo.springbootshirodwz.services.pathologyresult.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zivy009.demo.springbootshirodwz.persistence.dao.PathologyResultMapper;
import com.zivy009.demo.springbootshirodwz.persistence.model.PathologyResult;
import com.zivy009.demo.springbootshirodwz.services.pathologyresult.dto.PathologyResultDto;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PathologyResultServiceImp extends ServiceImpl<PathologyResultMapper, PathologyResult> implements IPathologyResultService {

  @Autowired
  PathologyResultMapper commonMapper;

  @Transactional
  @Override
  public int save(PathologyResultDto dto) {
    PathologyResult entity = dto.toEntity();
    return baseMapper.insert(entity);
  }

  @Override
  public int del(Long id) {
    PathologyResult entity = baseMapper.selectById(id);
    entity.setStatus("inactive");
    entity.setUpdatedAt(new Date());
    return baseMapper.updateById(entity);
  }

  @Override
  public int update(PathologyResultDto dto) {
    PathologyResult entity = dto.toEntity();
    return baseMapper.updateById(entity);
  }

  @Override
  public List<PathologyResultDto> queryByTreatCourseId(String treatCourseId) {
    List<PathologyResult> list = commonMapper.queryByTreatCourseId(treatCourseId);
    return PathologyResultDto.fromEntityList(list);
  }
}
