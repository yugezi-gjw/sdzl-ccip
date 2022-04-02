package com.zivy009.demo.springbootshirodwz.services.pathologyresult.dto;

import com.zivy009.demo.springbootshirodwz.persistence.model.PathologyResult;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

public class PathologyResultDto {

  private Long id;
  private String treatCourseId;
  private String finding;//检查所见
  private String diagnosis;
  private String additionalDiagnosis;
  private String immunity;
  private String pathologyNumber;
  private String pathologyType;
  private String pathologySource;
  private String status;

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

  public PathologyResult toEntity() {
    PathologyResult entity = new PathologyResult();
    entity.setId(id);
    entity.setTreatCourseId(treatCourseId);
    entity.setFinding(finding);
    entity.setDiagnosis(diagnosis);
    entity.setAdditionalDiagnosis(additionalDiagnosis);
    entity.setImmunity(immunity);
    entity.setPathologyNumber(pathologyNumber);
    entity.setPathologyType(pathologyType);
    entity.setPathologySource(pathologySource);
    if (Objects.nonNull(createdAt)) {
      entity.setCreatedAt(createdAt);
    }
    if (StringUtils.isNotEmpty(createdBy)) {
      entity.setCreatedBy(createdBy);
    }
    if (Objects.nonNull(updatedAt)) {
      entity.setUpdatedAt(updatedAt);
    }
    if (StringUtils.isNotEmpty(updatedBy)) {
      entity.setUpdatedBy(updatedBy);
    }
    return entity;
  }

  public static PathologyResultDto fromEntity(PathologyResult entity) {
    PathologyResultDto dto = new PathologyResultDto();
    if (Objects.isNull(entity)) {
      return dto;
    }
    dto.setId(entity.getId());
    dto.setTreatCourseId(entity.getTreatCourseId());
    dto.setFinding(entity.getFinding());
    dto.setDiagnosis(entity.getDiagnosis());
    dto.setAdditionalDiagnosis(entity.getAdditionalDiagnosis());
    dto.setImmunity(entity.getImmunity());
    dto.setPathologyNumber(entity.getPathologyNumber());
    dto.setPathologyType(entity.getPathologyType());
    dto.setPathologySource(entity.getPathologySource());
    return dto;
  }

  public static List<PathologyResultDto> fromEntityList(List<PathologyResult> list) {
    List<PathologyResultDto> result = new ArrayList<>();
    if (CollectionUtils.isNotEmpty(list)) {
      list.forEach(p -> result.add(fromEntity(p)));
    }
    return result;
  }
}
