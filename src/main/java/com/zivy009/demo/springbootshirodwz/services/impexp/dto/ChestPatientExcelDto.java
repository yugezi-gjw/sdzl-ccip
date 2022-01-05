package com.zivy009.demo.springbootshirodwz.services.impexp.dto;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;
import cn.afterturn.easypoi.excel.annotation.ExcelIgnore;
import com.zivy009.demo.springbootshirodwz.common.tools.StringUtil;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.lang3.StringUtils;

public class ChestPatientExcelDto {

  /** 主键id */
  private Long id;

  @ExcelIgnore
  private String treatCourseId;

  @Excel(name = "住院号")
  private String inpatientId;

  @Excel(name = "姓名")
  private String patientName;

  @Excel(name = "性别")
  private String gender;

  @Excel(name = "是否大于60岁")
  private String isLarger60Years;

  @Excel(name = "身份证号")
  private String nationalId;

  @Excel(name = "手机号1")
  private String telephone;

  @Excel(name = "手机号2")
  private String telephone2;

  @Excel(name = "吸烟史")
  private String smoker;

  @Excel(name = "年龄")
  private String age;//年龄

  @Excel(name = "分期")
  private String stage;//分期

  @Excel(name = "EGFR基因突变")
  private String egfr;//EGFR基因突变

  @Excel(name = "准确诊断日期")
  private String diagnosisDt;//准确诊断日期

  @Excel(name = "准确死亡日期")
  private String deathDt;//准确死亡日期

  @Excel(name = "最近一次住院")
  private String lastInpatientDt;//最近一次住院

  @Excel(name = "准确OS")
  private String accurateOs;//准确OS

  @Excel(name = "生存状态")
  private String alive;//生存状态:0死亡；1生存

  @Excel(name = "进展时间")
  private String progressDt;//进展时间

  @Excel(name = "放疗次数")
  private String deliveredFraction;//放疗次数

  @Excel(name = "靶向先为1，放疗先为2，同步为0")
  private String treatType;//靶向先为1，放疗先为2，同步为0

  @Excel(name = "是否同步")
  private String synchronous;//是否同步

  @ExcelCollection(name = "化验结果")
  private List<BloodTestedExcelDto> bloodTestedExcelDtoList;

  @Excel(name = "放疗转移部位数量")
  private String metastasisSites;//放疗转移部位数量

  @Excel(name = "是否为多部位放疗")
  private String isMultiSites;//是否为多部位放疗:0否；1是

  @Excel(name = "有无肺部放疗")
  private String isPulmonaryRadiation;//有无肺部放疗:0无；1有

  @Excel(name = "肺转移放疗")
  private String pulmonaryMetastasisRadiation;//肺转移放疗

  @Excel(name = "有无脑转移")
  private String isBrainMetastases;//有无脑转移:0无；1有

  @Excel(name = "有无脑放疗")
  private String isBrainRadiation;//有无脑放疗:0无；1有

  @Excel(name = "脑转移放疗")
  private String brainMetastasisRadiation;//脑转移放疗

  @Excel(name = "有无骨转移")
  private String isBoneMetastases;//有无骨转移:0无；1有

  @Excel(name = "有无骨放疗")
  private String isBoneRadiation;//有无骨放疗:0无；1有

  @Excel(name = "骨转移放疗")
  private String boneMetastasisRadiation;//骨转移放疗

  @Excel(name = "肾上腺转移放疗")
  private String adrenalMetastasisRadiation;//肾上腺转移放疗

  @Excel(name = "其他转移放疗")
  private String otherMetastasisRadiation;//其他转移放疗

  @Excel(name = "胸部放疗与诊断时间时序")
  private String cmdTimeSeq;//胸部放疗与诊断时间时序

  @Excel(name = "胸部放疗与系统治疗时序")
  private String cmsTimeSeq;//胸部放疗与系统治疗时序

  @Excel(name = "放射性副反应")
  private String sideReaction;//放射性副反应

  @Excel(name = "TKI是否为一线用药")
  private String tki;//TKI是否为一线用药

  @Excel(name = "Platinum doublet")
  private String platinumDoublet;//Platinum doublet

  @Excel(name = "是否用吉非替尼")
  private String gefitinib;//是否用吉非替尼

  @Excel(name = "是否用厄洛替尼")
  private String angiostatin;//是否用厄洛替尼

  @Excel(name = "是否用埃克替尼")
  private String icotinib;//是否用埃克替尼

  @Excel(name = "全身治疗方案1")
  private String holisticTx1;//全身治疗方案1

  @Excel(name = "全身治疗方案2")
  private String holisticTx2;//全身治疗方案2

  @Excel(name = "全身治疗方案3")
  private String holisticTx3;//全身治疗方案3

  @Excel(name = "全身治疗方案4")
  private String holisticTx4; //全身治疗方案4

  @Excel(name = "全身治疗方案5")
  private String holisticTx5; //全身治疗方案5

  @Excel(name = "全身治疗方案6")
  private String holisticTx6;  //全身治疗方案6

  @Excel(name = "全身治疗方案7")
  private String holisticTx7; //全身治疗方案7

