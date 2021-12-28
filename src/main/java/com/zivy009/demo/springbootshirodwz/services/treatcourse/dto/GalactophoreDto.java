package com.zivy009.demo.springbootshirodwz.services.treatcourse.dto;

import com.zivy009.demo.springbootshirodwz.persistence.model.TreatCourseGalactophore;
import java.util.Objects;

public class GalactophoreDto extends AbstractBodypartDto {

  private String age;//年龄

  private String menarcheAge;//初潮年龄

  private String amenorrheaAge;//闭经年龄

  private String molecularSubtyping;//分子分型

  private String er;//ER
  private String pr;//PR
  private String her2;//Her-2
  private String ki67;//Ki-67

  private String stage;//分期

  private String stageTNM;//分期TNM

  private String surgeryMode;//手术方式

  private String fishAugmentation;//FISH扩增

  private String geneticTest;//基因检测（21基因/70基因/50基因）

  private String steepGrade;//STEEP评分

  private String diagnosisDt;//准确诊断日期

  private String deathDt;//准确死亡日期

  private String lastInpatientDt;//最近一次住院

  private String accurateOs;//准确OS

  private String alive;//生存状态:1死亡；0生存

  private String progressDt;//首次进展时间

  private String deliveredFraction;//放疗次数

  private String metastasisSites;//放疗转移部位数量

  private String isMultiSites;//是否为多部位放疗:0否；1是

  private String isGalactophoreRadiation;//有无胸壁/乳腺放疗:0无；1有

  private String galactophoreRadiation;//胸壁放疗时间、范围及剂量

  private String isBrainMetastases;//有无脑转移:0无；1有

  private String isBrainRadiation;//有无脑放疗:0无；1有

  private String brainMetastasisRadiation;//脑转移放疗

  private String isBoneMetastases;//有无骨转移:0无；1有

  private String isBoneRadiation;//有无骨放疗:0无；1有

  private String boneMetastasisRadiation;//骨转移放疗

  private String isHepaticMetastases;//有无肝转移:0无；1有

  private String adrenalMetastasisRadiation;//肾上腺转移放疗

  private String otherMetastasisRadiation;//其他转移放疗

  private String her2Drug;//是否用抗Her-2药物

  private String incretion;//是否用内分泌

  private String immunized;//是否用免疫

  private String status; //in_progress 在治；completed 结束治疗

  private String holisticTx1;//全身治疗方案1

  private String holisticTx2;//全身治疗方案2

  private String holisticTx3;//全身治疗方案3

  private String holisticTx4; //全身治疗方案4

  private String holisticTx5; //全身治疗方案5

  private String holisticTx6;  //全身治疗方案6

  private String holisticTx7; //全身治疗方案7

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
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

  public String getStage() {
    return stage;
  }

  public void setStage(String stage) {
    this.stage = stage;
  }

  public String getStageTNM() {
    return stageTNM;
  }

