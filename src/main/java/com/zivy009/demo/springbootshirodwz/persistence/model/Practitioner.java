package com.zivy009.demo.springbootshirodwz.persistence.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import java.io.Serializable;

@TableName("practitioner")
public class Practitioner extends Model<Practitioner> implements Serializable {

  private static final long serialVersionUID = 1L;

  @TableId(value="id", type= IdType.AUTO)
  private Long id;

  @TableField("practitioner_id")
  private String practitionerId;

  @TableField("practitioner_name")
  private String practitionerName;

  /**
   * Doctor/Physicist
   */
  private String role;

  private String telephone;

  private String status;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getPractitionerId() {
    return practitionerId;
  }

  public void setPractitionerId(String practitionerId) {
    this.practitionerId = practitionerId;
  }

  public String getPractitionerName() {
    return practitionerName;
  }

  public void setPractitionerName(String practitionerName) {
    this.practitionerName = practitionerName;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  protected Serializable pkVal() {
    return this.id;
  }
}
