package com.zivy009.demo.springbootshirodwz.services.treatcourse.dto;

import com.zivy009.demo.springbootshirodwz.persistence.model.TreatCourse;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.apache.commons.collections.CollectionUtils;

public class TreatCourseDto {

  private Long id;

  private Long patientId;

  private String treatCourseId;

  private String bodypartCode;

  private String bodypart;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getPatientId() {
    return patientId;
  }

  public void setPatientId(Long patientId) {
    this.patientId = patientId;
  }

  public String getTreatCourseId() {
    return treatCourseId;
  }

  public void setTreatCourseId(String treatCourseId) {
    this.treatCourseId = treatCourseId;
  }

  public String getBodypart() {
    return bodypart;
  }

  public void setBodypart(String bodypart) {
    this.bodypart = bodypart;
  }

  public String getBodypartCode() {
    return bodypartCode;
  }

  public void setBodypartCode(String bodypartCode) {
    this.bodypartCode = bodypartCode;
  }

  public TreatCourse toEntity() {
    TreatCourse treatCourse = new TreatCourse();
    treatCourse.setId(this.id);
    treatCourse.setBodypart(bodypart);
    treatCourse.setBodypartCode(bodypartCode);
    treatCourse.setPatientId(patientId);
    treatCourse.setTreatCourseId(treatCourseId);
    return treatCourse;
  }

  public static List<TreatCourseDto> fromEntityList(List<TreatCourse> treatCourseList) {
    List<TreatCourseDto> result = new ArrayList<>();
    if (CollectionUtils.isEmpty(treatCourseList)) {
      return result;
    }
    treatCourseList.forEach(p -> {
      if (Objects.nonNull(p)) {
        result.add(fromEntity(p));
      }
    });
    return result;
  }

  public static TreatCourseDto fromEntity(TreatCourse treatCourse) {
    if (Objects.isNull(treatCourse)) {
      return null;
    }
    TreatCourseDto dto = new TreatCourseDto();
    dto.setId(treatCourse.getId());
    dto.setPatientId(treatCourse.getPatientId());
    dto.setTreatCourseId(treatCourse.getTreatCourseId());
    dto.setBodypart(treatCourse.getBodypart());
    dto.setBodypartCode(treatCourse.getBodypartCode());
    return dto;
  }
}
