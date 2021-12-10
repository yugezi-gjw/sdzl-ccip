package com.zivy009.demo.springbootshirodwz.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zivy009.demo.springbootshirodwz.persistence.dao.PrescriptionMapper;
import com.zivy009.demo.springbootshirodwz.persistence.dao.TechnicalMapper;
import com.zivy009.demo.springbootshirodwz.persistence.model.Prescription;
import com.zivy009.demo.springbootshirodwz.persistence.model.Technical;
import com.zivy009.demo.springbootshirodwz.persistence.tools.CommonMapper;
import com.zivy009.demo.springbootshirodwz.persistence.tools.other.MysqlGenerateSQL;
import com.zivy009.demo.springbootshirodwz.service.IPrescriptionService;
import com.zivy009.demo.springbootshirodwz.service.ITechnicalService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PrescriptionService extends ServiceImpl<PrescriptionMapper, Prescription> implements
    IPrescriptionService {

  @Autowired
  CommonMapper commonMapper;

  String tableName = "prescription";

  @Transactional(readOnly = true)
  public List<Map<String, Object>> list() {
    // 1.得到记录集
    Map<String,Object> map = new HashMap<String,Object>();
    MysqlGenerateSQL sql = new MysqlGenerateSQL();
    sql.SELECT("*");
    sql.FROM(tableName);
    sql.WHERE("1=1");

    List<Map<String, Object>> list =commonMapper.queryList(sql.toString(),map);

    return list;
  }
}
