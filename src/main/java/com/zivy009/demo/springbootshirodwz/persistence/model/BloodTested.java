package com.zivy009.demo.springbootshirodwz.persistence.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import java.io.Serializable;
import java.util.Date;

@TableName("blood_tested")
public class BloodTested extends Model<BloodTested> implements Serializable {

  private static final long serialVersionUID = 1L;

  @TableId(value="id", type= IdType.AUTO)
  private Long id;

  @TableField("treat_course_id")
  private String treatCourseId;

  @TableField("tested_name")
  private String testedName;//检测name

  @TableField("white_cells")
  private String whiteCells;//白细胞

  @TableField("neutrophil_leucocyte")
  private String neutrophilLeucocyte;//中性粒细胞

  private String lymphocyte;//淋巴细胞

  private String monocyte;//单核细胞

  private String thrombocyte;//血小板

  private String sii;//SII

  private String nlr;//NLR

  private String plr;//PLR

  private String lmr;//LMR

  private String status;
  private String comment;

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

  public String getTestedName() {
    return testedName;
  }

  public void setTestedName(String testedName) {
    this.testedName = testedName;
  }

  public String getWhiteCells() {
    return whiteCells;
  }

  public void setWhiteCells(String whiteCells) {
    this.whiteCells = whiteCells;
  }

  public String getNeutrophilLeucocyte() {
    return neutrophilLeucocyte;
  }

  public void setNeutrophilLeucocyte(String neutrophilLeucocyte) {
    this.neutrophilLeucocyte = neutrophilLeucocyte;
  }

  public String getLymphocyte() {
    return lymphocyte;
  }

  public void setLymphocyte(String lymphocyte) {
    this.lymphocyte = lymphocyte;
  }

  public String getMonocyte() {
    return monocyte;
  }

  public void setMonocyte(String monocyte) {
    this.monocyte = monocyte;
  }

  public String getThrombocyte() {
    return thrombocyte;
  }

  public void setThrombocyte(String thrombocyte) {
    this.thrombocyte = thrombocyte;
  }

  public String getSii() {
    return sii;
  }

  public void setSii(String sii) {
    this.sii = sii;
  }

  public String getNlr() {
    return nlr;
  }

  public void setNlr(String nlr) {
    this.nlr = nlr;
  }

  public String getPlr() {
    return plr;
  }

  public void setPlr(String plr) {
    this.plr = plr;
  }

  public String getLmr() {
    return lmr;
  }

  public void setLmr(String lmr) {
    this.lmr = lmr;
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

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  @Override
  protected Serializable pkVal() {
    return this.id;
  }
}
