package com.zivy009.demo.springbootshirodwz.persistence.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import java.io.Serializable;

@TableName("prescription")
public class Prescription extends Model<Prescription> implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * 处方
   */
  @TableId(value="id", type= IdType.AUTO)
  private Long id;

  @TableField("prescription_code")
  private String prescriptionCode;

  @TableField("prescription_desc")
  private String prescriptionDesc;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getPrescriptionCode() {
    return prescriptionCode;
  }

  public void setPrescriptionCode(String prescriptionCode) {
    this.prescriptionCode = prescriptionCode;
  }

  public String getPrescriptionDesc() {
    return prescriptionDesc;
  }

  public void setPrescriptionDesc(String prescriptionDesc) {
    this.prescriptionDesc = prescriptionDesc;
  }

  @Override
  protected Serializable pkVal() {
    return this.id;
  }
}
