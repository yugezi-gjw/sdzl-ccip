package com.zivy009.demo.springbootshirodwz.services.treathistory.dto;

import com.zivy009.demo.springbootshirodwz.persistence.model.TreatHistory;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.dto.AbstractDto;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.apache.commons.collections.CollectionUtils;

public class TreatHistoryDto extends AbstractDto {
  private String treatCourseId;
  private String treatType;
  private String plan;
  private String treatDate;

  public String getTreatType() {
    return treatType;
  }

  public void setTreatType(String treatType) {
    this.treatType = treatType;
  }

  public String getTreatCourseId() {
    return treatCourseId;
  }

  public void setTreatCourseId(String treatCourseId) {
    this.treatCourseId = treatCourseId;
  }

  public String getPlan() {
    return plan;
  }

  public void setPlan(String plan) {
    this.plan = plan;
  }

  public String getTreatDate() {
    return treatDate;
  }

  public void setTreatDate(String treatDate) {
    this.treatDate = treatDate;
  }

  public TreatHistory toEntity() {
    TreatHistory entity = new TreatHistory();
    entity.setId(id);
    entity.setTreatCourseId(treatCourseId);
    entity.setTreatType(treatType);
    entity.setPlan(plan);
    entity.setTreatDate(treatDate);
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

  public static TreatHistoryDto fromEntity(TreatHistory entity) {
    TreatHistoryDto dto = new TreatHistoryDto();
    if (Objects.isNull(entity)) {
      return dto;
    }
    dto.setId(entity.getId());
    dto.setTreatCourseId(entity.getTreatCourseId());
    dto.setTreatType(entity.getTreatType());
    dto.setPlan(entity.getPlan());
    dto.setTreatDate(entity.getTreatDate());
    return dto;
  }

  public static List<TreatHistoryDto> fromEntityList(List<TreatHistory> list) {
    List<TreatHistoryDto> result = new ArrayList<>();
    if (CollectionUtils.isNotEmpty(list)) {
      list.forEach(p -> result.add(fromEntity(p)));
    }
    return result;
  }
}
