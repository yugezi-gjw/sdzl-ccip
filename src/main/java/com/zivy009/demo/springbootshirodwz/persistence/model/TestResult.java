package com.zivy009.demo.springbootshirodwz.persistence.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import java.io.Serializable;
import java.util.Date;

@TableName("test_result")
public class TestResult extends Model<TestResult> implements Serializable {

  private static final long serialVersionUID = 1L;

  @TableId(value="id", type= IdType.AUTO)
  private Long id;

  @TableField("treat_course_id")
  private String treatCourseId;

  private String finding;//检查所见
  private String result;//检查结果

  @TableField("image_number")
  private String imageNumber;//影像号

  @TableField("image_evaluation")
  private String imageEvaluation;//影像评估

  @TableField("test_dt")
  private String testDt;//检测时间

  private String comment;

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

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public String getImageNumber() {
    return imageNumber;
  }

  public void setImageNumber(String imageNumber) {
    this.imageNumber = imageNumber;
  }

  public String getImageEvaluation() {
    return imageEvaluation;
  }

  public void setImageEvaluation(String imageEvaluation) {
    this.imageEvaluation = imageEvaluation;
  }

  public String getTestDt() {
    return testDt;
  }

  public void setTestDt(String testDt) {
    this.testDt = testDt;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
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
