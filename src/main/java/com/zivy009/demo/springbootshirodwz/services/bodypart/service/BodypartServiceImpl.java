package com.zivy009.demo.springbootshirodwz.services.bodypart.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zivy009.demo.springbootshirodwz.persistence.dao.BodypartMapper;
import com.zivy009.demo.springbootshirodwz.persistence.model.Bodypart;
import com.zivy009.demo.springbootshirodwz.services.bodypart.dto.BodypartDto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BodypartServiceImpl extends ServiceImpl<BodypartMapper, Bodypart> implements
    IBodypartService {

  @Autowired
  BodypartMapper bodypartMapper;

  @Transactional(rollbackFor = Exception.class)
  @Override
  public List<BodypartDto> list() {
    List<Bodypart> list = bodypartMapper.selectAll();
    return BodypartDto.fromEntityList(list);
  }

  @Override
  public BodypartDto selectByCode(String code) {
    Bodypart entity = bodypartMapper.selectByCode(code);
    return BodypartDto.fromEntity(entity);
  }

}
