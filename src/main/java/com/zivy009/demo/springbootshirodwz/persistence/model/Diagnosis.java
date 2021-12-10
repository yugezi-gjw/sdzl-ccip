package com.zivy009.demo.springbootshirodwz.persistence.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import java.io.Serializable;

@TableName("diagnosis")
public class Diagnosis extends Model<Diagnosis> implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * 诊断
   */
  @TableId(value="id", type= IdType.AUTO)
  private Long id;

  @TableField("diagnosis_code")
  private String diagnosisCode;

  @TableField("diagnosis_desc")
  private String diagnosisDesc;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDiagnosisCode() {
    return diagnosisCode;
  }

  public void setDiagnosisCode(String diagnosisCode) {
    this.diagnosisCode = diagnosisCode;
  }

  public String getDiagnosisDesc() {
    return diagnosisDesc;
  }

  public void setDiagnosisDesc(String diagnosisDesc) {
    this.diagnosisDesc = diagnosisDesc;
  }

  @Override
  protected Serializable pkVal() {
    return this.id;
  }
}
