package com.zivy009.demo.springbootshirodwz.services.treatcourse.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zivy009.demo.springbootshirodwz.persistence.dao.TreatCourseMapper;
import com.zivy009.demo.springbootshirodwz.persistence.model.BloodTested;
import com.zivy009.demo.springbootshirodwz.persistence.model.TreatCourse;
import com.zivy009.demo.springbootshirodwz.persistence.tools.CommonMapper;
import com.zivy009.demo.springbootshirodwz.services.bloodtested.dto.BloodTestedDto;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.dto.TreatCourseDto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TreatCourseServiceImpl extends ServiceImpl<TreatCourseMapper, TreatCourse> implements
    ITreatCourseService {

  @Autowired
  CommonMapper commonMapper;

  @Autowired
  TreatCourseMapper treatCourseMapper;


  @Transactional(rollbackFor = Exception.class)
  @Override
  public int save(TreatCourseDto treatCourseDto) {
    TreatCourse entity = treatCourseDto.toEntity();
    return baseMapper.insert(entity);
  }

  @Transactional(rollbackFor = Exception.class)
  @Override
  public int update(TreatCourseDto treatCourseDto) {
    TreatCourse entity = treatCourseDto.toEntity();
    return baseMapper.updateById(entity);
  }

  @Override
  public TreatCourseDto selectById(Long id) {
    TreatCourse treatCourse = baseMapper.selectById(id);
    return TreatCourseDto.fromEntity(treatCourse);
  }

  @Override
  public TreatCourseDto selectByTreatCourseId(String treatCourseId) {
    TreatCourse treatCourse = baseMapper.selectByTreatCourseId(treatCourseId);
    return TreatCourseDto.fromEntity(treatCourse);
  }

  @Override
  public int del(Long id) {
    int rInt = baseMapper.deleteById(id);
    return rInt;
  }

  @Override
  public List<TreatCourseDto> selectByPatientId(Long patientId) {
    List<TreatCourse> treatCourseList = baseMapper.selectByPatientId(patientId);
    return TreatCourseDto.fromEntityList(treatCourseList);
  }


}
