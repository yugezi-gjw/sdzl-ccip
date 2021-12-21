package com.zivy009.demo.springbootshirodwz.services.patient.controller;

import com.zivy009.demo.springbootshirodwz.common.PageHandler;
import com.zivy009.demo.springbootshirodwz.common.exception.MyRuntimeException;
import com.zivy009.demo.springbootshirodwz.common.exception.MyRuntimeRightException;
import com.zivy009.demo.springbootshirodwz.common.http.RequestUtil;
import com.zivy009.demo.springbootshirodwz.controller.base.BaseController;
import com.zivy009.demo.springbootshirodwz.services.bloodtested.dto.BloodTestedDto;
import com.zivy009.demo.springbootshirodwz.services.bloodtested.service.IBloodTestedService;
import com.zivy009.demo.springbootshirodwz.services.encounter.dto.EncounterDto;
import com.zivy009.demo.springbootshirodwz.services.encounter.service.IEncounterService;
import com.zivy009.demo.springbootshirodwz.services.patient.dto.PatientAdvSearchDto;
import com.zivy009.demo.springbootshirodwz.services.patient.dto.PatientDto;
import com.zivy009.demo.springbootshirodwz.services.patient.service.PatientServiceImpl;
import com.zivy009.demo.springbootshirodwz.services.patient.vo.PatientListVo;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.servlet.http.HttpServletRequest;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/patient")
public class PatientController extends BaseController<PatientServiceImpl> {

    @Autowired
    IEncounterService encounterService;
    @Autowired
    IBloodTestedService bloodTestedService;

    String viewRoot = "patient";

    @RequestMapping("/list")
    @RequiresPermissions("base:list")
    protected String list(Model model, HttpServletRequest request, @RequestParam(value = "pageNum", defaultValue = "1") int pageIndex,
            @RequestParam(value = "numPerPage", defaultValue = "5") int pageSize) {

        PageHandler page = new PageHandler(pageIndex, pageSize);
        List<PatientListVo> list = new ArrayList<>();
        String keyword = RequestUtil.getString(request, "keyword");
        PatientAdvSearchDto searchParam = null;
//        if (Objects.isNull(keyword)) {
//            searchParam = getParamFromRequest(request);
//            list = baseService.list(page, searchParam);
//        } else {
            list = baseService.list(page, keyword);
//        }

        model.addAttribute("page", page);
        model.addAttribute("list", list);
        model.addAttribute("keyword", keyword);
        return viewRoot + "/list";
    }

    private PatientAdvSearchDto getParamFromRequest(HttpServletRequest request) {
        String patientName = RequestUtil.getString(request, "patientName");
        String inpatientId = RequestUtil.getString(request, "inpatientId");
        String gender = RequestUtil.getString(request, "gender");
        String nationalId = RequestUtil.getString(request, "nationalId");
        String stage = RequestUtil.getString(request, "stage");
        String egfr = RequestUtil.getString(request, "egfr");
        String diagnosisDt = RequestUtil.getString(request, "diagnosisDt");
        String deathDt = RequestUtil.getString(request, "deathDt");
        String lastInpatientDt = RequestUtil.getString(request, "lastInpatientDt");
        String accurateOs = RequestUtil.getString(request, "accurateOs");
        String alive = RequestUtil.getString(request, "alive");
        String progressDt = RequestUtil.getString(request, "progressDt");
        String deliveredFraction = RequestUtil.getString(request, "deliveredFraction");
        String treatType = RequestUtil.getString(request, "treatType");
        String synchronous = RequestUtil.getString(request, "synchronous");
        String metastasisSites = RequestUtil.getString(request, "metastasisSites");
        String isMultiSites = RequestUtil.getString(request, "isMultiSites");
        String isPulmonaryRadiation = RequestUtil.getString(request, "isPulmonaryRadiation");
        String pulmonaryMetastasisRadiation = RequestUtil.getString(request, "pulmonaryMetastasisRadiation");
        String isBrainMetastases = RequestUtil.getString(request, "isBrainMetastases");
        String isBrainRadiation = RequestUtil.getString(request, "isBrainRadiation");
        String brainMetastasisRadiation = RequestUtil.getString(request, "brainMetastasisRadiation");
        String isBoneMetastases = RequestUtil.getString(request, "isBoneMetastases");
        String isBoneRadiation = RequestUtil.getString(request, "isBoneRadiation");
        String boneMetastasisRadiation = RequestUtil.getString(request, "boneMetastasisRadiation");
        String adrenalMetastasisRadiation = RequestUtil.getString(request, "adrenalMetastasisRadiation");
        String otherMetastasisRadiation = RequestUtil.getString(request, "otherMetastasisRadiation");
        String cmdTimeSeq = RequestUtil.getString(request, "cmdTimeSeq");
        String cmsTimeSeq = RequestUtil.getString(request, "cmsTimeSeq");
        String sideReaction = RequestUtil.getString(request, "sideReaction");
        String tki = RequestUtil.getString(request, "tki");
        String platinumDoublet = RequestUtil.getString(request, "platinumDoublet");
        String gefitinib = RequestUtil.getString(request, "gefitinib");
        String angiostatin = RequestUtil.getString(request, "angiostatin");
        String icotinib = RequestUtil.getString(request, "icotinib");
        String holisticTx1 = RequestUtil.getString(request, "holisticTx1");
        String holisticTx2 = RequestUtil.getString(request, "holisticTx2");
        String holisticTx3 = RequestUtil.getString(request, "holisticTx3");
        String holisticTx4 = RequestUtil.getString(request, "holisticTx4");
        String holisticTx5 = RequestUtil.getString(request, "holisticTx5");
        String holisticTx6 = RequestUtil.getString(request, "holisticTx6");
        String holisticTx7 = RequestUtil.getString(request, "holisticTx7");

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
        dto.setHolisticTx1(holisticTx1);
        dto.setHolisticTx2(holisticTx2);
        dto.setHolisticTx3(holisticTx3);
        dto.setHolisticTx4(holisticTx4);
        dto.setHolisticTx5(holisticTx5);
        dto.setHolisticTx6(holisticTx6);
        dto.setHolisticTx7(holisticTx7);
        return dto;
    }

