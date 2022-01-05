package com.zivy009.demo.springbootshirodwz.services.impexp.dto;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelIgnore;
import com.zivy009.demo.springbootshirodwz.services.bloodtested.dto.BloodTestedDto;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.apache.commons.collections.CollectionUtils;

public class BloodTestedExcelDto {
  private Long id;

  @ExcelIgnore
  private String treatCourseId;

  @Excel(name = "检测时间")
  private String testedName;//检测name

  @Excel(name = "白细胞")
  private String whiteCells;//白细胞

  @Excel(name = "中性粒细胞")
  private String neutrophilLeucocyte;//中性粒细胞

  @Excel(name = "淋巴细胞")
  private String lymphocyte;//淋巴细胞

  @Excel(name = "单核细胞")
  private String monocyte;//单核细胞

  @Excel(name = "血小板")
  private String thrombocyte;//血小板

  @Excel(name = "SII")
  private String sii;//SII

  @Excel(name = "NLR")
  private String nlr;//NLR

  @Excel(name = "PLR")
  private String plr;//PLR

  @Excel(name = "LMR")
  private String lmr;//LMR

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

  public String getTestedName() {
    return testedName;
  }

  public void setTestedName(String testedName) {
    this.testedName = testedName;
  }

  public String getWhiteCells() {
    return whiteCells;
  }

  public void setWhiteCells(String whiteCells) {
    this.whiteCells = whiteCells;
  }

  public String getNeutrophilLeucocyte() {
    return neutrophilLeucocyte;
  }

  public void setNeutrophilLeucocyte(String neutrophilLeucocyte) {
    this.neutrophilLeucocyte = neutrophilLeucocyte;
  }

  public String getLymphocyte() {
    return lymphocyte;
  }

  public void setLymphocyte(String lymphocyte) {
    this.lymphocyte = lymphocyte;
  }

  public String getMonocyte() {
    return monocyte;
  }

  public void setMonocyte(String monocyte) {
    this.monocyte = monocyte;
  }

  public String getThrombocyte() {
    return thrombocyte;
  }

  public void setThrombocyte(String thrombocyte) {
    this.thrombocyte = thrombocyte;
  }

  public String getSii() {
    return sii;
  }

  public void setSii(String sii) {
    this.sii = sii;
  }

  public String getNlr() {
    return nlr;
  }

  public void setNlr(String nlr) {
    this.nlr = nlr;
  }

  public String getPlr() {
    return plr;
  }

  public void setPlr(String plr) {
    this.plr = plr;
  }

  public String getLmr() {
    return lmr;
  }

  public void setLmr(String lmr) {
    this.lmr = lmr;
  }

  public static BloodTestedExcelDto fromDto(BloodTestedDto dto) {
    BloodTestedExcelDto result = new BloodTestedExcelDto();
    if (Objects.isNull(dto)) {
      return result;
    }
    result.setId(dto.getId());
    result.setTreatCourseId(dto.getTreatCourseId());
    result.setTestedName(dto.getTestedName());
    result.setWhiteCells(dto.getWhiteCells());
    result.setNeutrophilLeucocyte(dto.getNeutrophilLeucocyte());
    result.setLymphocyte(dto.getLymphocyte());
    result.setMonocyte(dto.getMonocyte());
    result.setThrombocyte(dto.getThrombocyte());
    result.setSii(dto.getSii());
    result.setNlr(dto.getNlr());
    result.setPlr(dto.getPlr());
    result.setLmr(dto.getLmr());
    return result;
  }
  public static List<BloodTestedExcelDto> fromDtoList(List<BloodTestedDto> list) {
    List<BloodTestedExcelDto> result = new ArrayList<>();
    if (CollectionUtils.isEmpty(list)) {
      return result;
    }
    list.forEach(p -> result.add(fromDto(p)));
    return result;
  }
}
