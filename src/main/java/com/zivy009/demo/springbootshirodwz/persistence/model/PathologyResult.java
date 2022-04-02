package com.zivy009.demo.springbootshirodwz.persistence.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import java.io.Serializable;
import java.util.Date;

@TableName("pathology_result")
public class PathologyResult  extends Model<PathologyResult> implements Serializable {

  private static final long serialVersionUID = 1L;

  @TableId(value="id", type= IdType.AUTO)
  private Long id;

  @TableField("treat_course_id")
  private String treatCourseId;

  private String finding;//检查所见
  private String diagnosis;

  @TableField("additional_diagnosis")
  private String additionalDiagnosis;

  private String immunity;

  @TableField("pathology_number")
  private String pathologyNumber;
  @TableField("pathology_type")
  private String pathologyType;
  @TableField("pathology_source")
  private String pathologySource;

  private String status;

  @TableField("created_at")
  private Date createdAt;

  @TableField("created_by")
  private String createdBy;

  @TableField("updated_at")
  private Date updatedAt;

  @TableField("updated_by")
  private String updatedBy;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTreatCourseId() {
    return treatCourseId;
  }

  public void setTreatCourseId(String treatCourseId) {
    this.treatCourseId = treatCourseId;
  }

  public String getFinding() {
    return finding;
  }

  public void setFinding(String finding) {
    this.finding = finding;
  }

  public String getDiagnosis() {
    return diagnosis;
  }

  public void setDiagnosis(String diagnosis) {
    this.diagnosis = diagnosis;
  }

  public String getAdditionalDiagnosis() {
    return additionalDiagnosis;
  }

  public void setAdditionalDiagnosis(String additionalDiagnosis) {
    this.additionalDiagnosis = additionalDiagnosis;
  }

  public String getImmunity() {
    return immunity;
  }

  public void setImmunity(String immunity) {
    this.immunity = immunity;
  }

  public String getPathologyNumber() {
    return pathologyNumber;
  }

  public void setPathologyNumber(String pathologyNumber) {
    this.pathologyNumber = pathologyNumber;
  }

  public String getPathologyType() {
    return pathologyType;
  }

  public void setPathologyType(String pathologyType) {
    this.pathologyType = pathologyType;
  }

  public String getPathologySource() {
    return pathologySource;
  }

  public void setPathologySource(String pathologySource) {
    this.pathologySource = pathologySource;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
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

  @Override
  protected Serializable pkVal() {
    return this.id;
  }
}
