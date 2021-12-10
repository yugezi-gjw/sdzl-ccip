package com.zivy009.demo.springbootshirodwz.services.encounter.dto;

import com.baomidou.mybatisplus.annotations.TableField;
import com.zivy009.demo.springbootshirodwz.common.tools.StringUtil;
import com.zivy009.demo.springbootshirodwz.persistence.model.Encounter;
import com.zivy009.demo.springbootshirodwz.services.billing.dto.PatientBillingDto;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Objects;

public class EncounterDto {

  private Long id;

  private Long patientId;

  private String age;//年龄

  private String stage;//分期

  private String egfr;//EGFR基因突变

  private String diagnosisDt;//准确诊断日期

  private String deathDt;//准确死亡日期

  private String lastInpatientDt;//最近一次住院

  private String accurateOs;//准确OS

  private String alive;//生存状态:0死亡；1生存

  private String progressDt;//进展时间

  private String deliveredFraction;//放疗次数

  private String treatType;//靶向先为1，放疗先为2，同步为0

  private String synchronous;//是否同步

  private String metastasisSites;//放疗转移部位数量

  private String isMultiSites;//是否为多部位放疗:0否；1是

  private String isPulmonaryRadiation;//有无肺部放疗:0无；1有

  private String pulmonaryMetastasisRadiation;//肺转移放疗

  private String isBrainMetastases;//有无脑转移:0无；1有

  private String isBrainRadiation;//有无脑放疗:0无；1有

  private String brainMetastasisRadiation;//脑转移放疗

  private String isBoneMetastases;//有无骨转移:0无；1有

  private String isBoneRadiation;//有无骨放疗:0无；1有

  private String boneMetastasisRadiation;//骨转移放疗

  private String adrenalMetastasisRadiation;//肾上腺转移放疗

  private String otherMetastasisRadiation;//其他转移放疗

  private String cmdTimeSeq;//胸部放疗与诊断时间时序

  private String cmsTimeSeq;//胸部放疗与系统治疗时序

  private String sideReaction;//放射性副反应

  private String tki;//TKI是否为一线用药

  private String status; //in_progress 在治；completed 结束治疗

  private String platinumDoublet;//Platinum doublet

  private String gefitinib;//是否用吉非替尼

  private String angiostatin;//是否用厄洛替尼

  private String icotinib;//是否用埃克替尼

  private String holisticTx1;//全身治疗方案1

  private String holisticTx2;//全身治疗方案2

  private String holisticTx3;//全身治疗方案3

  private String holisticTx4; //全身治疗方案4

  private String holisticTx5; //全身治疗方案5

  private String holisticTx6;  //全身治疗方案6

  private String holisticTx7; //全身治疗方案7

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

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public String getStage() {
    return stage;
  }

  public void setStage(String stage) {
    this.stage = stage;
  }

  public String getDiagnosisDt() {
    return diagnosisDt;
  }

  public void setDiagnosisDt(String diagnosisDt) {
    this.diagnosisDt = diagnosisDt;
  }

  public String getDeathDt() {
    return deathDt;
  }

  public void setDeathDt(String deathDt) {
    this.deathDt = deathDt;
  }

  public String getLastInpatientDt() {
    return lastInpatientDt;
  }

  public void setLastInpatientDt(String lastInpatientDt) {
    this.lastInpatientDt = lastInpatientDt;
  }

  public String getAccurateOs() {
    return accurateOs;
  }

  public void setAccurateOs(String accurateOs) {
    this.accurateOs = accurateOs;
  }

  public String getAlive() {
    return alive;
  }

  public void setAlive(String alive) {
    this.alive = alive;
  }

  public String getProgressDt() {
    return progressDt;
  }

  public void setProgressDt(String progressDt) {
    this.progressDt = progressDt;
  }

  public String getDeliveredFraction() {
    return deliveredFraction;
  }

  public void setDeliveredFraction(String deliveredFraction) {
    this.deliveredFraction = deliveredFraction;
  }

