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
import com.zivy009.demo.springbootshirodwz.services.patient.service.AdvSearchService;
import com.zivy009.demo.springbootshirodwz.services.patient.service.IPatientService;
import com.zivy009.demo.springbootshirodwz.services.patient.service.PatientServiceImpl;
import com.zivy009.demo.springbootshirodwz.services.patient.vo.PatientListVo;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.dto.BodypartEnum;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
    @Autowired
    AdvSearchService advSearchService;
    @Autowired
    IPatientService baseService;

    String viewRoot = "patient";

    @RequestMapping("/list")
    @RequiresPermissions("base:list")
    protected String list(Model model, HttpServletRequest request, @RequestParam(value = "pageNum", defaultValue = "1") int pageIndex,
            @RequestParam(value = "numPerPage", defaultValue = "5") int pageSize) {

        PageHandler page = new PageHandler(pageIndex, pageSize);
        List<PatientDto> list = new ArrayList<>();
        String keyword = RequestUtil.getString(request, "keyword");
        PatientAdvSearchDto searchParam = null;
        if (Objects.isNull(keyword)) {
            searchParam = advSearchService.getParamFromRequest(request);
            list = baseService.list(page, searchParam);
        } else {
            list = baseService.list(page, keyword);
        }

        model.addAttribute("page", page);
        model.addAttribute("list", list);
        model.addAttribute("keyword", keyword);
        return viewRoot + "/list";
    }

    @RequestMapping("/bodypart/{code}")
    @RequiresPermissions("base:list")
    protected String listByBodypart(Model model, HttpServletRequest request,
            @PathVariable(value = "code") String code,
            @RequestParam(value = "pageNum", defaultValue = "1") int pageIndex,
            @RequestParam(value = "numPerPage", defaultValue = "5") int pageSize) {

        PageHandler page = new PageHandler(pageIndex, pageSize);
        List<PatientListVo> list = new ArrayList<>();
        String keyword = RequestUtil.getString(request, "keyword");
        PatientAdvSearchDto searchParam = null;
        if (Objects.isNull(keyword)) {
            searchParam = advSearchService.getParamFromRequest(request);
            list = baseService.list(code, page, searchParam);
        } else {
            list = baseService.list(code, page, keyword);
        }

        model.addAttribute("page", page);
        model.addAttribute("list", list);
        model.addAttribute("keyword", keyword);
        model.addAttribute("bodypartCode", code);

        return viewRoot + "/list_by_bodypart";
    }



    @RequestMapping("/add")
    @RequiresPermissions("patient:add")
    String addView(Model model, HttpServletRequest request) {
        model.addAttribute("model", null);
        return viewRoot + "/add";
    }

    @RequestMapping("/add_by_bodypart")
    @RequiresPermissions("patient:add")
    String add_by_bodypart(Model model, HttpServletRequest request, @RequestParam(value = "code") String code) {
        PatientDto patientDto = new PatientDto();
        patientDto.setBodypart(code);
        model.addAttribute("model", patientDto);
        return viewRoot + "/add_by_bodypart";
    }

    @RequestMapping("/adv_search")
    @RequiresPermissions("base:list")
    String adv_search(Model model, HttpServletRequest request) {
        model.addAttribute("model", null);
        return viewRoot + "/adv_search";
    }

    @RequestMapping("/{code}/adv_search")
    @RequiresPermissions("base:list")
    String adv_search_by_code(Model model, HttpServletRequest request, @PathVariable(value = "code") String code) {
        model.addAttribute("model", null);
        model.addAttribute("bodypartCode", code);
        if (StringUtils.equalsIgnoreCase(code, BodypartEnum.chest.name())) {
            return "treatcourse/chest/adv_search";
        }
        else if (StringUtils.equalsIgnoreCase(code, BodypartEnum.galactophore.name())) {
            return "treatcourse/galactophore/adv_search";
        }
        else if (StringUtils.equalsIgnoreCase(code, BodypartEnum.thymus.name())) {
            return "treatcourse/galactophore/adv_search";
        }
        else if (StringUtils.equalsIgnoreCase(code, BodypartEnum.esophagus.name())) {
            return "treatcourse/galactophore/adv_search";
        }
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
