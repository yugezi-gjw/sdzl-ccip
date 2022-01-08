package com.zivy009.demo.springbootshirodwz.services.multiprimary.dto;

import com.zivy009.demo.springbootshirodwz.persistence.model.MultiPrimary;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.dto.AbstractDto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import org.apache.commons.collections.CollectionUtils;

public class MultiPrimaryDto extends AbstractDto {
  private String treatCourseId;
  private String primary;
  private String bodypart;
  private String diagnosisDate;

  public String getTreatCourseId() {
    return treatCourseId;
  }

  public void setTreatCourseId(String treatCourseId) {
    this.treatCourseId = treatCourseId;
  }

  public String getPrimary() {
    return primary;
  }

  public void setPrimary(String primary) {
    this.primary = primary;
  }

  public String getBodypart() {
    return bodypart;
  }

  public void setBodypart(String bodypart) {
    this.bodypart = bodypart;
  }

  public String getDiagnosisDate() {
    return diagnosisDate;
  }

  public void setDiagnosisDate(String diagnosisDate) {
    this.diagnosisDate = diagnosisDate;
  }

  public MultiPrimary toEntity() {
    MultiPrimary entity = new MultiPrimary();
    entity.setId(id);
    entity.setTreatCourseId(treatCourseId);
    entity.setPrimary(primary);
    entity.setBodypart(bodypart);
    entity.setDiagnosisDate(diagnosisDate);
    if (Objects.nonNull(createdBy)) {
      entity.setCreatedBy(createdBy);
    }
    if (Objects.nonNull(updatedAt)) {
      entity.setUpdatedAt(updatedAt);
    }
    if (Objects.nonNull(updatedBy)) {
      entity.setUpdatedBy(updatedBy);
    }
    return entity;
  }

  public static MultiPrimaryDto fromEntity(MultiPrimary entity) {
    MultiPrimaryDto dto = new MultiPrimaryDto();
    if (Objects.isNull(entity)) {
      return dto;
    }
    dto.setId(entity.getId());
    dto.setTreatCourseId(entity.getTreatCourseId());
    dto.setPrimary(entity.getPrimary());
    dto.setBodypart(entity.getBodypart());
    dto.setDiagnosisDate(entity.getDiagnosisDate());
    return dto;
  }

  public static List<MultiPrimaryDto> fromEntityList(List<MultiPrimary> list) {
    List<MultiPrimaryDto> result = new ArrayList<>();
    if (CollectionUtils.isNotEmpty(list)) {
      list.forEach(p -> result.add(fromEntity(p)));
    }
    return result;
  }
}
