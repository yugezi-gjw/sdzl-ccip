package com.zivy009.demo.springbootshirodwz.persistence.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zivy009.demo.springbootshirodwz.persistence.model.BillingItem;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BillingItemMapper extends BaseMapper<BillingItem> {
  @Select("SELECT * FROM billing_item where status = 'active'")
  List<BillingItem> queryActiveItems();
}