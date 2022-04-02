package com.zivy009.demo.springbootshirodwz.services.testresult.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zivy009.demo.springbootshirodwz.persistence.dao.TestResultMapper;
import com.zivy009.demo.springbootshirodwz.persistence.model.TestResult;
import com.zivy009.demo.springbootshirodwz.services.testresult.dto.TestResultDto;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TestResultServiceImpl extends ServiceImpl<TestResultMapper, TestResult> implements
    ITestResultService {

  @Autowired
  TestResultMapper commonMapper;

  @Override
  public List<TestResultDto> queryByTreatCourseId(String treatCourseId) {
    List<TestResult> bloodTestedList = commonMapper.queryByTreatCourseId(treatCourseId);
    return TestResultDto.fromEntityList(bloodTestedList);
  }

  @Transactional(rollbackFor = Exception.class)
  @Override
  public int save(TestResultDto dto) {
    TestResult entity = dto.toEntity();
    return baseMapper.insert(entity);
  }

  @Override
  public int del(Long id) {
    TestResult entity = baseMapper.selectById(id);
    entity.setStatus("inactive");
    entity.setUpdatedAt(new Date());
    return baseMapper.updateById(entity);
  }

  @Override
  public int update(TestResultDto dto) {
    TestResult entity = dto.toEntity();
    return baseMapper.updateById(entity);
  }

}
