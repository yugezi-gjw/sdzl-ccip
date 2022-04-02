package com.zivy009.demo.springbootshirodwz.services.patient.dto;

import com.zivy009.demo.springbootshirodwz.common.tools.StringUtil;
import com.zivy009.demo.springbootshirodwz.persistence.model.Patient;
import com.zivy009.demo.springbootshirodwz.persistence.model.TreatCourse;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.lang3.StringUtils;

public class PatientDto {

  private Long id;

  private String inpatientId;

  private String patientName;

  private String gender;

  private String firstVisitAge;

  private String nationalId;

  private String telephone;

  private String telephone2;

  private String smoker;

  private String status;

  private String bodypart;

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

  public String getFirstVisitAge() {
    return firstVisitAge;
  }

  public void setFirstVisitAge(String firstVisitAge) {
    this.firstVisitAge = firstVisitAge;
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

  public String getBodypart() {
    return bodypart;
  }

  public void setBodypart(String bodypart) {
    this.bodypart = bodypart;
  }

  public Patient toPatient() {
    Patient p = new Patient();
    p.setId(id);
    p.setInpatientId(inpatientId);
    p.setPatientName(patientName);
    p.setStatus(status);
    p.setTelephone(telephone);
    p.setTelephone2(telephone2);
    p.setFirstVisitAge(firstVisitAge);
    p.setNationalId(nationalId);
    p.setGender(gender);
    p.setSmoker(smoker);
    return p;
  }

  public PatientDto fromPatientEntity(Patient patient) {
    this.setId(patient.getId());
    this.setInpatientId(patient.getInpatientId());
    this.setPatientName(patient.getPatientName());
    this.setGender(patient.getGender());
    this.setFirstVisitAge(patient.getFirstVisitAge());
    this.setNationalId(patient.getNationalId());
    this.setSmoker(patient.getSmoker());
    this.setTelephone(patient.getTelephone());
    this.setTelephone2(patient.getTelephone2());
    this.setStatus(patient.getStatus());
    return this;
  }

  public static PatientDto fromMap(Map<String, Object> mapper) {
    PatientDto dto = new PatientDto();
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
      else if (StringUtil.equals(entry.getKey(), "first_visit_age")) {
        dto.setFirstVisitAge((String) entry.getValue());
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
    });
    return dto;
  }

}
