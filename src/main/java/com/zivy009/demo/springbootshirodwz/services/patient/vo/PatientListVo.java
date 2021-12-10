package com.zivy009.demo.springbootshirodwz.services.patient.vo;

import com.zivy009.demo.springbootshirodwz.common.tools.StringUtil;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.lang3.StringUtils;

public class PatientListVo {
  private Long id;

  private String patientName;
  private String inpatientId;
  private String gender;
  private String nationalId;
  private String birthDate;
  private String telephone;
  private String telephone2;
  private String smoker;//吸烟史

  //Encounter info
  private String age;//年龄
  private String stage;//分期
  private String EGFR;//EGFR基因突变
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
  private String TKI;//TKI是否为一线用药
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

  public String getPatientName() {
    return patientName;
  }

  public void setPatientName(String patientName) {
    this.patientName = patientName;
  }

  public String getInpatientId() {
    return inpatientId;
  }

  public void setInpatientId(String inpatientId) {
    this.inpatientId = inpatientId;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getNationalId() {
    return nationalId;
  }

  public void setNationalId(String nationalId) {
    this.nationalId = nationalId;
  }

  public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
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

  public String getEGFR() {
    return EGFR;
  }

  public void setEGFR(String EGFR) {
    this.EGFR = EGFR;
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

  public String getTKI() {
    return TKI;
  }

  public void setTKI(String TKI) {
    this.TKI = TKI;
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

  public static PatientListVo fromMap(Map<String, Object> mapper) {
    PatientListVo patientRTListDto = new PatientListVo();
    if (Objects.isNull(mapper) || mapper.isEmpty()) {
      return patientRTListDto;
    }
    mapper.entrySet().forEach(entry -> {
      if (StringUtil.equals(entry.getKey(), "id")) {
        Integer id = (Integer) entry.getValue();
        patientRTListDto.setId(Objects.nonNull(id) ? id.longValue() : null);
      } else if (StringUtil.equals(entry.getKey(), "patient_name")) {
        patientRTListDto.setPatientName((String) entry.getValue());
      } else if (StringUtil.equals(entry.getKey(), "inpatient_id")) {
        patientRTListDto.setInpatientId((String) entry.getValue());
      } else if (StringUtil.equals(entry.getKey(), "gender")) {
        String genderCode = (String) entry.getValue();
        if (StringUtils.isNotEmpty(genderCode)) {
          patientRTListDto.setGender(StringUtils.equals("1", genderCode) ? "男" : "女");
        }
      } else if (StringUtil.equals(entry.getKey(), "national_id")) {
        patientRTListDto.setNationalId((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "birth_date")) {
        patientRTListDto.setBirthDate((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "telephone")) {
        patientRTListDto.setTelephone((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "telephone2")) {
        patientRTListDto.setTelephone2((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "smoker")) {
        patientRTListDto.setSmoker((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "age")) {
        patientRTListDto.setAge((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "stage")) {
        patientRTListDto.setStage((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "EGFR")) {
        patientRTListDto.setEGFR((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "diagnosis_dt")) {
        patientRTListDto.setDiagnosisDt((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "death_dt")) {
        patientRTListDto.setDeathDt((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "last_inpatient_dt")) {
        patientRTListDto.setLastInpatientDt((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "accurate_os")) {
        patientRTListDto.setAccurateOs((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "alive")) {
        patientRTListDto.setAlive((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "progress_dt")) {
        patientRTListDto.setProgressDt((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "delivered_fraction")) {
        patientRTListDto.setDeliveredFraction((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "treat_type")) {
        patientRTListDto.setTreatType((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "synchronous")) {
        patientRTListDto.setSynchronous((String) entry.getValue());
      }
    });
    return patientRTListDto;
  }
}
