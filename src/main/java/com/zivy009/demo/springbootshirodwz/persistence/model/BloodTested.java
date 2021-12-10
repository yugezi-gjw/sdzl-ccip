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

  @TableField("encounter_id")
  private Long encounterId;

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

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getEncounterId() {
    return encounterId;
  }

  public void setEncounterId(Long encounterId) {
    this.encounterId = encounterId;
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

  @Override
  protected Serializable pkVal() {
    return this.id;
  }
}