    @RequestMapping("/add")
    @RequiresPermissions("patient:add")
    String addView(Model model, HttpServletRequest request) {
        model.addAttribute("model", null);
        return viewRoot + "/add";
    }

    @RequestMapping("/adv_search")
    @RequiresPermissions("base:list")
    String adv_search(Model model, HttpServletRequest request) {
        model.addAttribute("model", null);
        return viewRoot + "/adv_search";
    }

    @RequestMapping("/upd")
    @RequiresPermissions("patient:upd")
    String updView(Model model, HttpServletRequest request, @RequestParam(value = "id", defaultValue = "0") Long id) {
        PatientDto patientDto = null;
        if (id != 0) {
            patientDto = baseService.selectById(id);
        } else {
            throw new MyRuntimeException("");
        }
        model.addAttribute("model", patientDto);
        return viewRoot + "/add";
    }

    @RequestMapping(value = "/save")
    @ResponseBody
    String save(PatientDto patientDto) {

        String jsonReturn = this.ajaxSuccess();
        int returnInt = 0;
        try {
            if (patientDto.getId() != null) {
                returnInt = baseService.update(patientDto);
            } else {
                returnInt = baseService.save(patientDto);
            }

        }catch(MyRuntimeRightException rightE){
            jsonReturn = this.ajaxFail("警告：" + rightE.getMessage());
        }catch (Exception e) {

            e.printStackTrace();
            jsonReturn = this.ajaxFail("发生异常：" + e.getMessage());
        }
        return jsonReturn;
    }

    @RequestMapping(value = "/del")
    @RequiresPermissions("patient:del")
    @ResponseBody
    String del(@RequestParam(value = "id", defaultValue = "0") Long id) {
        String jsonReturn = this.ajaxDelSuccess();
        try {
            int returnInt = baseService.delLogical(id);

        }catch(MyRuntimeRightException rightE){
            jsonReturn = this.ajaxFail("警告：" + rightE.getMessage());
        }catch (Exception e) {
            e.printStackTrace();
            jsonReturn = this.ajaxFail("发生异常：" + e.getMessage());
        }
        return jsonReturn;
    }

    @RequestMapping("/detail")
    @RequiresPermissions("patient:list")
    String detail(Model model, HttpServletRequest request, @RequestParam(value = "id", defaultValue = "0") Long id) {
        PatientDto patientDto = null;
        if (id != 0) {
            patientDto = baseService.selectById(id);
        } else {
            throw new MyRuntimeException("");
        }
        EncounterDto encounterDto = encounterService.queryActiveEncounterByPatient(
            patientDto.getId());
        model.addAttribute("patient", patientDto);
        model.addAttribute("encounter", encounterDto);

//        List<BloodTestedDto> list = bloodTestedService.queryByEncounterId(encounterDto.getId());
//        model.addAttribute("list", list);
        return viewRoot + "/detail";
    }
}
