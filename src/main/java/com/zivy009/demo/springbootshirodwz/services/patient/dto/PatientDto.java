package com.zivy009.demo.springbootshirodwz.services.patient.dto;

import com.zivy009.demo.springbootshirodwz.persistence.model.Encounter;
import com.zivy009.demo.springbootshirodwz.persistence.model.Patient;
import com.zivy009.demo.springbootshirodwz.services.patient.service.PatientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class PatientDto {

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

  @Autowired
  private PatientServiceImpl patientService;

  public Patient toPatient() {
    Patient p = new Patient();
    p.setId(id);
    p.setInpatientId(inpatientId);
    p.setPatientName(patientName);
    p.setStatus(status);
    p.setTelephone(telephone);
    p.setTelephone2(telephone2);
    p.setBirthDate(birthDate);
    p.setNationalId(nationalId);
    p.setGender(gender);
    p.setSmoker(smoker);
    return p;
  }

  public Encounter toEncounter() {
    Encounter encounter = new Encounter();
    return encounter;
  }

  public PatientDto fromPatientEntity(Patient patient) {
    this.setId(patient.getId());
    this.setInpatientId(patient.getInpatientId());
    this.setPatientName(patient.getPatientName());
    this.setGender(patient.getGender());
    this.setBirthDate(patient.getBirthDate());
    this.setNationalId(patient.getNationalId());
    this.setSmoker(patient.getSmoker());
    this.setTelephone(patient.getTelephone());
    this.setTelephone2(patient.getTelephone2());
    this.setStatus(patient.getStatus());
    return this;
  }

  public PatientDto fromEncounterEntity(Encounter encounter) {
//    this.setEncounterId(encounter.getId());
//    this.setPhysician(encounter.getPhysician());
//    this.setPhysicist(encounter.getPhysicist());
//    this.setOutpatientRoom(encounter.getOutpatientRoom());
//    this.setDiagnosis(encounter.getDiagnosis());
//    this.setPrescription(encounter.getPrescription());
//    this.setTechnical(encounter.getTechnical());
    return this;
  }
}