  public String getTreatType() {
    return treatType;
  }

  public void setTreatType(String treatType) {
    this.treatType = treatType;
  }

  public String getSynchronous() {
    return synchronous;
  }

  public void setSynchronous(String synchronous) {
    this.synchronous = synchronous;
  }

  public String getMetastasisSites() {
    return metastasisSites;
  }

  public void setMetastasisSites(String metastasisSites) {
    this.metastasisSites = metastasisSites;
  }

  public String getIsMultiSites() {
    return isMultiSites;
  }

  public void setIsMultiSites(String isMultiSites) {
    this.isMultiSites = isMultiSites;
  }

  public String getIsPulmonaryRadiation() {
    return isPulmonaryRadiation;
  }

  public void setIsPulmonaryRadiation(String isPulmonaryRadiation) {
    this.isPulmonaryRadiation = isPulmonaryRadiation;
  }

  public String getPulmonaryMetastasisRadiation() {
    return pulmonaryMetastasisRadiation;
  }

  public void setPulmonaryMetastasisRadiation(String pulmonaryMetastasisRadiation) {
    this.pulmonaryMetastasisRadiation = pulmonaryMetastasisRadiation;
  }

  public String getIsBrainMetastases() {
    return isBrainMetastases;
  }

  public void setIsBrainMetastases(String isBrainMetastases) {
    this.isBrainMetastases = isBrainMetastases;
  }

  public String getIsBrainRadiation() {
    return isBrainRadiation;
  }

  public void setIsBrainRadiation(String isBrainRadiation) {
    this.isBrainRadiation = isBrainRadiation;
  }

  public String getBrainMetastasisRadiation() {
    return brainMetastasisRadiation;
  }

  public void setBrainMetastasisRadiation(String brainMetastasisRadiation) {
    this.brainMetastasisRadiation = brainMetastasisRadiation;
  }

  public String getIsBoneMetastases() {
    return isBoneMetastases;
  }

  public void setIsBoneMetastases(String isBoneMetastases) {
    this.isBoneMetastases = isBoneMetastases;
  }

  public String getIsBoneRadiation() {
    return isBoneRadiation;
  }

  public void setIsBoneRadiation(String isBoneRadiation) {
    this.isBoneRadiation = isBoneRadiation;
  }

  public String getBoneMetastasisRadiation() {
    return boneMetastasisRadiation;
  }

  public void setBoneMetastasisRadiation(String boneMetastasisRadiation) {
    this.boneMetastasisRadiation = boneMetastasisRadiation;
  }

  public String getAdrenalMetastasisRadiation() {
    return adrenalMetastasisRadiation;
  }

  public void setAdrenalMetastasisRadiation(String adrenalMetastasisRadiation) {
    this.adrenalMetastasisRadiation = adrenalMetastasisRadiation;
  }

  public String getOtherMetastasisRadiation() {
    return otherMetastasisRadiation;
  }

  public void setOtherMetastasisRadiation(String otherMetastasisRadiation) {
    this.otherMetastasisRadiation = otherMetastasisRadiation;
  }

  public String getCmdTimeSeq() {
    return cmdTimeSeq;
  }

  public void setCmdTimeSeq(String cmdTimeSeq) {
    this.cmdTimeSeq = cmdTimeSeq;
  }

  public String getCmsTimeSeq() {
    return cmsTimeSeq;
  }

  public void setCmsTimeSeq(String cmsTimeSeq) {
    this.cmsTimeSeq = cmsTimeSeq;
  }

  public String getSideReaction() {
    return sideReaction;
  }

  public void setSideReaction(String sideReaction) {
    this.sideReaction = sideReaction;
  }

  public String getEgfr() {
    return egfr;
  }

  public void setEgfr(String egfr) {
    this.egfr = egfr;
  }

  public String getTki() {
    return tki;
  }

