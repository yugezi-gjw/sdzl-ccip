package com.zivy009.demo.springbootshirodwz.services.patient.vo;

import com.zivy009.demo.springbootshirodwz.common.tools.StringUtil;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.lang3.StringUtils;

public class PatientListVo {

  private Long id;

  private String inpatientId;

  private String patientName;

  private String gender;

  private String birthDate;

  private String nationalId;

  private String telephone;

  private String telephone2;

  private String smoker;

  private String status;

  private String bodypartCode;

  private String bodypart;

  private String treatCourseId;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getInpatientId() {
    return inpatientId;
  }

  public void setInpatientId(String inpatientId) {
    this.inpatientId = inpatientId;
  }

  public String getPatientName() {
    return patientName;
  }

  public void setPatientName(String patientName) {
    this.patientName = patientName;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  public String getNationalId() {
    return nationalId;
  }

  public void setNationalId(String nationalId) {
    this.nationalId = nationalId;
  }

  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public String getTelephone2() {
    return telephone2;
  }

  public void setTelephone2(String telephone2) {
    this.telephone2 = telephone2;
  }

  public String getSmoker() {
    return smoker;
  }

  public void setSmoker(String smoker) {
    this.smoker = smoker;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getBodypartCode() {
    return bodypartCode;
  }

  public void setBodypartCode(String bodypartCode) {
    this.bodypartCode = bodypartCode;
  }

  public String getBodypart() {
    return bodypart;
  }

  public void setBodypart(String bodypart) {
    this.bodypart = bodypart;
  }

  public String getTreatCourseId() {
    return treatCourseId;
  }

  public void setTreatCourseId(String treatCourseId) {
    this.treatCourseId = treatCourseId;
  }

  public static PatientListVo fromMap(Map<String, Object> mapper) {
    PatientListVo dto = new PatientListVo();
    if (Objects.isNull(mapper) || mapper.isEmpty()) {
      return dto;
    }
    mapper.entrySet().forEach(entry -> {
      if (StringUtil.equals(entry.getKey(), "id")) {
        Integer id = (Integer) entry.getValue();
        dto.setId(Objects.nonNull(id) ? id.longValue() : null);
      } else if (StringUtil.equals(entry.getKey(), "patient_name")) {
        dto.setPatientName((String) entry.getValue());
      } else if (StringUtil.equals(entry.getKey(), "inpatient_id")) {
        dto.setInpatientId((String) entry.getValue());
      } else if (StringUtil.equals(entry.getKey(), "gender")) {
        String genderCode = (String) entry.getValue();
        if (StringUtils.isNotEmpty(genderCode)) {
          dto.setGender(StringUtils.equals("1", genderCode) ? "男" : "女");
        }
      } else if (StringUtil.equals(entry.getKey(), "national_id")) {
        dto.setNationalId((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "birth_date")) {
        dto.setBirthDate((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "telephone")) {
        dto.setTelephone((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "telephone2")) {
        dto.setTelephone2((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "smoker")) {
        dto.setSmoker((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "treat_course_id")) {
        dto.setTreatCourseId((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "bodypart_code")) {
        dto.setBodypartCode((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "bodypart")) {
        dto.setBodypart((String) entry.getValue());
      }
    });
    return dto;
  }

}
