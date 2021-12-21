package com.zivy009.demo.springbootshirodwz.persistence.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import java.io.Serializable;
import java.util.Date;

@TableName("treat_course_galactophore")
public class TreatCourseGalactophore extends Model<TreatCourseGalactophore> implements Serializable {
  private static final long serialVersionUID = 1L;

  @TableId(value="id", type= IdType.AUTO)
  private Long id;

  @TableField("treat_course_id")
  private String treatCourseId;

  private String age;//年龄

  @TableField("menarche_age")
  private String menarcheAge;//初潮年龄

  @TableField("amenorrhea_age")
  private String amenorrheaAge;//闭经年龄

  @TableField("molecular_subtyping")
  private String molecularSubtyping;//分子分型

  private String er;//ER
  private String pr;//PR
  private String her2;//Her-2
  private String ki67;//Ki-67

  private String stage;//分期

  @TableField("stage_tnm")
  private String stageTNM;//分期TNM

  @TableField("surgery_mode")
  private String surgeryMode;//手术方式

  @TableField("fish_augmentation")
  private String fishAugmentation;//FISH扩增

  @TableField("genetic_test")
  private String geneticTest;//基因检测（21基因/70基因/50基因）

  @TableField("steep_grade")
  private String steepGrade;//STEEP评分

  @TableField("diagnosis_dt")
  private String diagnosisDt;//准确诊断日期

  @TableField("death_dt")
  private String deathDt;//准确死亡日期

  @TableField("last_inpatient_dt")
  private String lastInpatientDt;//最近一次住院

  @TableField("accurate_os")
  private String accurateOs;//准确OS

  private String alive;//生存状态:1死亡；0生存

  @TableField("progress_dt")
  private String progressDt;//首次进展时间

  @TableField("delivered_fraction")
  private String deliveredFraction;//放疗次数

  @TableField("metastasis_sites")
  private String metastasisSites;//放疗转移部位数量

  @TableField("is_multi_sites")
  private String isMultiSites;//是否为多部位放疗:0否；1是

  @TableField("is_galactophore_radiation")
  private String isGalactophoreRadiation;//有无胸壁/乳腺放疗:0无；1有

  @TableField("galactophore_radiation")
  private String galactophoreRadiation;//胸壁放疗时间、范围及剂量

  @TableField("is_brain_metastases")
  private String isBrainMetastases;//有无脑转移:0无；1有

  @TableField("is_brain_radiation")
  private String isBrainRadiation;//有无脑放疗:0无；1有

  @TableField("brain_metastasis_radiation")
  private String brainMetastasisRadiation;//脑转移放疗

  @TableField("is_bone_metastases")
  private String isBoneMetastases;//有无骨转移:0无；1有

  @TableField("is_bone_radiation")
  private String isBoneRadiation;//有无骨放疗:0无；1有

  @TableField("bone_metastasis_radiation")
  private String boneMetastasisRadiation;//骨转移放疗

  @TableField("is_hepatic_metastases")
  private String isHepaticMetastases;//有无肝转移:0无；1有

  @TableField("adrenal_metastasis_radiation")
  private String adrenalMetastasisRadiation;//肾上腺转移放疗

  @TableField("other_metastasis_radiation")
  private String otherMetastasisRadiation;//其他转移放疗

  @TableField("her2_drug")
  private String her2Drug;//是否用抗Her-2药物

  private String incretion;//是否用内分泌

  private String immunized;//是否用免疫

  private String status; //in_progress 在治；completed 结束治疗

  @TableField("holistic_tx1")
  private String holisticTx1;//全身治疗方案1

  @TableField("holistic_tx2")
  private String holisticTx2;//全身治疗方案2

  @TableField("holistic_tx3")
  private String holisticTx3;//全身治疗方案3

  @TableField("holistic_tx4")
  private String holisticTx4; //全身治疗方案4

  @TableField("holistic_tx5")
  private String holisticTx5; //全身治疗方案5

  @TableField("holistic_tx6")
  private String holisticTx6;  //全身治疗方案6

  @TableField("holistic_tx7")
  private String holisticTx7; //全身治疗方案7

  @TableField("created_at")
  private Date createdAt;

  @TableField("created_by")
  private String createdBy;

  @TableField("updated_at")
  private Date updatedAt;

  @TableField("updated_by")
  private String updatedBy;

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

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

  @Override
  protected Serializable pkVal() {
    return this.id;
  }
}
