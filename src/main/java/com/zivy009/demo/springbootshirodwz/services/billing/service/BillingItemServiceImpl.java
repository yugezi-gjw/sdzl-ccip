package com.zivy009.demo.springbootshirodwz.services.billing.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zivy009.demo.springbootshirodwz.persistence.dao.BillingItemMapper;
import com.zivy009.demo.springbootshirodwz.persistence.model.BillingItem;
import com.zivy009.demo.springbootshirodwz.persistence.tools.CommonMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BillingItemServiceImpl extends ServiceImpl<BillingItemMapper, BillingItem> implements IBillingItemService {

  @Autowired
  CommonMapper commonMapper;

  @Autowired
  BillingItemMapper billingItemMapper;

  String tableName = "billing_item bi";

  @Override
  public List<BillingItem> queryActiveItems() {
    return billingItemMapper.queryActiveItems();
  }
}
