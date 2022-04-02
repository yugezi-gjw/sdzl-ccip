package com.zivy009.demo.springbootshirodwz.persistence.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import java.io.Serializable;
import java.util.Date;

@TableName("treat_course_chest")
public class TreatCourseChest extends Model<TreatCourseChest> implements Serializable {
  private static final long serialVersionUID = 1L;

  @TableId(value="id", type= IdType.AUTO)
  private Long id;

  @TableField("treat_course_id")
  private String treatCourseId;

  private String age;//年龄

  private String stage;//分期

  private String egfr;//EGFR基因突变

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
  private String progressDt;//进展时间

  @TableField("delivered_fraction")
  private String deliveredFraction;//放疗次数

  @TableField("treat_type")
  private String treatType;//靶向先为1，放疗先为2，同步为0

  private String synchronous;//是否同步

  @TableField("metastasis_sites")
  private String metastasisSites;//放疗转移部位数量

  @TableField("is_multi_sites")
  private String isMultiSites;//是否为多部位放疗:0否；1是

  @TableField("is_pulmonary_radiation")
  private String isPulmonaryRadiation;//有无肺部放疗:0无；1有

  @TableField("pulmonary_metastasis_radiation")
  private String pulmonaryMetastasisRadiation;//肺转移放疗

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

  @TableField("adrenal_metastasis_radiation")
  private String adrenalMetastasisRadiation;//肾上腺转移放疗

  @TableField("other_metastasis_radiation")
  private String otherMetastasisRadiation;//其他转移放疗

  @TableField("cmd_time_seq")
  private String cmdTimeSeq;//胸部放疗与诊断时间时序

  @TableField("cms_time_seq")
  private String cmsTimeSeq;//胸部放疗与系统治疗时序

  @TableField("side_reaction")
  private String sideReaction;//放射性副反应

  private String tki;//TKI是否为一线用药

  private String status; //in_progress 在治；completed 结束治疗

  @TableField("platinum_doublet")
  private String platinumDoublet;//Platinum doublet

  private String gefitinib;//是否用吉非替尼

  private String angiostatin;//是否用厄洛替尼

  private String icotinib;//是否用埃克替尼

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

  @TableField("first_target_use_date")
  private String firstTargetUseDate; //初次靶向应用时间
  @TableField("first_target_treat_date")
  private String firstTargetTreatDate; //初次靶向放疗时间
  private String kps;
  private String nrs2002;
  private String nrs;
  private String aprint;

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

  public String getFirstTargetUseDate() {
    return firstTargetUseDate;
  }

  public void setFirstTargetUseDate(String firstTargetUseDate) {
    this.firstTargetUseDate = firstTargetUseDate;
  }

  public String getFirstTargetTreatDate() {
    return firstTargetTreatDate;
  }

  public void setFirstTargetTreatDate(String firstTargetTreatDate) {
    this.firstTargetTreatDate = firstTargetTreatDate;
  }

  public String getKps() {
    return kps;
  }

  public void setKps(String kps) {
    this.kps = kps;
  }

  public String getNrs2002() {
    return nrs2002;
  }

  public void setNrs2002(String nrs2002) {
    this.nrs2002 = nrs2002;
  }

  public String getNrs() {
    return nrs;
  }

  public void setNrs(String nrs) {
    this.nrs = nrs;
  }

  public String getAprint() {
    return aprint;
  }

  public void setAprint(String aprint) {
    this.aprint = aprint;
  }

  @Override
  protected Serializable pkVal() {
    return this.id;
  }
}
