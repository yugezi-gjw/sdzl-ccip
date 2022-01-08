package com.zivy009.demo.springbootshirodwz.services.testresult.dto;

import com.zivy009.demo.springbootshirodwz.persistence.model.TestResult;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.dto.AbstractDto;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

public class TestResultDto extends AbstractDto {
  private Long id;
  private String treatCourseId;
  private String finding;//检查所见
  private String result;//检查结果
  private String imageNumber;//影像号
  private String imageEvaluation;//影像评估
  private String testDt;//检测时间
  private String comment;

  @Override
  public Long getId() {
    return id;
  }

  @Override
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

  public TestResult toEntity() {
    TestResult entity = new TestResult();
    entity.setId(id);
    entity.setTreatCourseId(treatCourseId);
    entity.setFinding(finding);
    entity.setResult(result);
    entity.setImageNumber(imageNumber);
    entity.setImageEvaluation(imageEvaluation);
    entity.setTestDt(testDt);
    entity.setComment(comment);
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

  public static TestResultDto fromEntity(TestResult entity) {
    TestResultDto dto = new TestResultDto();
    if (Objects.isNull(entity)) {
      return dto;
    }
    dto.setId(entity.getId());
    dto.setTreatCourseId(entity.getTreatCourseId());
    dto.setFinding(entity.getFinding());
    dto.setResult(entity.getResult());
    dto.setImageNumber(entity.getImageNumber());
    dto.setImageEvaluation(entity.getImageEvaluation());
    dto.setComment(entity.getComment());
    dto.setTestDt(entity.getTestDt());
    return dto;
  }

  public static List<TestResultDto> fromEntityList(List<TestResult> list) {
    List<TestResultDto> result = new ArrayList<>();
    if (CollectionUtils.isNotEmpty(list)) {
      list.forEach(p -> result.add(fromEntity(p)));
    }
    return result;
  }
}
