package com.zivy009.demo.springbootshirodwz.services.billing.service;

import com.baomidou.mybatisplus.service.IService;
import com.zivy009.demo.springbootshirodwz.persistence.model.BillingItem;
import java.util.List;
import org.apache.ibatis.annotations.Select;

public interface IBillingItemService extends IService<BillingItem> {
  List<BillingItem> queryActiveItems();
}
