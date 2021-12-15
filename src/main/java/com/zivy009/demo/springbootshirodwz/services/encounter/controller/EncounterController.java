package com.zivy009.demo.springbootshirodwz.services.encounter.controller;

import com.zivy009.demo.springbootshirodwz.common.PageHandler;
import com.zivy009.demo.springbootshirodwz.common.exception.MyRuntimeException;
import com.zivy009.demo.springbootshirodwz.common.exception.MyRuntimeRightException;
import com.zivy009.demo.springbootshirodwz.common.http.RequestUtil;
import com.zivy009.demo.springbootshirodwz.controller.base.BaseController;
import com.zivy009.demo.springbootshirodwz.services.bloodtested.dto.BloodTestedDto;
import com.zivy009.demo.springbootshirodwz.services.bloodtested.service.IBloodTestedService;
import com.zivy009.demo.springbootshirodwz.services.encounter.dto.EncounterDto;
import com.zivy009.demo.springbootshirodwz.services.encounter.service.EncounterServiceImpl;
import com.zivy009.demo.springbootshirodwz.services.encounter.service.IEncounterService;
import com.zivy009.demo.springbootshirodwz.services.patient.dto.PatientDto;
import com.zivy009.demo.springbootshirodwz.services.patient.service.PatientServiceImpl;
import com.zivy009.demo.springbootshirodwz.services.patient.vo.PatientListVo;
import java.util.List;
import java.util.Objects;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/encounter")
public class EncounterController extends BaseController<EncounterServiceImpl> {

    @Autowired
    IEncounterService encounterService;
    @Autowired
    IBloodTestedService bloodTestedService;

    String viewRoot = "encounter";

//    @RequestMapping("/add")
//    @RequiresPermissions("patient:add")
//    String addView(Model model, HttpServletRequest request, @RequestParam(value = "patientId", defaultValue = "0") Long patientId) {
//        EncounterDto encounterDto = new EncounterDto();
//        encounterDto.setPatientId(patientId);
//        model.addAttribute("model", encounterDto);
//        return viewRoot + "/add";
//    }

    @RequestMapping("/edit")
    @RequiresPermissions("patient:upd")
    String updView(Model model, HttpServletRequest request, @RequestParam(value = "patientId", defaultValue = "0") Long patientId) {
        EncounterDto encounterDto = null;
        if (patientId != 0) {
            encounterDto = baseService.queryActiveEncounterByPatient(patientId);
            if (Objects.isNull(encounterDto) || Objects.isNull(encounterDto.getId())) {
                encounterDto = new EncounterDto();
                encounterDto.setPatientId(patientId);
            }
        } else {
            throw new MyRuntimeException("The patient id is null.");
        }
        model.addAttribute("model", encounterDto);
        return viewRoot + "/edit";
    }

    @RequestMapping(value = "/save")
    @ResponseBody
    String save(EncounterDto encounterDto) {

        String jsonReturn = this.ajaxSuccess();
        int returnInt = 0;
        try {
            if (encounterDto.getId() != null) {
                returnInt = baseService.update(encounterDto);
            } else {
                returnInt = baseService.save(encounterDto);
            }

        }catch(MyRuntimeRightException rightE){
            jsonReturn = this.ajaxFail("警告：" + rightE.getMessage());
        }catch (Exception e) {

            e.printStackTrace();
            jsonReturn = this.ajaxFail("发生异常：" + e.getMessage());
        }
        return jsonReturn;
    }


}
