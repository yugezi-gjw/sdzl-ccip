package com.zivy009.demo.springbootshirodwz.services.treatcourse.controller;

import com.zivy009.demo.springbootshirodwz.common.exception.MyRuntimeException;
import com.zivy009.demo.springbootshirodwz.common.exception.MyRuntimeRightException;
import com.zivy009.demo.springbootshirodwz.common.tools.StringUtil;
import com.zivy009.demo.springbootshirodwz.controller.base.BaseController;
import com.zivy009.demo.springbootshirodwz.services.bloodtested.dto.BloodTestedDto;
import com.zivy009.demo.springbootshirodwz.services.bloodtested.service.IBloodTestedService;
import com.zivy009.demo.springbootshirodwz.services.patient.dto.PatientDto;
import com.zivy009.demo.springbootshirodwz.services.patient.service.IPatientService;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.dto.ChestDto;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.dto.TreatCourseDto;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.service.ChestServiceImpl;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.service.IChestService;
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
@RequestMapping(value = "/chest")
public class ChestController extends BaseController<ChestServiceImpl> {

    @Autowired
    ITreatCourseService treatCourseService;
    @Autowired
    IChestService chestService;
    @Autowired
    IPatientService patientService;
    @Autowired
    IBloodTestedService bloodTestedService;

    String viewRoot = "treatcourse/chest";

    @RequestMapping("/edit")
    @RequiresPermissions("patient:add")
    String edit(Model model, HttpServletRequest request, @RequestParam(value = "treatCourseId") String treatCourseId) {
        ChestDto chestDto = chestService.selectByTreatCourseId(treatCourseId);
        if (StringUtils.isEmpty(chestDto.getTreatCourseId())) {
            chestDto.setTreatCourseId(treatCourseId);
        }
        model.addAttribute("model", chestDto);
        return viewRoot + "/edit";
    }

    @RequestMapping(value = "/save")
    @ResponseBody
    String save(ChestDto chestDto) {

        String jsonReturn = this.ajaxSuccess();
        int returnInt = 0;
        try {
            if (StringUtils.isEmpty(chestDto.getTreatCourseId())) {
                throw new MyRuntimeException("The treat course id is null.");
            }
            if (chestDto.getId() != null) {
                returnInt = baseService.update(chestDto);
            } else {
                returnInt = baseService.save(chestDto);
            }

        }catch(MyRuntimeRightException rightE){
            jsonReturn = this.ajaxFail("警告：" + rightE.getMessage());
        }catch (Exception e) {

            e.printStackTrace();
            jsonReturn = this.ajaxFail("发生异常：" + e.getMessage());
        }
        return jsonReturn;
    }

    @RequestMapping("/view")
    String view(Model model, HttpServletRequest request, @RequestParam(value = "treatCourseId") String treatCourseId) {

        ChestDto chestDto = chestService.selectByTreatCourseId(treatCourseId);

        model.addAttribute("treatCourseChest", chestDto);

        return viewRoot + "/view";
    }

}
