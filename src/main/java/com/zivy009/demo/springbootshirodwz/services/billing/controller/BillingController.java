package com.zivy009.demo.springbootshirodwz.services.billing.controller;

import com.zivy009.demo.springbootshirodwz.common.PageHandler;
import com.zivy009.demo.springbootshirodwz.common.http.RequestUtil;
import com.zivy009.demo.springbootshirodwz.controller.base.BaseController;
import com.zivy009.demo.springbootshirodwz.persistence.model.BillingItem;
import com.zivy009.demo.springbootshirodwz.service.impl.DiagnosisService;
import com.zivy009.demo.springbootshirodwz.service.impl.PractitionerService;
import com.zivy009.demo.springbootshirodwz.service.impl.PrescriptionService;
import com.zivy009.demo.springbootshirodwz.service.impl.TechnicalService;
import com.zivy009.demo.springbootshirodwz.services.billing.dto.PatientBillingDto;
import com.zivy009.demo.springbootshirodwz.services.billing.service.IBillingItemService;
import com.zivy009.demo.springbootshirodwz.services.billing.service.PatientBillingServiceImpl;
import com.zivy009.demo.springbootshirodwz.services.patient.service.PatientServiceImpl;
import com.zivy009.demo.springbootshirodwz.services.patient.vo.PatientListVo;
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
@RequestMapping(value = "/billing")
public class BillingController extends BaseController<PatientBillingServiceImpl> {

    @Autowired
    PatientServiceImpl patientService;
    @Autowired
    TechnicalService technicalService;
    @Autowired
    PractitionerService practitionerService;
    @Autowired
    DiagnosisService diagnosisService;
    @Autowired
    PrescriptionService prescriptionService;
    @Autowired
    IBillingItemService billingItemService;

    String viewRoot = "billing";

    @RequestMapping("/main")
    @RequiresPermissions("billing:list")
    protected String main(Model model, HttpServletRequest request, @RequestParam(value = "pageNum", defaultValue = "1") int pageIndex,
            @RequestParam(value = "numPerPage", defaultValue = "5") int pageSize) {

        PageHandler page = new PageHandler(pageIndex, pageSize);
        String keyword = RequestUtil.getString(request, "keyword");
        List<PatientListVo> list = patientService.list(page, keyword);

        List<BillingItem> billingItemList = billingItemService.queryActiveItems();
//        PatientDto patient = patientService.queryDtoByPatientId(patientId);
        PatientBillingDto patientBillingDto = new PatientBillingDto();
//        patientBillingDto.setPatientId(patientId);
//        patientBillingDto.setEncounterId(patient.getEncounterId());
        model.addAttribute("billingItemList", billingItemList);
        model.addAttribute("model", patientBillingDto);

        model.addAttribute("page", page);
        model.addAttribute("list", list);
        model.addAttribute("keyword", keyword);
        return viewRoot + "/main";
    }

}
