package com.zivy009.demo.springbootshirodwz.persistence.model;

import com.baomidou.mybatisplus.annotations.TableField;
import java.util.Date;
public class CommonHis extends BaseId {
  @TableField("created_at")
  private Date createdAt;

  @TableField("created_by")
  private String createdBy;

  @TableField("updated_at")
  private Date updatedAt;

  @TableField("updated_by")
  private String updatedBy;

  @TableField("deleted_by")
  private String deletedBy;

  @TableField("deleted_at")
  private Date deletedAt;
}
