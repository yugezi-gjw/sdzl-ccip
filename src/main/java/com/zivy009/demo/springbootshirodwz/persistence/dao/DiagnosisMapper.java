package com.zivy009.demo.springbootshirodwz.persistence.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zivy009.demo.springbootshirodwz.persistence.model.Diagnosis;
import com.zivy009.demo.springbootshirodwz.persistence.model.Prescription;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DiagnosisMapper extends BaseMapper<Diagnosis> {

}