  @Excel(name = "备用字段1")
  private String backup1;
  @Excel(name = "备用字段2")
  private String backup2;
  @Excel(name = "备用字段3")
  private String backup3;
  @Excel(name = "备用字段4")
  private String backup4;
  @Excel(name = "备用字段5")
  private String backup5;
  @Excel(name = "备用字段6")
  private String backup6;
  @Excel(name = "备用字段7")
  private String backup7;
  @Excel(name = "备用字段8")
  private String backup8;
  @Excel(name = "备用字段9")
  private String backup9;
  @Excel(name = "备用字段10")
  private String backup10;

  public static ChestPatientExcelDto fromMap(Map<String, Object> mapper) {
    ChestPatientExcelDto dto = new ChestPatientExcelDto();
    if (Objects.isNull(mapper) || mapper.isEmpty()) {
      return dto;
    }
    mapper.entrySet().forEach(entry -> {
      if (StringUtil.equals(entry.getKey(), "id")) {
        Integer id = (Integer) entry.getValue();
        dto.setId(Objects.nonNull(id) ? id.longValue() : null);
      } else if (StringUtil.equals(entry.getKey(), "treat_course_id")) {
        dto.setTreatCourseId((String) entry.getValue());
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
      else if (StringUtil.equals(entry.getKey(), "telephone")) {
        dto.setTelephone((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "telephone2")) {
        dto.setTelephone2((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "smoker")) {
        dto.setSmoker((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "age")) {
        dto.setAge((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "stage")) {
        dto.setStage((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "egfr")) {
        dto.setEgfr((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "diagnosis_dt")) {
        dto.setDiagnosisDt((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "death_dt")) {
        dto.setDeathDt((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "last_inpatient_dt")) {
        dto.setLastInpatientDt((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "accurate_os")) {
        dto.setAccurateOs((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "alive")) {
        dto.setAlive((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "progress_dt")) {
        dto.setProgressDt((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "delivered_fraction")) {
        dto.setDeliveredFraction((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "treat_type")) {
        dto.setTreatType((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "synchronous")) {
        dto.setSynchronous((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "metastasis_sites")) {
        dto.setMetastasisSites((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "is_multi_sites")) {
        dto.setIsMultiSites((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "is_pulmonary_radiation")) {
        dto.setIsPulmonaryRadiation((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "pulmonary_metastasis_radiation")) {
        dto.setPulmonaryMetastasisRadiation((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "is_brain_metastases")) {
        dto.setIsBrainMetastases((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "is_brain_radiation")) {
        dto.setIsBrainRadiation((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "brain_metastasis_radiation")) {
        dto.setBrainMetastasisRadiation((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "is_bone_metastases")) {
        dto.setIsBoneMetastases((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "is_bone_radiation")) {
        dto.setIsBoneRadiation((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "bone_metastasis_radiation")) {
        dto.setBoneMetastasisRadiation((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "adrenal_metastasis_radiation")) {
        dto.setAdrenalMetastasisRadiation((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "other_metastasis_radiation")) {
        dto.setOtherMetastasisRadiation((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "cmd_time_seq")) {
        dto.setCmdTimeSeq((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "cms_time_seq")) {
        dto.setCmsTimeSeq((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "side_reaction")) {
        dto.setSideReaction((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "tki")) {
        dto.setTki((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "platinum_doublet")) {
        dto.setPlatinumDoublet((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "gefitinib")) {
        dto.setGefitinib((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "angiostatin")) {
        dto.setAngiostatin((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "icotinib")) {
        dto.setIcotinib((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "holistic_tx1")) {
        dto.setHolisticTx1((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "holistic_tx2")) {
        dto.setHolisticTx2((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "holistic_tx3")) {
        dto.setHolisticTx3((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "holistic_tx4")) {
        dto.setHolisticTx4((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "holistic_tx5")) {
        dto.setHolisticTx5((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "holistic_tx6")) {
        dto.setHolisticTx6((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "holistic_tx7")) {
        dto.setHolisticTx7((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "backup1")) {
        dto.setBackup1((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "backup2")) {
        dto.setBackup2((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "backup3")) {
        dto.setBackup3((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "backup4")) {
        dto.setBackup4((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "backup5")) {
        dto.setBackup5((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "backup6")) {
        dto.setBackup6((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "backup7")) {
        dto.setBackup7((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "backup8")) {
        dto.setBackup8((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "backup9")) {
        dto.setBackup9((String) entry.getValue());
      }
      else if (StringUtil.equals(entry.getKey(), "backup10")) {
        dto.setBackup10((String) entry.getValue());
      }
    });
    return dto;
  }

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

  public String getIsLarger60Years() {
    return isLarger60Years;
  }

  public void setIsLarger60Years(String isLarger60Years) {
    this.isLarger60Years = isLarger60Years;
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

  public List<BloodTestedExcelDto> getBloodTestedExcelDtoList() {
    return bloodTestedExcelDtoList;
  }

  public void setBloodTestedExcelDtoList(
      List<BloodTestedExcelDto> bloodTestedExcelDtoList) {
    this.bloodTestedExcelDtoList = bloodTestedExcelDtoList;
  }

  public String getTreatCourseId() {
    return treatCourseId;
  }

  public void setTreatCourseId(String treatCourseId) {
    this.treatCourseId = treatCourseId;
  }
}