  public void setTki(String tki) {
    this.tki = tki;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getPlatinumDoublet() {
    return platinumDoublet;
  }

  public void setPlatinumDoublet(String platinumDoublet) {
    this.platinumDoublet = platinumDoublet;
  }

  public String getGefitinib() {
    return gefitinib;
  }

  public void setGefitinib(String gefitinib) {
    this.gefitinib = gefitinib;
  }

  public String getAngiostatin() {
    return angiostatin;
  }

  public void setAngiostatin(String angiostatin) {
    this.angiostatin = angiostatin;
  }

  public String getIcotinib() {
    return icotinib;
  }

  public void setIcotinib(String icotinib) {
    this.icotinib = icotinib;
  }

  public String getHolisticTx1() {
    return holisticTx1;
  }

  public void setHolisticTx1(String holisticTx1) {
    this.holisticTx1 = holisticTx1;
  }

  public String getHolisticTx2() {
    return holisticTx2;
  }

  public void setHolisticTx2(String holisticTx2) {
    this.holisticTx2 = holisticTx2;
  }

  public String getHolisticTx3() {
    return holisticTx3;
  }

  public void setHolisticTx3(String holisticTx3) {
    this.holisticTx3 = holisticTx3;
  }

  public String getHolisticTx4() {
    return holisticTx4;
  }

  public void setHolisticTx4(String holisticTx4) {
    this.holisticTx4 = holisticTx4;
  }

  public String getHolisticTx5() {
    return holisticTx5;
  }

  public void setHolisticTx5(String holisticTx5) {
    this.holisticTx5 = holisticTx5;
  }

  public String getHolisticTx6() {
    return holisticTx6;
  }

  public void setHolisticTx6(String holisticTx6) {
    this.holisticTx6 = holisticTx6;
  }

  public String getHolisticTx7() {
    return holisticTx7;
  }

  public void setHolisticTx7(String holisticTx7) {
    this.holisticTx7 = holisticTx7;
  }

  public static EncounterDto createDefaultEncounter() {
    EncounterDto encounterDto = new EncounterDto();
    encounterDto.setAccurateOs("");
    encounterDto.setAdrenalMetastasisRadiation("");
    encounterDto.setAge("");
    encounterDto.setAlive("");
    encounterDto.setAngiostatin("");
    encounterDto.setBoneMetastasisRadiation("");
    encounterDto.setBrainMetastasisRadiation("");
    encounterDto.setCmdTimeSeq("");
    encounterDto.setCmsTimeSeq("");
    encounterDto.setDeathDt("");
    encounterDto.setDeliveredFraction("");
    encounterDto.setDiagnosisDt("");
    encounterDto.setEgfr("");
    encounterDto.setGefitinib("");
    encounterDto.setHolisticTx1("");
    encounterDto.setHolisticTx2("");
    encounterDto.setHolisticTx3("");
    encounterDto.setHolisticTx4("");
    encounterDto.setHolisticTx5("");
    encounterDto.setHolisticTx6("");
    encounterDto.setHolisticTx7("");
    encounterDto.setIcotinib("");
    encounterDto.setIsBoneMetastases("");
    encounterDto.setIsBoneRadiation("");
    encounterDto.setIsBrainMetastases("");
    encounterDto.setIsBrainRadiation("");
    encounterDto.setIsMultiSites("");
    encounterDto.setIsPulmonaryRadiation("");
    encounterDto.setLastInpatientDt("");
    encounterDto.setMetastasisSites("");
    encounterDto.setOtherMetastasisRadiation("");
    encounterDto.setPlatinumDoublet("");
    encounterDto.setProgressDt("");
    encounterDto.setPulmonaryMetastasisRadiation("");
    encounterDto.setSideReaction("");
    encounterDto.setStage("");
    encounterDto.setStatus("");
    encounterDto.setSynchronous("");
    encounterDto.setTki("");
    encounterDto.setTreatType("");
    return encounterDto;
  }

  public static EncounterDto fromEntity(Encounter encounter) {
    EncounterDto encounterDto = createDefaultEncounter();
    if (Objects.isNull(encounter)) {
      return encounterDto;
    }
    encounterDto.setAccurateOs(encounter.getAccurateOs());
    encounterDto.setAdrenalMetastasisRadiation(encounter.getAdrenalMetastasisRadiation());
    encounterDto.setAge(encounter.getAge());
    encounterDto.setAlive(encounter.getAlive());
    encounterDto.setAngiostatin(encounter.getAngiostatin());
    encounterDto.setBoneMetastasisRadiation(encounter.getBoneMetastasisRadiation());
    encounterDto.setBrainMetastasisRadiation(encounter.getBrainMetastasisRadiation());
    encounterDto.setCmdTimeSeq(encounter.getCmdTimeSeq());
    encounterDto.setCmsTimeSeq(encounter.getCmsTimeSeq());
    encounterDto.setDeathDt(encounter.getDeathDt());
    encounterDto.setDeliveredFraction(encounter.getDeliveredFraction());
    encounterDto.setDiagnosisDt(encounter.getDiagnosisDt());
    encounterDto.setEgfr(encounter.getEgfr());
    encounterDto.setGefitinib(encounter.getGefitinib());
    encounterDto.setHolisticTx1(encounter.getHolisticTx1());
    encounterDto.setHolisticTx2(encounter.getHolisticTx2());
    encounterDto.setHolisticTx3(encounter.getHolisticTx3());
    encounterDto.setHolisticTx4(encounter.getHolisticTx4());
    encounterDto.setHolisticTx5(encounter.getHolisticTx5());
    encounterDto.setHolisticTx6(encounter.getHolisticTx6());
    encounterDto.setHolisticTx7(encounter.getHolisticTx7());
    encounterDto.setIcotinib(encounter.getIcotinib());
    encounterDto.setId(encounter.getId());
    encounterDto.setIsBoneMetastases(encounter.getIsBoneMetastases());
    encounterDto.setIsBoneRadiation(encounter.getIsBoneRadiation());
    encounterDto.setIsBrainMetastases(encounter.getIsBrainMetastases());
    encounterDto.setIsBrainRadiation(encounter.getIsBrainRadiation());
    encounterDto.setIsMultiSites(encounter.getIsMultiSites());
    encounterDto.setIsPulmonaryRadiation(encounter.getIsPulmonaryRadiation());
    encounterDto.setLastInpatientDt(encounter.getLastInpatientDt());
    encounterDto.setMetastasisSites(encounter.getMetastasisSites());
    encounterDto.setOtherMetastasisRadiation(encounter.getOtherMetastasisRadiation());
    encounterDto.setPatientId(encounter.getPatientId());
    encounterDto.setPlatinumDoublet(encounter.getPlatinumDoublet());
    encounterDto.setProgressDt(encounter.getProgressDt());
    encounterDto.setPulmonaryMetastasisRadiation(encounter.getPulmonaryMetastasisRadiation());
    encounterDto.setSideReaction(encounter.getSideReaction());
    encounterDto.setStage(encounter.getStage());
    encounterDto.setStatus(encounter.getStatus());
    encounterDto.setSynchronous(encounter.getSynchronous());
    encounterDto.setTki(encounter.getTki());
    encounterDto.setTreatType(encounter.getTreatType());
    return encounterDto;
  }

  public Encounter toEntity() {
    Encounter encounter = new Encounter();
    encounter.setAccurateOs(this.getAccurateOs());
    encounter.setAdrenalMetastasisRadiation(this.getAdrenalMetastasisRadiation());
    encounter.setAge(this.getAge());
    encounter.setAlive(this.getAlive());
    encounter.setAngiostatin(this.getAngiostatin());
    encounter.setBoneMetastasisRadiation(this.getBoneMetastasisRadiation());
    encounter.setBrainMetastasisRadiation(this.getBrainMetastasisRadiation());
    encounter.setCmdTimeSeq(this.getCmdTimeSeq());
    encounter.setCmsTimeSeq(this.getCmsTimeSeq());
    encounter.setDeathDt(this.getDeathDt());
    encounter.setDeliveredFraction(this.getDeliveredFraction());
    encounter.setDiagnosisDt(this.getDiagnosisDt());
    encounter.setEgfr(this.getEgfr());
    encounter.setGefitinib(this.getGefitinib());
    encounter.setHolisticTx1(this.getHolisticTx1());
    encounter.setHolisticTx2(this.getHolisticTx2());
    encounter.setHolisticTx3(this.getHolisticTx3());
    encounter.setHolisticTx4(this.getHolisticTx4());
    encounter.setHolisticTx5(this.getHolisticTx5());
    encounter.setHolisticTx6(this.getHolisticTx6());
    encounter.setHolisticTx7(this.getHolisticTx7());
    encounter.setIcotinib(this.getIcotinib());
    encounter.setId(this.getId());
    encounter.setIsBoneMetastases(this.getIsBoneMetastases());
    encounter.setIsBoneRadiation(this.getIsBoneRadiation());
    encounter.setIsBrainMetastases(this.getIsBrainMetastases());
    encounter.setIsBrainRadiation(this.getIsBrainRadiation());
    encounter.setIsMultiSites(this.getIsMultiSites());
    encounter.setIsPulmonaryRadiation(this.getIsPulmonaryRadiation());
    encounter.setLastInpatientDt(this.getLastInpatientDt());
    encounter.setMetastasisSites(this.getMetastasisSites());
    encounter.setOtherMetastasisRadiation(this.getOtherMetastasisRadiation());
    encounter.setPatientId(this.getPatientId());
    encounter.setPlatinumDoublet(this.getPlatinumDoublet());
    encounter.setProgressDt(this.getProgressDt());
    encounter.setPulmonaryMetastasisRadiation(this.getPulmonaryMetastasisRadiation());
    encounter.setSideReaction(this.getSideReaction());
    encounter.setStage(this.getStage());
    encounter.setStatus(this.getStatus());
    encounter.setSynchronous(this.getSynchronous());
    encounter.setTki(this.getTki());
    encounter.setTreatType(this.getTreatType());
    return encounter;
  }

//  public static EncounterDto fromMap(Map<String, Object> mapper) {
//    EncounterDto encounterDto = new EncounterDto();
//    if (Objects.isNull(mapper) || mapper.isEmpty()) {
//      return encounterDto;
//    }
//    mapper.entrySet().forEach(entry -> {
//      if (StringUtil.equals(entry.getKey(), "id")) {
//        encounterDto.setId((Long) entry.getValue());
//      } else if (StringUtil.equals(entry.getKey(), "patient_id")) {
//        encounterDto.setPatientId((String) entry.getValue());
//      } else if (StringUtil.equals(entry.getKey(), "patient_name")) {
//        encounterDto.setPatientName((String) entry.getValue());
//      } else if (StringUtil.equals(entry.getKey(), "telephone")) {
//        encounterDto.setTelephone((String) entry.getValue());
//      } else if (StringUtil.equals(entry.getKey(), "physician")) {
//        encounterDto.setPhysician((String) entry.getValue());
//      } else if (StringUtil.equals(entry.getKey(), "outpatient_room")) {
//        encounterDto.setOutpatientRoom((String) entry.getValue());
//      } else if (StringUtil.equals(entry.getKey(), "physicist")) {
//        encounterDto.setPhysicist((String) entry.getValue());
//      } else if (StringUtil.equals(entry.getKey(), "diagnosis")) {
//        encounterDto.setDiagnosis((String) entry.getValue());
//      } else if (StringUtil.equals(entry.getKey(), "prescription")) {
//        encounterDto.setPrescription((String) entry.getValue());
//      } else if (StringUtil.equals(entry.getKey(), "technical")) {
//        encounterDto.setPrescription((String) entry.getValue());
//      } else if (StringUtil.equals(entry.getKey(), "price")) {
//        encounterDto.setUnitPrice((BigDecimal) entry.getValue());
//      }
//    });
//    return encounterDto;
//  }
}
