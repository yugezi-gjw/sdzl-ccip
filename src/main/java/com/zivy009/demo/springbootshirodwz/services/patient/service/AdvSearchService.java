package com.zivy009.demo.springbootshirodwz.services.patient.service;

import com.zivy009.demo.springbootshirodwz.common.http.RequestUtil;
import com.zivy009.demo.springbootshirodwz.services.patient.dto.PatientAdvSearchDto;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

@Service
public class AdvSearchService {

  public PatientAdvSearchDto getParamFromRequest(HttpServletRequest request) {
    String patientName = RequestUtil.getString(request, "patientName");
    String inpatientId = RequestUtil.getString(request, "inpatientId");
    String gender = RequestUtil.getString(request, "gender");
    String nationalId = RequestUtil.getString(request, "nationalId");

    String stage = RequestUtil.getString(request, "stage");
    String diagnosisDt = RequestUtil.getString(request, "diagnosisDt");
    String deathDt = RequestUtil.getString(request, "deathDt");
    String lastInpatientDt = RequestUtil.getString(request, "lastInpatientDt");
    String accurateOs = RequestUtil.getString(request, "accurateOs");
    String alive = RequestUtil.getString(request, "alive");
    String progressDt = RequestUtil.getString(request, "progressDt");
    String deliveredFraction = RequestUtil.getString(request, "deliveredFraction");
    String metastasisSites = RequestUtil.getString(request, "metastasisSites");
    String isMultiSites = RequestUtil.getString(request, "isMultiSites");
    String isBrainMetastases = RequestUtil.getString(request, "isBrainMetastases");
    String isBrainRadiation = RequestUtil.getString(request, "isBrainRadiation");
    String brainMetastasisRadiation = RequestUtil.getString(request, "brainMetastasisRadiation");
    String isBoneMetastases = RequestUtil.getString(request, "isBoneMetastases");
    String isBoneRadiation = RequestUtil.getString(request, "isBoneRadiation");
    String boneMetastasisRadiation = RequestUtil.getString(request, "boneMetastasisRadiation");
    String adrenalMetastasisRadiation = RequestUtil.getString(request, "adrenalMetastasisRadiation");
    String otherMetastasisRadiation = RequestUtil.getString(request, "otherMetastasisRadiation");
    String holisticTx = RequestUtil.getString(request, "holisticTx");
    String backup1 = RequestUtil.getString(request, "backup1");
    String backup2 = RequestUtil.getString(request, "backup2");
    String backup3 = RequestUtil.getString(request, "backup3");
    String backup4 = RequestUtil.getString(request, "backup4");
    String backup5 = RequestUtil.getString(request, "backup5");
    String backup6 = RequestUtil.getString(request, "backup6");
    String backup7 = RequestUtil.getString(request, "backup7");
    String backup8 = RequestUtil.getString(request, "backup8");
    String backup9 = RequestUtil.getString(request, "backup9");
    String backup10 = RequestUtil.getString(request, "backup10");

    String multiPrimary = RequestUtil.getString(request, "multiPrimary");
    String multiPrimaryBodypart = RequestUtil.getString(request, "multiPrimaryBodypart");
    String treatHistoryType = RequestUtil.getString(request, "treatHistoryType");
    String treatHistoryPlan = RequestUtil.getString(request, "treatHistoryPlan");

    String bodypart = RequestUtil.getString(request, "bodypart");

    String egfr = RequestUtil.getString(request, "egfr");
    String treatType = RequestUtil.getString(request, "treatType");
    String synchronous = RequestUtil.getString(request, "synchronous");
    String isPulmonaryRadiation = RequestUtil.getString(request, "isPulmonaryRadiation");
    String pulmonaryMetastasisRadiation = RequestUtil.getString(request, "pulmonaryMetastasisRadiation");
    String cmdTimeSeq = RequestUtil.getString(request, "cmdTimeSeq");
    String cmsTimeSeq = RequestUtil.getString(request, "cmsTimeSeq");
    String sideReaction = RequestUtil.getString(request, "sideReaction");
    String tki = RequestUtil.getString(request, "tki");
    String platinumDoublet = RequestUtil.getString(request, "platinumDoublet");
    String gefitinib = RequestUtil.getString(request, "gefitinib");
    String angiostatin = RequestUtil.getString(request, "angiostatin");
    String icotinib = RequestUtil.getString(request, "icotinib");

    String menarcheAge = RequestUtil.getString(request, "menarcheAge");//初潮年龄
    String amenorrheaAge = RequestUtil.getString(request, "amenorrheaAge");//闭经年龄
    String molecularSubtyping = RequestUtil.getString(request, "molecularSubtyping");//分子分型
    String er = RequestUtil.getString(request, "er");//ER
    String pr = RequestUtil.getString(request, "pr");//PR
    String her2 = RequestUtil.getString(request, "her2");//Her-2
    String ki67 = RequestUtil.getString(request, "ki67");//Ki-67
    String surgeryMode = RequestUtil.getString(request, "surgeryMode");//手术方式
    String fishAugmentation = RequestUtil.getString(request, "fishAugmentation");//FISH扩增
    String geneticTest = RequestUtil.getString(request, "geneticTest");//基因检测（21基因/70基因/50基因）
    String steepGrade = RequestUtil.getString(request, "steepGrade");//STEEP评分
    String isGalactophoreRadiation = RequestUtil.getString(request, "isGalactophoreRadiation");//有无胸壁/乳腺放疗:0无；1有
    String galactophoreRadiation = RequestUtil.getString(request, "galactophoreRadiation");//胸壁放疗时间、范围及剂量
    String her2Drug = RequestUtil.getString(request, "her2Drug");//是否用抗Her-2药物
    String incretion = RequestUtil.getString(request, "incretion");//是否用内分泌
    String immunized = RequestUtil.getString(request, "immunized");//是否用免疫

    PatientAdvSearchDto dto = new PatientAdvSearchDto();
    dto.setPatientName(patientName);
    dto.setInpatientId(inpatientId);
    dto.setGender(gender);
    dto.setNationalId(nationalId);
    dto.setStage(stage);
    dto.setEgfr(egfr);
    dto.setDiagnosisDt(diagnosisDt);
    dto.setDeathDt(deathDt);
    dto.setLastInpatientDt(lastInpatientDt);
    dto.setAccurateOs(accurateOs);
    dto.setAlive(alive);
    dto.setProgressDt(progressDt);
    dto.setDeliveredFraction(deliveredFraction);
    dto.setTreatType(treatType);
    dto.setSynchronous(synchronous);
    dto.setMetastasisSites(metastasisSites);
    dto.setIsMultiSites(isMultiSites);
    dto.setIsPulmonaryRadiation(isPulmonaryRadiation);
    dto.setPulmonaryMetastasisRadiation(pulmonaryMetastasisRadiation);
    dto.setIsBrainMetastases(isBrainMetastases);
    dto.setIsBrainRadiation(isBrainRadiation);
    dto.setBrainMetastasisRadiation(brainMetastasisRadiation);
    dto.setIsBoneMetastases(isBoneMetastases);
    dto.setIsBoneRadiation(isBoneRadiation);
    dto.setBoneMetastasisRadiation(boneMetastasisRadiation);
    dto.setAdrenalMetastasisRadiation(adrenalMetastasisRadiation);
    dto.setOtherMetastasisRadiation(otherMetastasisRadiation);
    dto.setCmdTimeSeq(cmdTimeSeq);
    dto.setCmsTimeSeq(cmsTimeSeq);
    dto.setSideReaction(sideReaction);
    dto.setTki(tki);
    dto.setPlatinumDoublet(platinumDoublet);
    dto.setGefitinib(gefitinib);
    dto.setAngiostatin(angiostatin);
    dto.setIcotinib(icotinib);
    dto.setHolisticTx(holisticTx);
    dto.setBackup1(backup1);
    dto.setBackup2(backup2);
    dto.setBackup3(backup3);
    dto.setBackup4(backup4);
    dto.setBackup5(backup5);
    dto.setBackup6(backup6);
    dto.setBackup7(backup7);
    dto.setBackup8(backup8);
    dto.setBackup9(backup9);
    dto.setBackup10(backup10);

    dto.setMultiPrimary(multiPrimary);
    dto.setMultiPrimaryBodypart(multiPrimaryBodypart);
    dto.setTreatHistoryType(treatHistoryType);
    dto.setTreatHistoryPlan(treatHistoryPlan);

    dto.setMenarcheAge(menarcheAge);
    dto.setAmenorrheaAge(amenorrheaAge);
    dto.setMolecularSubtyping(molecularSubtyping);
    dto.setEr(er);
    dto.setPr(pr);
    dto.setHer2(her2);
    dto.setKi67(ki67);
    dto.setSurgeryMode(surgeryMode);
    dto.setFishAugmentation(fishAugmentation);
    dto.setGeneticTest(geneticTest);
    dto.setSteepGrade(steepGrade);
    dto.setIsGalactophoreRadiation(isGalactophoreRadiation);
    dto.setGalactophoreRadiation(galactophoreRadiation);
    dto.setHer2Drug(her2Drug);
    dto.setIncretion(incretion);
    dto.setImmunized(immunized);

    dto.setBodypart(bodypart);
    return dto;
  }
}
