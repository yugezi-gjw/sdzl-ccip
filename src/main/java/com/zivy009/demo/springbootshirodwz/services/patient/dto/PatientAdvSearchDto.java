package com.zivy009.demo.springbootshirodwz.services.patient.dto;

import static org.apache.commons.lang3.StringUtils.isNotEmpty;

import com.zivy009.demo.springbootshirodwz.services.treatcourse.dto.BodypartEnum;
import org.apache.commons.lang3.StringUtils;

public class PatientAdvSearchDto {

  /** 基本查询条件*/
  private String inpatientId;
  private String patientName;
  private String gender;
  private String nationalId;

  /** 不同部位共有查询条件 **/
  private String stage;//分期
  private String diagnosisDt;//准确诊断日期
  private String deathDt;//准确死亡日期
  private String lastInpatientDt;//最近一次住院
  private String accurateOs;//准确OS
  private String alive;//生存状态:0死亡；1生存
  private String progressDt;//进展时间
  private String deliveredFraction;//放疗次数
  private String metastasisSites;//放疗转移部位数量
  private String isMultiSites;//是否为多部位放疗:0否；1是
  private String isBrainMetastases;//有无脑转移:0无；1有
  private String isBrainRadiation;//有无脑放疗:0无；1有
  private String brainMetastasisRadiation;//脑转移放疗
  private String isBoneMetastases;//有无骨转移:0无；1有
  private String isBoneRadiation;//有无骨放疗:0无；1有
  private String boneMetastasisRadiation;//骨转移放疗
  private String adrenalMetastasisRadiation;//肾上腺转移放疗
  private String otherMetastasisRadiation;//其他转移放疗
  private String holisticTx;//全身治疗方案
//  private String holisticTx2;//全身治疗方案2
//  private String holisticTx3;//全身治疗方案3
//  private String holisticTx4; //全身治疗方案4
//  private String holisticTx5; //全身治疗方案5
//  private String holisticTx6;  //全身治疗方案6
//  private String holisticTx7; //全身治疗方案7
  private String backup1;
  private String backup2;
  private String backup3;
  private String backup4;
  private String backup5;
  private String backup6;
  private String backup7;
  private String backup8;
  private String backup9;
  private String backup10;

  private String bodypart;

  /** Chest查询条件 */
  private String egfr;//EGFR基因突变
  private String treatType;//靶向先为1，放疗先为2，同步为0
  private String synchronous;//是否同步
  private String isPulmonaryRadiation;//有无肺部放疗:0无；1有
  private String pulmonaryMetastasisRadiation;//肺转移放疗
  private String cmdTimeSeq;//胸部放疗与诊断时间时序
  private String cmsTimeSeq;//胸部放疗与系统治疗时序
  private String sideReaction;//放射性副反应
  private String tki;//TKI是否为一线用药
  private String platinumDoublet;//Platinum doublet
  private String gefitinib;//是否用吉非替尼
  private String angiostatin;//是否用厄洛替尼
  private String icotinib;//是否用埃克替尼

  /**Galactophore查询条件 */
  private String menarcheAge;//初潮年龄
  private String amenorrheaAge;//闭经年龄
  private String molecularSubtyping;//分子分型
  private String er;//ER
  private String pr;//PR
  private String her2;//Her-2
  private String ki67;//Ki-67
  private String surgeryMode;//手术方式
  private String fishAugmentation;//FISH扩增
  private String geneticTest;//基因检测（21基因/70基因/50基因）
  private String steepGrade;//STEEP评分
  private String isGalactophoreRadiation;//有无胸壁/乳腺放疗:0无；1有
  private String galactophoreRadiation;//胸壁放疗时间、范围及剂量
  private String her2Drug;//是否用抗Her-2药物
  private String incretion;//是否用内分泌
  private String immunized;//是否用免疫

  public String getHolisticTx() {
    return holisticTx;
  }

  public void setHolisticTx(String holisticTx) {
    this.holisticTx = holisticTx;
  }

  public String getBodypart() {
    return bodypart;
  }

