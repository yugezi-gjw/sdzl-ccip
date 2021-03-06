package com.zivy009.demo.springbootshirodwz.services.bloodtested.dto;

import com.zivy009.demo.springbootshirodwz.persistence.model.BloodTested;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

public class BloodTestedDto {
  private Long id;

  private String treatCourseId;

  private String testedName;//检测name

  private String whiteCells;//白细胞

  private String neutrophilLeucocyte;//中性粒细胞

  private String lymphocyte;//淋巴细胞

  private String monocyte;//单核细胞

  private String thrombocyte;//血小板

  private String sii;//SII

  private String nlr;//NLR

  private String plr;//PLR

  private String lmr;//LMR

  private String comment;
  private Date createdAt;
  private String createdBy;
  private Date updatedAt;
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

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
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

  public BloodTested toEntity() {
    BloodTested entity = new BloodTested();
    entity.setId(this.getId());
    entity.setTreatCourseId(this.getTreatCourseId());
    entity.setTestedName(this.getTestedName());
    entity.setWhiteCells(this.getWhiteCells());
    entity.setNeutrophilLeucocyte(this.getNeutrophilLeucocyte());
    entity.setLymphocyte(this.getLymphocyte());
    entity.setMonocyte(this.getMonocyte());
    entity.setThrombocyte(this.getThrombocyte());
    entity.setLmr(this.getLmr());
    entity.setNlr(this.getNlr());
    entity.setSii(this.getSii());
    entity.setPlr(this.getPlr());

    entity.setComment(getComment());
    if (Objects.nonNull(getCreatedAt())) {
      entity.setCreatedAt(getCreatedAt());
    }
    if (StringUtils.isNotEmpty(getCreatedBy())) {
      entity.setCreatedBy(getCreatedBy());
    }
    if (Objects.nonNull(getUpdatedAt())) {
      entity.setUpdatedAt(getUpdatedAt());
    }
    if (StringUtils.isNotEmpty(getUpdatedBy())) {
      entity.setUpdatedBy(getUpdatedBy());
    }
    return entity;
  }

  public static BloodTestedDto fromEntity(BloodTested entity) {
    BloodTestedDto dto = new BloodTestedDto();
    if (Objects.isNull(entity)) {
      return dto;
    }
    dto.setId(entity.getId());
    dto.setTreatCourseId(entity.getTreatCourseId());
    dto.setTestedName(entity.getTestedName());
    dto.setWhiteCells(entity.getWhiteCells());
    dto.setNeutrophilLeucocyte(entity.getNeutrophilLeucocyte());
    dto.setLymphocyte(entity.getLymphocyte());
    dto.setMonocyte(entity.getMonocyte());
    dto.setThrombocyte(entity.getThrombocyte());
    dto.setLmr(entity.getLmr());
    dto.setNlr(entity.getNlr());
    dto.setSii(entity.getSii());
    dto.setPlr(entity.getPlr());
    dto.setComment(entity.getComment());
    dto.setCreatedAt(entity.getCreatedAt());
    dto.setCreatedBy(entity.getCreatedBy());
    dto.setUpdatedAt(entity.getUpdatedAt());
    dto.setUpdatedBy(entity.getUpdatedBy());
    return dto;
  }

  public static List<BloodTestedDto> fromEntityList(List<BloodTested> list) {
    if (CollectionUtils.isEmpty(list)) {
      return new ArrayList<>();
    }
    List<BloodTestedDto> result = new ArrayList<>();
    list.forEach(p -> result.add(fromEntity(p)));
    return result;
  }
}
