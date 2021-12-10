package com.zivy009.demo.springbootshirodwz.services.billing.dto;

import com.zivy009.demo.springbootshirodwz.common.tools.StringUtil;
import com.zivy009.demo.springbootshirodwz.persistence.model.PatientBilling;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Objects;

public class PatientBillingDto implements Serializable {

  private static final long serialVersionUID = 1L;

  private Long id;

  private String patientId;

  private Long encounterId;

  private String billingCode;

  private String billingName;

  private Integer amount;

  private String unit;

  private BigDecimal unitPrice;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getBillingCode() {
    return billingCode;
  }

  public void setBillingCode(String billingCode) {
    this.billingCode = billingCode;
  }

  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public String getBillingName() {
    return billingName;
  }

  public void setBillingName(String billingName) {
    this.billingName = billingName;
  }

  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public BigDecimal getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }

  public String getPatientId() {
    return patientId;
  }

  public void setPatientId(String patientId) {
    this.patientId = patientId;
  }

  public Long getEncounterId() {
    return encounterId;
  }

  public void setEncounterId(Long encounterId) {
    this.encounterId = encounterId;
  }

  public PatientBilling toEntity() {
    PatientBilling patientBilling = new PatientBilling();
    patientBilling.setId(id);
    patientBilling.setPatientId(patientId);
    patientBilling.setEncounterId(encounterId);
    patientBilling.setBillingCode(billingCode);
    patientBilling.setAmount(amount);
    return patientBilling;
  }

  public static PatientBillingDto fromMap(Map<String, Object> mapper) {
    PatientBillingDto patientBillingDto = new PatientBillingDto();
    if (Objects.isNull(mapper) || mapper.isEmpty()) {
      return patientBillingDto;
    }
    mapper.entrySet().forEach(entry -> {
      if (StringUtil.equals(entry.getKey(), "id")) {
        Integer id = (Integer) entry.getValue();
        patientBillingDto.setId(Objects.nonNull(id) ? id.longValue() : null);
      } else if (StringUtil.equals(entry.getKey(), "billing_code")) {
        patientBillingDto.setBillingCode((String) entry.getValue());
      } else if (StringUtil.equals(entry.getKey(), "billing_name")) {
        patientBillingDto.setBillingName((String) entry.getValue());
      } else if (StringUtil.equals(entry.getKey(), "unit")) {
        patientBillingDto.setUnit((String) entry.getValue());
      } else if (StringUtil.equals(entry.getKey(), "price")) {
        patientBillingDto.setUnitPrice((BigDecimal) entry.getValue());
      } else if (StringUtil.equals(entry.getKey(), "amount")) {
        patientBillingDto.setAmount((Integer) entry.getValue());
      } else if (StringUtil.equals(entry.getKey(), "patient_id")) {
        patientBillingDto.setPatientId((String) entry.getValue());
      } else if (StringUtil.equals(entry.getKey(), "encounter_id")) {
        Integer id = (Integer) entry.getValue();
        patientBillingDto.setEncounterId(Objects.nonNull(id) ? id.longValue() : null);
      }
    });
    return patientBillingDto;
  }
}
