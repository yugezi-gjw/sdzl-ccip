package com.zivy009.demo.springbootshirodwz.services.patientrt.controller;

import com.zivy009.demo.springbootshirodwz.common.PageHandler;
import com.zivy009.demo.springbootshirodwz.common.http.RequestUtil;
import com.zivy009.demo.springbootshirodwz.controller.base.BaseController;
import com.zivy009.demo.springbootshirodwz.services.patient.dto.PatientDto;
import com.zivy009.demo.springbootshirodwz.services.patient.service.PatientServiceImpl;
import com.zivy009.demo.springbootshirodwz.services.patient.vo.PatientListVo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/patientrt")
public class PatientRTController {

    @Autowired
    PatientServiceImpl patientService;

    String viewRoot = "patientrt";

    @RequestMapping("/main")
    @RequiresPermissions("patient:list")
    protected String main(Model model, HttpServletRequest request, @RequestParam(value = "pageNum", defaultValue = "1") int pageIndex,
            @RequestParam(value = "numPerPage", defaultValue = "25") int pageSize) {

        PageHandler page = new PageHandler(pageIndex, pageSize);
        String keyword = RequestUtil.getString(request, "keyword");
        List<PatientDto> list = patientService.list(page, keyword);

//        PatientBillingDto patientBillingDto = new PatientBillingDto();
//        model.addAttribute("model", patientBillingDto);

        model.addAttribute("page", page);
        model.addAttribute("list", list);
        model.addAttribute("keyword", keyword);
        return viewRoot + "/main";
    }
    @RequestMapping("/entry")
    @RequiresPermissions("patient:list")
    protected String entry(Model model, HttpServletRequest request, @RequestParam(value = "pageNum", defaultValue = "1") int pageIndex,
            @RequestParam(value = "numPerPage", defaultValue = "25") int pageSize) {

        PageHandler page = new PageHandler(pageIndex, pageSize);
        String keyword = RequestUtil.getString(request, "keyword");
        List<PatientDto> list = patientService.list(page, keyword);

//        PatientBillingDto patientBillingDto = new PatientBillingDto();
//        model.addAttribute("model", patientBillingDto);

        model.addAttribute("page", page);
        model.addAttribute("list", list);
        model.addAttribute("keyword", keyword);
        return viewRoot + "/entry";
    }

    @RequestMapping("/adv_search")
    @RequiresPermissions("patient:list")
    protected String adv_search(Model model, HttpServletRequest request) {
//        PatientDto searchParam = getParamFromRequest(request);
//
//        model.addAttribute("patientDto", searchParam);
        return viewRoot + "/adv_search";
    }

    @RequestMapping("/patient_list")
    @RequiresPermissions("billing:list")
    protected String patientList(Model model, HttpServletRequest request, @RequestParam(value = "pageNum", defaultValue = "1") int pageIndex,
        @RequestParam(value = "numPerPage", defaultValue = "5") int pageSize) {

        PageHandler page = new PageHandler(pageIndex, pageSize);
        List<Map<String, Object>> list = new ArrayList<>();
        String keyword = RequestUtil.getString(request, "keyword");
//        PatientDto searchParam = null;
//        if (Objects.isNull(keyword)) {
//            searchParam = getParamFromRequest(request);
//            list = patientService.list(page, searchParam);
//        } else {
//            list = patientService.list(page, keyword);
//        }

        model.addAttribute("page", page);
        model.addAttribute("list", list);
        model.addAttribute("keyword", keyword);
        return viewRoot + "/patient_list";
    }
/*
    @RequestMapping("/patient_billing_items_no_head")
    @RequiresPermissions("billing:list")
    protected String patientBillingItemListNoHead(Model model, HttpServletRequest request) {
        List<PatientBillingDto> list = new ArrayList<>();
        String patientId = RequestUtil.getString(request, "patientId");
        if (StringUtils.isNotEmpty(patientId)) {
            list = baseService.list(patientId);
        }

        BigDecimal totalBilling = BigDecimal.ZERO;
        for (PatientBillingDto p : list) {
            BigDecimal amount = new BigDecimal(p.getAmount());
            totalBilling = totalBilling.add(p.getUnitPrice().multiply(amount));
        }

        model.addAttribute("list", list);
        return viewRoot + "/patient_billing_no_head";
    }

    @RequestMapping("/add")
    @RequiresPermissions("billing:add")
    String addView(Model model, HttpServletRequest request) {
        List<BillingItem> billingItemList = billingItemService.queryActiveItems();
        String patientId = RequestUtil.getString(request, "patientId");
        PatientDto patient = patientService.queryDtoByPatientId(patientId);
        PatientBillingDto patientBillingDto = new PatientBillingDto();
        patientBillingDto.setPatientId(patientId);
        patientBillingDto.setEncounterId(patient.getEncounterId());
        model.addAttribute("billingItemList", billingItemList);
        model.addAttribute("patient", patient);
        model.addAttribute("model", patientBillingDto);
        return viewRoot + "/billing_add";
    }

    @RequestMapping(value = "/saveItem")
    @RequiresPermissions("billing:add")
    @ResponseBody
    String saveItem(Model model, HttpServletRequest request, @RequestParam(value = "pageNum", defaultValue = "1") int pageIndex,
        @RequestParam(value = "numPerPage", defaultValue = "50") int pageSize, PatientBillingDto patientBillingDto) {

        String jsonReturn = this.ajaxSuccess();
        try {
            String patientId = RequestUtil.getString(request, "patientId");
            PatientDto patient = patientService.queryDtoByPatientId(patientId);
            patientBillingDto.setEncounterId(patient.getEncounterId());
            baseService.save(patientBillingDto);
        }catch(MyRuntimeRightException rightE){
            jsonReturn = this.ajaxFail("警告：" + rightE.getMessage());
        }catch (Exception e) {

            e.printStackTrace();
            jsonReturn = this.ajaxFail("发生异常：" + e.getMessage());
        }
        return jsonReturn;
    }

    @RequestMapping(value = "/del")
    @RequiresPermissions("billing:del")
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

    private PatientDto getParamFromRequest(HttpServletRequest request) {
        String patientName = RequestUtil.getString(request, "patientName");
        String physician = RequestUtil.getString(request, "physician");
        String outpatientRoom = RequestUtil.getString(request, "outpatientRoom");
        String patientId = RequestUtil.getString(request, "patientId");
        String diagnosis = RequestUtil.getString(request, "diagnosis");
        String prescription = RequestUtil.getString(request, "prescription");
        String technical = RequestUtil.getString(request, "technical");
        String telephone = RequestUtil.getString(request, "telephone");
        String physicist = RequestUtil.getString(request, "physicist");
        PatientDto patientDto = new PatientDto();
        patientDto.setPatientName(patientName);
        patientDto.setPhysician(physician);
        patientDto.setOutpatientRoom(outpatientRoom);
        patientDto.setPatientId(patientId);
        patientDto.setDiagnosis(diagnosis);
        patientDto.setPrescription(prescription);
        patientDto.setTechnical(technical);
        patientDto.setTelephone(telephone);
        patientDto.setPhysicist(physicist);
        return patientDto;
    }

 */
}
