package com.zivy009.demo.springbootshirodwz.service.impl;

import static org.apache.commons.lang3.StringUtils.isNotEmpty;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zivy009.demo.springbootshirodwz.persistence.dao.PractitionerMapper;
import com.zivy009.demo.springbootshirodwz.persistence.dao.TechnicalMapper;
import com.zivy009.demo.springbootshirodwz.persistence.model.Practitioner;
import com.zivy009.demo.springbootshirodwz.persistence.model.Technical;
import com.zivy009.demo.springbootshirodwz.persistence.tools.CommonMapper;
import com.zivy009.demo.springbootshirodwz.persistence.tools.other.MysqlGenerateSQL;
import com.zivy009.demo.springbootshirodwz.service.IPractitionerService;
import com.zivy009.demo.springbootshirodwz.service.ITechnicalService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PractitionerService extends ServiceImpl<PractitionerMapper, Practitioner> implements
    IPractitionerService {

  @Autowired
  CommonMapper commonMapper;

  String tableName = "practitioner";

  @Transactional(readOnly = true)
  public List<Map<String, Object>> list(String role) {
    // 1.得到记录集
    Map<String,Object> map = new HashMap<String,Object>();
    MysqlGenerateSQL sql = new MysqlGenerateSQL();
    sql.SELECT("*");
    sql.FROM(tableName);
    sql.WHERE("status='active'");
    if (isNotEmpty(role)) {
      sql.WHERE("role = #{paramMap.role}");
      map.put("role", role);
    }

    List<Map<String, Object>> list =commonMapper.queryList(sql.toString(),map);

    return list;
  }
}
