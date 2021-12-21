package com.zivy009.demo.springbootshirodwz.services.treatcourse.controller;

import com.zivy009.demo.springbootshirodwz.common.exception.MyRuntimeException;
import com.zivy009.demo.springbootshirodwz.common.exception.MyRuntimeRightException;
import com.zivy009.demo.springbootshirodwz.controller.base.BaseController;
import com.zivy009.demo.springbootshirodwz.services.bloodtested.service.IBloodTestedService;
import com.zivy009.demo.springbootshirodwz.services.patient.service.IPatientService;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.dto.ChestDto;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.dto.GalactophoreDto;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.service.ChestServiceImpl;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.service.GalactophoreServiceImpl;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.service.IGalactophoreService;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.service.ITreatCourseService;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/galactophore")
public class GalactophoreController extends BaseController<GalactophoreServiceImpl> {

    @Autowired
    ITreatCourseService treatCourseService;
    @Autowired
    IGalactophoreService galactophoreService;
    @Autowired
    IPatientService patientService;
    @Autowired
    IBloodTestedService bloodTestedService;

    String viewRoot = "treatcourse/galactophore";

    @RequestMapping("/edit")
    String edit(Model model, HttpServletRequest request, @RequestParam(value = "treatCourseId") String treatCourseId) {
        GalactophoreDto dto = galactophoreService.selectByTreatCourseId(treatCourseId);
        if (StringUtils.isEmpty(dto.getTreatCourseId())) {
            dto.setTreatCourseId(treatCourseId);
        }
        model.addAttribute("model", dto);
        return viewRoot + "/edit";
    }

    @RequestMapping(value = "/save")
    @ResponseBody
    String save(GalactophoreDto dto) {

        String jsonReturn = this.ajaxSuccess();
        int returnInt = 0;
        try {
            if (StringUtils.isEmpty(dto.getTreatCourseId())) {
                throw new MyRuntimeException("The treat course id is null.");
            }
            if (dto.getId() != null) {
                returnInt = baseService.update(dto);
            } else {
                returnInt = baseService.save(dto);
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

        GalactophoreDto dto = galactophoreService.selectByTreatCourseId(treatCourseId);

        model.addAttribute("dto", dto);

        return viewRoot + "/view";
    }

}
