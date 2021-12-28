package com.zivy009.demo.springbootshirodwz.services.treatcourse.dto;

public abstract class AbstractBodypartDto {
  protected Long id;

  protected String treatCourseId;

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
}
