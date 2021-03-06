package com.zivy009.demo.springbootshirodwz.services.treatcourse.controller;

import com.zivy009.demo.springbootshirodwz.common.exception.MyRuntimeException;
import com.zivy009.demo.springbootshirodwz.common.exception.MyRuntimeRightException;
import com.zivy009.demo.springbootshirodwz.common.http.RequestUtil;
import com.zivy009.demo.springbootshirodwz.common.tools.StringUtil;
import com.zivy009.demo.springbootshirodwz.controller.base.BaseController;
import com.zivy009.demo.springbootshirodwz.services.bloodtested.dto.BloodTestedDto;
import com.zivy009.demo.springbootshirodwz.services.bloodtested.service.BloodTestedServiceImpl;
import com.zivy009.demo.springbootshirodwz.services.bloodtested.service.IBloodTestedService;
import com.zivy009.demo.springbootshirodwz.services.encounter.dto.EncounterDto;
import com.zivy009.demo.springbootshirodwz.services.multiprimary.dto.MultiPrimaryDto;
import com.zivy009.demo.springbootshirodwz.services.multiprimary.service.IMultiPrimaryService;
import com.zivy009.demo.springbootshirodwz.services.pathologyresult.dto.PathologyResultDto;
import com.zivy009.demo.springbootshirodwz.services.pathologyresult.service.IPathologyResultService;
import com.zivy009.demo.springbootshirodwz.services.patient.dto.PatientDto;
import com.zivy009.demo.springbootshirodwz.services.patient.service.IPatientService;
import com.zivy009.demo.springbootshirodwz.services.testresult.dto.TestResultDto;
import com.zivy009.demo.springbootshirodwz.services.testresult.service.ITestResultService;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.dto.AbstractBodypartDto;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.dto.BodypartEnum;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.dto.ChestDto;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.dto.GalactophoreDto;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.dto.TreatCourseDto;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.service.IChestService;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.service.IGalactophoreService;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.service.ITreatCourseService;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.service.TreatCourseServiceImpl;
import com.zivy009.demo.springbootshirodwz.services.treathistory.dto.TreatHistoryDto;
import com.zivy009.demo.springbootshirodwz.services.treathistory.dto.TreatHistoryTypeEnum;
import com.zivy009.demo.springbootshirodwz.services.treathistory.service.ITreatHistoryService;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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
    ITreatCourseService baseService;
    @Autowired
    IChestService chestService;
    @Autowired
    IGalactophoreService galactophoreService;
    @Autowired
    IPatientService patientService;
    @Autowired
    IBloodTestedService bloodTestedService;
    @Autowired
    IMultiPrimaryService multiPrimaryService;
    @Autowired
    ITreatHistoryService treatHistoryService;
    @Autowired
    ITestResultService testResultService;
    @Autowired
    IPathologyResultService pathologyResultService;

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
            jsonReturn = this.ajaxFail("?????????" + rightE.getMessage());
        }catch (Exception e) {

            e.printStackTrace();
            jsonReturn = this.ajaxFail("???????????????" + e.getMessage());
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
            jsonReturn = this.ajaxFail("?????????" + rightE.getMessage());
        }catch (Exception e) {
            e.printStackTrace();
            jsonReturn = this.ajaxFail("???????????????" + e.getMessage());
        }
        return jsonReturn;
    }

    @RequestMapping("/detail")
    String detail(Model model, HttpServletRequest request, @RequestParam(value = "treatCourseId") String treatCourseId) {

        TreatCourseDto treatCourseDto = baseService.selectByTreatCourseId(treatCourseId);
        PatientDto patientDto = patientService.selectById(treatCourseDto.getPatientId());
        List<BloodTestedDto> bloodTestedDtoList = bloodTestedService
            .queryByTreatCourseId(treatCourseId);
        List<TestResultDto> testResultList = testResultService.queryByTreatCourseId(treatCourseId);
        List<PathologyResultDto> pathologyResultList = pathologyResultService.queryByTreatCourseId(treatCourseId);

        List<MultiPrimaryDto> multiPrimaryDtoList = multiPrimaryService.selectByTreatCourseId(treatCourseId);
        List<TreatHistoryDto> treatHistoryDtoList = treatHistoryService.selectByTreatCourseId(treatCourseId);

        AbstractBodypartDto dto = null;
        String view = viewRoot;
        if (StringUtils.equalsIgnoreCase(treatCourseDto.getBodypartCode(), BodypartEnum.chest.name())) {
            dto = chestService.selectByTreatCourseId(treatCourseId);
            if (StringUtils.isEmpty(dto.getTreatCourseId())) {
                dto.setTreatCourseId(treatCourseId);
            }
            view += "/chest/main";
        } else if (StringUtils.equalsIgnoreCase(treatCourseDto.getBodypartCode(), BodypartEnum.galactophore.name())) {
            dto = galactophoreService.selectByTreatCourseId(treatCourseId);
            if (StringUtils.isEmpty(dto.getTreatCourseId())) {
                dto.setTreatCourseId(treatCourseId);
            }
            view += "/galactophore/main";
        } else if (StringUtils.equalsIgnoreCase(treatCourseDto.getBodypartCode(), BodypartEnum.esophagus.name())) {
            view += "/esophagus/main";
        } else if (StringUtils.equalsIgnoreCase(treatCourseDto.getBodypartCode(), BodypartEnum.thymus.name())) {
            view += "/thymus/main";
        }

        model.addAttribute("patient", patientDto);
        model.addAttribute("dto", dto);
        model.addAttribute("list", bloodTestedDtoList);
        model.addAttribute("testResultList", testResultList);
        model.addAttribute("pathologyResultList", pathologyResultList);
        model.addAttribute("multiPrimaryDtoList", multiPrimaryDtoList);
        model.addAttribute("treatHistoryDtoList", treatHistoryDtoList);
        return view;
    }

    @RequestMapping("/bodypart")
    String bodypart(Model model, HttpServletRequest request,
        @RequestParam(value = "treatCourseId") String treatCourseId) {

        List<BloodTestedDto> bloodTestedDtoList = bloodTestedService
            .queryByTreatCourseId(treatCourseId);

        TreatCourseDto treatCourseDto = baseService.selectByTreatCourseId(treatCourseId);
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

    @RequestMapping("/treat_history_type/list")
    String listTreatType(Model model, HttpServletRequest request) {
        String inputName = RequestUtil.getString(request, "inputName");
        model.addAttribute("inputName", inputName);
        return viewRoot + "/treat_type_select";
    }
}
