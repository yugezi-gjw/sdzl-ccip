package com.zivy009.demo.springbootshirodwz.services.bodypart.controller;

import com.zivy009.demo.springbootshirodwz.controller.base.BaseController;
import com.zivy009.demo.springbootshirodwz.services.bloodtested.service.IBloodTestedService;
import com.zivy009.demo.springbootshirodwz.services.bodypart.dto.BodypartDto;
import com.zivy009.demo.springbootshirodwz.services.bodypart.service.IBodypartService;
import com.zivy009.demo.springbootshirodwz.services.patient.service.IPatientService;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.service.IChestService;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.service.IGalactophoreService;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.service.ITreatCourseService;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.service.TreatCourseServiceImpl;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/treatcourse")
public class BodypartController extends BaseController<TreatCourseServiceImpl> {

    @Autowired
    IBodypartService bodypartService;

    String viewRoot = "bodypart";


    @RequestMapping("/list")
    String list(Model model, HttpServletRequest request) {
        List<BodypartDto> list = bodypartService.list();
        model.addAttribute("list", list);
        return viewRoot + "/list";
    }

}