  public void setBodypart(String bodypart) {
    this.bodypart = bodypart;
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

  public String getNationalId() {
    return nationalId;
  }

  public void setNationalId(String nationalId) {
    this.nationalId = nationalId;
  }

  public String getStage() {
    return stage;
  }

  public void setStage(String stage) {
    this.stage = stage;
  }

  public String getEgfr() {
    return egfr;
  }

  public void setEgfr(String egfr) {
    this.egfr = egfr;
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

  public String getTki() {
    return tki;
  }

  public void setTki(String tki) {
    this.tki = tki;
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

  public String getMenarcheAge() {
    return menarcheAge;
  }

  public void setMenarcheAge(String menarcheAge) {
    this.menarcheAge = menarcheAge;
  }

  public String getAmenorrheaAge() {
    return amenorrheaAge;
  }

  public void setAmenorrheaAge(String amenorrheaAge) {
    this.amenorrheaAge = amenorrheaAge;
  }

  public String getMolecularSubtyping() {
    return molecularSubtyping;
  }

  public void setMolecularSubtyping(String molecularSubtyping) {
    this.molecularSubtyping = molecularSubtyping;
  }

  public String getEr() {
    return er;
  }

  public void setEr(String er) {
    this.er = er;
  }

  public String getPr() {
    return pr;
  }

  public void setPr(String pr) {
    this.pr = pr;
  }

  public String getHer2() {
    return her2;
  }

  public void setHer2(String her2) {
    this.her2 = her2;
  }

  public String getKi67() {
    return ki67;
  }

  public void setKi67(String ki67) {
    this.ki67 = ki67;
  }

  public String getSurgeryMode() {
    return surgeryMode;
  }

  public void setSurgeryMode(String surgeryMode) {
    this.surgeryMode = surgeryMode;
  }

  public String getFishAugmentation() {
    return fishAugmentation;
  }

  public void setFishAugmentation(String fishAugmentation) {
    this.fishAugmentation = fishAugmentation;
  }

  public String getGeneticTest() {
    return geneticTest;
  }

  public void setGeneticTest(String geneticTest) {
    this.geneticTest = geneticTest;
  }

  public String getSteepGrade() {
    return steepGrade;
  }

  public void setSteepGrade(String steepGrade) {
    this.steepGrade = steepGrade;
  }

  public String getIsGalactophoreRadiation() {
    return isGalactophoreRadiation;
  }

  public void setIsGalactophoreRadiation(String isGalactophoreRadiation) {
    this.isGalactophoreRadiation = isGalactophoreRadiation;
  }

  public String getGalactophoreRadiation() {
    return galactophoreRadiation;
  }

  public void setGalactophoreRadiation(String galactophoreRadiation) {
    this.galactophoreRadiation = galactophoreRadiation;
  }

  public String getHer2Drug() {
    return her2Drug;
  }

  public void setHer2Drug(String her2Drug) {
    this.her2Drug = her2Drug;
  }

  public String getIncretion() {
    return incretion;
  }

  public void setIncretion(String incretion) {
    this.incretion = incretion;
  }

  public String getImmunized() {
    return immunized;
  }

  public void setImmunized(String immunized) {
    this.immunized = immunized;
  }

  public String getBackup1() {
    return backup1;
  }

  public void setBackup1(String backup1) {
    this.backup1 = backup1;
  }

  public String getBackup2() {
    return backup2;
  }

  public void setBackup2(String backup2) {
    this.backup2 = backup2;
  }

  public String getBackup3() {
    return backup3;
  }

  public void setBackup3(String backup3) {
    this.backup3 = backup3;
  }

  public String getBackup4() {
    return backup4;
  }

  public void setBackup4(String backup4) {
    this.backup4 = backup4;
  }

  public String getBackup5() {
    return backup5;
  }

  public void setBackup5(String backup5) {
    this.backup5 = backup5;
  }

  public String getBackup6() {
    return backup6;
  }

  public void setBackup6(String backup6) {
    this.backup6 = backup6;
  }

  public String getBackup7() {
    return backup7;
  }

  public void setBackup7(String backup7) {
    this.backup7 = backup7;
  }

  public String getBackup8() {
    return backup8;
  }

  public void setBackup8(String backup8) {
    this.backup8 = backup8;
  }

  public String getBackup9() {
    return backup9;
  }

  public void setBackup9(String backup9) {
    this.backup9 = backup9;
  }

  public String getBackup10() {
    return backup10;
  }

  public void setBackup10(String backup10) {
    this.backup10 = backup10;
  }

  public boolean isSearchByChest() {
    if (StringUtils.equalsIgnoreCase(BodypartEnum.chest.name(), this.getBodypart())) {
      return isNotEmpty(this.getEgfr()) || isNotEmpty(this.getTreatType()) ||
          isNotEmpty(this.getSynchronous()) || isNotEmpty(this.getIsPulmonaryRadiation()) ||
          isNotEmpty(this.getPulmonaryMetastasisRadiation()) || isNotEmpty(this.getCmdTimeSeq()) ||
          isNotEmpty(this.getCmsTimeSeq()) || isNotEmpty(this.getSideReaction()) ||
          isNotEmpty(this.getTki()) || isNotEmpty(this.getPlatinumDoublet()) ||
          isNotEmpty(this.getGefitinib()) || isNotEmpty(this.getAngiostatin()) ||
          isNotEmpty(this.getIcotinib());
    }
    return false;
  }

  public boolean isSearchByGalactophore() {
    if (StringUtils.equalsIgnoreCase(BodypartEnum.galactophore.name(), this.getBodypart())) {
      return isNotEmpty(this.getMenarcheAge()) || isNotEmpty(this.getAmenorrheaAge()) ||
          isNotEmpty(this.getMolecularSubtyping()) || isNotEmpty(this.getEr()) ||
          isNotEmpty(this.getPr()) || isNotEmpty(this.getHer2()) ||
          isNotEmpty(this.getKi67()) || isNotEmpty(this.getSurgeryMode()) ||
          isNotEmpty(this.getFishAugmentation()) || isNotEmpty(this.getGeneticTest()) ||
          isNotEmpty(this.getSteepGrade()) || isNotEmpty(this.getIsGalactophoreRadiation()) ||
          isNotEmpty(this.getGalactophoreRadiation()) || isNotEmpty(this.getHer2Drug()) ||
          isNotEmpty(this.getIncretion()) || isNotEmpty(this.getImmunized());
    }
    return false;
  }
}
