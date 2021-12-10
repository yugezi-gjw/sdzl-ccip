package com.zivy009.demo.springbootshirodwz.persistence.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import java.io.Serializable;
import java.util.Date;

@TableName("patient")
public class Patient extends Model<Patient> implements Serializable {

  private static final long serialVersionUID = 1L;

  @TableId(value="id", type= IdType.AUTO)
  private Long id;

  @TableField("inpatient_id")
  private String inpatientId;

  @TableField("outpatient_id")
  private String outpatientId;

  @TableField("patient_name")
  private String patientName;

  private String pinyin;

  private String address;

  private String gender;

  @TableField("birth_date")
  private String birthDate;

  @TableField("national_id")
  private String nationalId;

  private String telephone;

  private String telephone2;

  private String smoker;

  private String status;

  @TableField("patient_id1")
  private String patientId1;
  @TableField("patient_id2")
  private String patientId2;
  @TableField("patient_id3")
  private String patientId3;
  @TableField("patient_id4")
  private String patientId4;

  private String bz1;
  private String bz2;
  private String bz3;
  private String bz4;
  private String bz5;

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

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getInpatientId() {
    return inpatientId;
  }

  public void setInpatientId(String inpatientId) {
    this.inpatientId = inpatientId;
  }

  public String getOutpatientId() {
    return outpatientId;
  }

  public void setOutpatientId(String outpatientId) {
    this.outpatientId = outpatientId;
  }

  public String getPatientName() {
    return patientName;
  }

  public void setPatientName(String patientName) {
    this.patientName = patientName;
  }

  public String getPinyin() {
    return pinyin;
  }

  public void setPinyin(String pinyin) {
    this.pinyin = pinyin;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  public String getNationalId() {
    return nationalId;
  }

  public void setNationalId(String nationalId) {
    this.nationalId = nationalId;
  }

  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public String getTelephone2() {
    return telephone2;
  }

  public void setTelephone2(String telephone2) {
    this.telephone2 = telephone2;
  }

  public String getSmoker() {
    return smoker;
  }

  public void setSmoker(String smoker) {
    this.smoker = smoker;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getPatientId1() {
    return patientId1;
  }

  public void setPatientId1(String patientId1) {
    this.patientId1 = patientId1;
  }

  public String getPatientId2() {
    return patientId2;
  }

  public void setPatientId2(String patientId2) {
    this.patientId2 = patientId2;
  }

  public String getPatientId3() {
    return patientId3;
  }

  public void setPatientId3(String patientId3) {
    this.patientId3 = patientId3;
  }

  public String getPatientId4() {
    return patientId4;
  }

  public void setPatientId4(String patientId4) {
    this.patientId4 = patientId4;
  }

  public String getBz1() {
    return bz1;
  }

  public void setBz1(String bz1) {
    this.bz1 = bz1;
  }

  public String getBz2() {
    return bz2;
  }

  public void setBz2(String bz2) {
    this.bz2 = bz2;
  }

  public String getBz3() {
    return bz3;
  }

  public void setBz3(String bz3) {
    this.bz3 = bz3;
  }

  public String getBz4() {
    return bz4;
  }

  public void setBz4(String bz4) {
    this.bz4 = bz4;
  }

  public String getBz5() {
    return bz5;
  }

  public void setBz5(String bz5) {
    this.bz5 = bz5;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

  public String getDeletedBy() {
    return deletedBy;
  }

  public void setDeletedBy(String deletedBy) {
    this.deletedBy = deletedBy;
  }

  public Date getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(Date deletedAt) {
    this.deletedAt = deletedAt;
  }

  @Override
  protected Serializable pkVal() {
    return this.id;
  }
}