  public void setStageTNM(String stageTNM) {
    this.stageTNM = stageTNM;
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

  public String getIsHepaticMetastases() {
    return isHepaticMetastases;
  }

  public void setIsHepaticMetastases(String isHepaticMetastases) {
    this.isHepaticMetastases = isHepaticMetastases;
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

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
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

  public static GalactophoreDto createDefault() {
    GalactophoreDto galactophoreDto = new GalactophoreDto();
    galactophoreDto.setAccurateOs("");
    galactophoreDto.setAdrenalMetastasisRadiation("");
    galactophoreDto.setAge("");
    galactophoreDto.setAmenorrheaAge("");
    galactophoreDto.setAlive("");
    galactophoreDto.setBoneMetastasisRadiation("");
    galactophoreDto.setBrainMetastasisRadiation("");
    galactophoreDto.setDeathDt("");
    galactophoreDto.setDeliveredFraction("");
    galactophoreDto.setDiagnosisDt("");
    galactophoreDto.setEr("");
    galactophoreDto.setFishAugmentation("");
    galactophoreDto.setGalactophoreRadiation("");
    galactophoreDto.setGeneticTest("");
    galactophoreDto.setHolisticTx1("");
    galactophoreDto.setHolisticTx2("");
    galactophoreDto.setHolisticTx3("");
    galactophoreDto.setHolisticTx4("");
    galactophoreDto.setHolisticTx5("");
    galactophoreDto.setHolisticTx6("");
    galactophoreDto.setHolisticTx7("");
    galactophoreDto.setHer2("");
    galactophoreDto.setHer2Drug("");
    galactophoreDto.setIsBoneMetastases("");
    galactophoreDto.setIsBoneRadiation("");
    galactophoreDto.setIsBrainMetastases("");
    galactophoreDto.setIsBrainRadiation("");
    galactophoreDto.setIsMultiSites("");
    galactophoreDto.setImmunized("");
    galactophoreDto.setIncretion("");
    galactophoreDto.setIsGalactophoreRadiation("");
    galactophoreDto.setIsHepaticMetastases("");
    galactophoreDto.setKi67("");
    galactophoreDto.setLastInpatientDt("");
    galactophoreDto.setMetastasisSites("");
    galactophoreDto.setMenarcheAge("");
    galactophoreDto.setMolecularSubtyping("");
    galactophoreDto.setOtherMetastasisRadiation("");
    galactophoreDto.setProgressDt("");
    galactophoreDto.setPr("");
    galactophoreDto.setStage("");
    galactophoreDto.setStatus("");
    galactophoreDto.setStageTNM("");
    galactophoreDto.setSteepGrade("");
    galactophoreDto.setSurgeryMode("");
    galactophoreDto.setTreatCourseId("");
    return galactophoreDto;
  }

  public static GalactophoreDto fromEntity(TreatCourseGalactophore entity) {
    GalactophoreDto dto = createDefault();
    if (Objects.isNull(entity)) {
      return dto;
    }
    dto.setAccurateOs(entity.getAccurateOs());
    dto.setAdrenalMetastasisRadiation(entity.getAdrenalMetastasisRadiation());
    dto.setAge(entity.getAge());
    dto.setAlive(entity.getAlive());
    dto.setAmenorrheaAge(entity.getAmenorrheaAge());
    dto.setBoneMetastasisRadiation(entity.getBoneMetastasisRadiation());
    dto.setBrainMetastasisRadiation(entity.getBrainMetastasisRadiation());
    dto.setDeathDt(entity.getDeathDt());
    dto.setDeliveredFraction(entity.getDeliveredFraction());
    dto.setDiagnosisDt(entity.getDiagnosisDt());
    dto.setEr(entity.getEr());
    dto.setFishAugmentation(entity.getFishAugmentation());
    dto.setGalactophoreRadiation(entity.getGalactophoreRadiation());
    dto.setGeneticTest(entity.getGeneticTest());
    dto.setHolisticTx1(entity.getHolisticTx1());
    dto.setHolisticTx2(entity.getHolisticTx2());
    dto.setHolisticTx3(entity.getHolisticTx3());
    dto.setHolisticTx4(entity.getHolisticTx4());
    dto.setHolisticTx5(entity.getHolisticTx5());
    dto.setHolisticTx6(entity.getHolisticTx6());
    dto.setHolisticTx7(entity.getHolisticTx7());
    dto.setIsHepaticMetastases(entity.getIsHepaticMetastases());
    dto.setId(entity.getId());
    dto.setIsBoneMetastases(entity.getIsBoneMetastases());
    dto.setIsBoneRadiation(entity.getIsBoneRadiation());
    dto.setIsBrainMetastases(entity.getIsBrainMetastases());
    dto.setIsBrainRadiation(entity.getIsBrainRadiation());
    dto.setIsMultiSites(entity.getIsMultiSites());
    dto.setImmunized(entity.getImmunized());
    dto.setIncretion(entity.getIncretion());
    dto.setKi67(entity.getKi67());
    dto.setLastInpatientDt(entity.getLastInpatientDt());
    dto.setMetastasisSites(entity.getMetastasisSites());
    dto.setMolecularSubtyping(entity.getMolecularSubtyping());
    dto.setMenarcheAge(entity.getMenarcheAge());
    dto.setOtherMetastasisRadiation(entity.getOtherMetastasisRadiation());
    dto.setPr(entity.getPr());
    dto.setProgressDt(entity.getProgressDt());
    dto.setStageTNM(entity.getStageTNM());
    dto.setStage(entity.getStage());
    dto.setStatus(entity.getStatus());
    dto.setSurgeryMode(entity.getSurgeryMode());
    dto.setSteepGrade(entity.getSteepGrade());
    dto.setTreatCourseId(entity.getTreatCourseId());
    return dto;
  }

  public TreatCourseGalactophore toEntity() {
    TreatCourseGalactophore entity = new TreatCourseGalactophore();
    entity.setAccurateOs(this.getAccurateOs());
    entity.setAdrenalMetastasisRadiation(this.getAdrenalMetastasisRadiation());
    entity.setAge(this.getAge());
    entity.setAlive(this.getAlive());
    entity.setAmenorrheaAge(this.getAmenorrheaAge());
    entity.setBoneMetastasisRadiation(this.getBoneMetastasisRadiation());
    entity.setBrainMetastasisRadiation(this.getBrainMetastasisRadiation());
    entity.setDeathDt(this.getDeathDt());
    entity.setDeliveredFraction(this.getDeliveredFraction());
    entity.setDiagnosisDt(this.getDiagnosisDt());
    entity.setEr(this.getEr());
    entity.setFishAugmentation(this.getFishAugmentation());
    entity.setGalactophoreRadiation(this.getGalactophoreRadiation());
    entity.setGeneticTest(this.getGeneticTest());
    entity.setHolisticTx1(this.getHolisticTx1());
    entity.setHolisticTx2(this.getHolisticTx2());
    entity.setHolisticTx3(this.getHolisticTx3());
    entity.setHolisticTx4(this.getHolisticTx4());
    entity.setHolisticTx5(this.getHolisticTx5());
    entity.setHolisticTx6(this.getHolisticTx6());
    entity.setHolisticTx7(this.getHolisticTx7());
    entity.setId(this.getId());
    entity.setIsBoneMetastases(this.getIsBoneMetastases());
    entity.setIsBoneRadiation(this.getIsBoneRadiation());
    entity.setIsBrainMetastases(this.getIsBrainMetastases());
    entity.setIsBrainRadiation(this.getIsBrainRadiation());
    entity.setIsMultiSites(this.getIsMultiSites());
    entity.setImmunized(this.getImmunized());
    entity.setIncretion(this.getIncretion());
    entity.setIsGalactophoreRadiation(this.getIsGalactophoreRadiation());
    entity.setIsHepaticMetastases(this.getIsHepaticMetastases());
    entity.setKi67(this.getKi67());
    entity.setLastInpatientDt(this.getLastInpatientDt());
    entity.setMetastasisSites(this.getMetastasisSites());
    entity.setMenarcheAge(this.getMenarcheAge());
    entity.setMolecularSubtyping(this.getMolecularSubtyping());
    entity.setOtherMetastasisRadiation(this.getOtherMetastasisRadiation());
    entity.setProgressDt(this.getProgressDt());
    entity.setPr(this.getPr());
    entity.setStageTNM(this.getStageTNM());
    entity.setStage(this.getStage());
    entity.setStatus(this.getStatus());
    entity.setSteepGrade(this.getSteepGrade());
    entity.setSurgeryMode(this.getSurgeryMode());
    entity.setTreatCourseId(this.getTreatCourseId());
    return entity;
  }

}
