package com.zivy009.demo.springbootshirodwz.services.treatcourse.dto;

import com.zivy009.demo.springbootshirodwz.services.multiprimary.dto.MultiPrimaryDto;
import com.zivy009.demo.springbootshirodwz.services.treathistory.dto.TreatHistoryDto;
import java.util.List;

public abstract class AbstractBodypartDto extends AbstractDto {

  protected String treatCourseId;

  protected String backup1;
  protected String backup2;
  protected String backup3;
  protected String backup4;
  protected String backup5;
  protected String backup6;
  protected String backup7;
  protected String backup8;
  protected String backup9;
  protected String backup10;

  protected String firstTargetUseDate; //初次靶向应用时间
  protected String firstTargetTreatDate; //初次靶向放疗时间
  protected String kps;
  protected String nrs2002;
  protected String nrs;
  protected String aprint;

  protected List<MultiPrimaryDto> multiPrimaryList; //多原发
  protected List<TreatHistoryDto> treatHistoryList; //治疗

  public String getTreatCourseId() {
    return treatCourseId;
  }

  public void setTreatCourseId(String treatCourseId) {
    this.treatCourseId = treatCourseId;
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

  public List<MultiPrimaryDto> getMultiPrimaryList() {
    return multiPrimaryList;
  }

  public void setMultiPrimaryList(
      List<MultiPrimaryDto> multiPrimaryList) {
    this.multiPrimaryList = multiPrimaryList;
  }

  public List<TreatHistoryDto> getTreatHistoryList() {
    return treatHistoryList;
  }

  public void setTreatHistoryList(
      List<TreatHistoryDto> treatHistoryList) {
    this.treatHistoryList = treatHistoryList;
  }
}
