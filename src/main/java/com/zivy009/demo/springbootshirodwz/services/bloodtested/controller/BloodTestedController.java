package com.zivy009.demo.springbootshirodwz.services.bloodtested.controller;

import com.zivy009.demo.springbootshirodwz.common.exception.MyRuntimeRightException;
import com.zivy009.demo.springbootshirodwz.controller.base.BaseController;
import com.zivy009.demo.springbootshirodwz.services.bloodtested.dto.BloodTestedDto;
import com.zivy009.demo.springbootshirodwz.services.bloodtested.service.BloodTestedServiceImpl;
import com.zivy009.demo.springbootshirodwz.services.bloodtested.service.IBloodTestedService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/bloodtested")
public class BloodTestedController extends BaseController<BloodTestedServiceImpl> {

    @Autowired
    IBloodTestedService bloodTestedService;

    String viewRoot = "bloodtested";

    @RequestMapping("/add")
    @RequiresPermissions("patient:add")
    String addView(Model model, HttpServletRequest request, @RequestParam(value = "encounterId", defaultValue = "0") Long encounterId) {
        BloodTestedDto bloodTestedDto = new BloodTestedDto();
//        bloodTestedDto.setEncounterId(encounterId);
        model.addAttribute("model", bloodTestedDto);
        return viewRoot + "/add";
    }

    @RequestMapping(value = "/save")
    @ResponseBody
    String save(@RequestParam(value = "treatCourseId") String treatCourseId, BloodTestedDto bloodTestedDto) {

        String jsonReturn = this.ajaxSuccess();
        int returnInt = 0;
        try {
            bloodTestedDto.setTreatCourseId(treatCourseId);
            if (bloodTestedDto.getId() != null) {
                returnInt = baseService.update(bloodTestedDto);
            } else {
                returnInt = baseService.save(bloodTestedDto);
            }

        }catch(MyRuntimeRightException rightE){
            jsonReturn = this.ajaxFail("警告：" + rightE.getMessage());
        }catch (Exception e) {

            e.printStackTrace();
            jsonReturn = this.ajaxFail("发生异常：" + e.getMessage());
        }
        return jsonReturn;
    }

    @RequestMapping(value = "/saveAll")
    @ResponseBody
    String saveAll(Model model, HttpServletRequest request,  String[] list) {

        String jsonReturn = this.ajaxSuccess();
        int returnInt = 0;
        try {
//            if (bloodTestedDto.getId() != null) {
//                returnInt = baseService.update(bloodTestedDto);
//            } else {
//                returnInt = baseService.save(bloodTestedDto);
//            }

        }catch(MyRuntimeRightException rightE){
            jsonReturn = this.ajaxFail("警告：" + rightE.getMessage());
        }catch (Exception e) {

            e.printStackTrace();
            jsonReturn = this.ajaxFail("发生异常：" + e.getMessage());
        }
        return jsonReturn;
    }

    @RequestMapping("/list")
    @RequiresPermissions("patient:list")
    String detail(Model model, HttpServletRequest request, @RequestParam(value = "treatCourseId") String treatCourseId) {

        List<BloodTestedDto> list = bloodTestedService.queryByTreatCourseId(treatCourseId);
        model.addAttribute("list", list);
        return viewRoot + "/list";
    }

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
}
