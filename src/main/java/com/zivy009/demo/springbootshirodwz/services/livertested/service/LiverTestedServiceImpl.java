package com.zivy009.demo.springbootshirodwz.services.livertested.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zivy009.demo.springbootshirodwz.persistence.dao.LiverTestedMapper;
import com.zivy009.demo.springbootshirodwz.persistence.model.LiverTested;
import com.zivy009.demo.springbootshirodwz.services.livertested.dto.LiverTestedDto;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LiverTestedServiceImpl extends ServiceImpl<LiverTestedMapper, LiverTested> implements ILiverTestedService {
  @Autowired
  private LiverTestedMapper liverTestedMapper;

  @Override
  public int save(LiverTestedDto dto) {
    LiverTested entity = dto.toEntity();
    if (StringUtils.isEmpty(entity.getStatus())) {
      entity.setStatus("active");
    }
    return liverTestedMapper.insert(entity);
  }

  @Override
  public int update(LiverTestedDto dto) {
    LiverTested entity = dto.toEntity();
    return liverTestedMapper.updateById(entity);
  }

  @Override
  public LiverTestedDto selectById(Long id) {
    LiverTested entity = liverTestedMapper.selectById(id);
    return LiverTestedDto.fromEntity(entity);
  }

  @Override
  public List<LiverTestedDto> queryByTreatCourseId(String treatCourseId) {
    List<LiverTested> list = liverTestedMapper.queryByTreatCourseId(treatCourseId);
    return LiverTestedDto.fromEntityList(list);
  }

  @Override
  public int del(Long id) {
    LiverTested entity = liverTestedMapper.selectById(id);
    entity.setStatus("inactive");
    entity.setUpdatedAt(new Date());
    return liverTestedMapper.updateById(entity);
  }
}
