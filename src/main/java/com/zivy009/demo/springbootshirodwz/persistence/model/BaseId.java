package com.zivy009.demo.springbootshirodwz.persistence.model;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;

public class BaseId {

  @TableId(value="id", type= IdType.AUTO)
  private Long id;
}
