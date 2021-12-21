package com.zivy009.demo.springbootshirodwz.services.treatcourse.controller;

import com.zivy009.demo.springbootshirodwz.common.exception.MyRuntimeException;
import com.zivy009.demo.springbootshirodwz.common.exception.MyRuntimeRightException;
import com.zivy009.demo.springbootshirodwz.common.tools.StringUtil;
import com.zivy009.demo.springbootshirodwz.controller.base.BaseController;
import com.zivy009.demo.springbootshirodwz.services.bloodtested.dto.BloodTestedDto;
import com.zivy009.demo.springbootshirodwz.services.bloodtested.service.BloodTestedServiceImpl;
import com.zivy009.demo.springbootshirodwz.services.bloodtested.service.IBloodTestedService;
import com.zivy009.demo.springbootshirodwz.services.encounter.dto.EncounterDto;
import com.zivy009.demo.springbootshirodwz.services.patient.dto.PatientDto;
import com.zivy009.demo.springbootshirodwz.services.patient.service.IPatientService;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.dto.BodypartEnum;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.dto.ChestDto;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.dto.GalactophoreDto;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.dto.TreatCourseDto;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.service.IChestService;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.service.IGalactophoreService;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.service.ITreatCourseService;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.service.TreatCourseServiceImpl;
import java.util.List;
import java.util.UUID;
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
@RequestMapping(value = "/treatcourse")
public class TreatCourseController extends BaseController<TreatCourseServiceImpl> {

    @Autowired
    ITreatCourseService treatCourseService;
    @Autowired
    IChestService chestService;
    @Autowired
    IGalactophoreService galactophoreService;
    @Autowired
    IPatientService patientService;
    @Autowired
    IBloodTestedService bloodTestedService;

    String viewRoot = "treatcourse";

    @RequestMapping("/add")
    @RequiresPermissions("patient:add")
    String addView(Model model, HttpServletRequest request, @RequestParam(value = "patientId", defaultValue = "0") Long patientId) {
        TreatCourseDto treatCourseDto = new TreatCourseDto();
        treatCourseDto.setPatientId(patientId);

        PatientDto patientDto = patientService.selectById(patientId);
        model.addAttribute("model", treatCourseDto);
        model.addAttribute("patientDto", patientDto);
        return viewRoot + "/add";
    }

    @RequestMapping(value = "/save")
    @ResponseBody
    String save(TreatCourseDto treatCourseDto) {

        String jsonReturn = this.ajaxSuccess();
        int returnInt = 0;
        try {
            if (StringUtils.isEmpty(treatCourseDto.getTreatCourseId())) {
                treatCourseDto.setTreatCourseId(UUID.randomUUID().toString());
            }
            if (treatCourseDto.getId() != null) {
                returnInt = baseService.update(treatCourseDto);
            } else {
                returnInt = baseService.save(treatCourseDto);
            }

        }catch(MyRuntimeRightException rightE){
            jsonReturn = this.ajaxFail("警告：" + rightE.getMessage());
        }catch (Exception e) {

            e.printStackTrace();
            jsonReturn = this.ajaxFail("发生异常：" + e.getMessage());
        }
        return jsonReturn;
    }

//    @RequestMapping("/list")
//    @RequiresPermissions("patient:list")
//    String detail(Model model, HttpServletRequest request, @RequestParam(value = "patientId", defaultValue = "0") Long patientId) {
//        EncounterDto encounterDto = treatCourseService.queryActiveEncounterByPatient(patientId);
//
//        List<BloodTestedDto> list = bloodTestedService.queryByEncounterId(encounterDto.getId());
//        model.addAttribute("encounter", encounterDto);
//        model.addAttribute("list", list);
//        return viewRoot + "/list";
//    }

    @RequestMapping(value = "/del")
//    @RequiresPermissions("patient:del")
    @ResponseBody
    String del(@RequestParam(value = "id", defaultValue = "0") Long id) {
        String jsonReturn = this.ajaxDelSuccess();
        try {
            int returnInt = baseService.del(id);

        }catch(MyRuntimeRightException rightE){
            jsonReturn = this.ajaxFail("警告：" + rightE.getMessage());
        }catch (Exception e) {
            e.printStackTrace();
            jsonReturn = this.ajaxFail("发生异常：" + e.getMessage());
        }
        return jsonReturn;
    }

    @RequestMapping("/detail")
    String detail(Model model, HttpServletRequest request, @RequestParam(value = "patientId", defaultValue = "0") Long patientId) {
        PatientDto patientDto = null;
        if (patientId != 0) {
            patientDto = patientService.selectById(patientId);
        } else {
            throw new MyRuntimeException("");
        }

        List<TreatCourseDto> treatCourseDtoList = treatCourseService.selectByPatientId(patientId);

        model.addAttribute("patient", patientDto);
        model.addAttribute("list", treatCourseDtoList);

        return viewRoot + "/detail";
    }

    @RequestMapping("/bodypart")
    String bodypart(Model model, HttpServletRequest request,
        @RequestParam(value = "treatCourseId") String treatCourseId) {

        List<BloodTestedDto> bloodTestedDtoList = bloodTestedService
            .queryByTreatCourseId(treatCourseId);

        TreatCourseDto treatCourseDto = treatCourseService.selectByTreatCourseId(treatCourseId);
        if (StringUtils.equalsIgnoreCase(BodypartEnum.chest.name(), treatCourseDto.getBodypartCode())) {
            ChestDto chestDto = chestService.selectByTreatCourseId(treatCourseId);
            if (StringUtils.isEmpty(chestDto.getTreatCourseId())) {
                chestDto.setTreatCourseId(treatCourseId);
            }
            model.addAttribute("treatCourseChest", chestDto);
            model.addAttribute("list", bloodTestedDtoList);
            return viewRoot + "/chest/main";
        } else {
            GalactophoreDto dto = galactophoreService.selectByTreatCourseId(treatCourseId);
            if (StringUtils.isEmpty(dto.getTreatCourseId())) {
                dto.setTreatCourseId(treatCourseId);
            }
            model.addAttribute("dto", dto);
            model.addAttribute("list", bloodTestedDtoList);
            return viewRoot + "/galactophore/main";
        }
    }

}
