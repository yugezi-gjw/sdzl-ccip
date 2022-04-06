package com.zivy009.demo.springbootshirodwz.services.livertested.controller;

import com.zivy009.demo.springbootshirodwz.common.exception.MyRuntimeRightException;
import com.zivy009.demo.springbootshirodwz.controller.base.BaseController;
import com.zivy009.demo.springbootshirodwz.services.bloodtested.dto.BloodTestedDto;
import com.zivy009.demo.springbootshirodwz.services.bloodtested.service.BloodTestedServiceImpl;
import com.zivy009.demo.springbootshirodwz.services.bloodtested.service.IBloodTestedService;
import com.zivy009.demo.springbootshirodwz.services.livertested.dto.LiverTestedDto;
import com.zivy009.demo.springbootshirodwz.services.livertested.service.ILiverTestedService;
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
@RequestMapping(value = "/liver-tested")
public class LiverTestedController extends BaseController<BloodTestedServiceImpl> {

    @Autowired
    ILiverTestedService baseService;

    String viewRoot = "liver_tested";

    @RequestMapping(value = "/save")
    @ResponseBody
    String save(@RequestParam(value = "treatCourseId") String treatCourseId, LiverTestedDto dto) {

        String jsonReturn = this.ajaxSuccess();
        int returnInt = 0;
        try {
            dto.setTreatCourseId(treatCourseId);
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

    @RequestMapping("/list")
    @RequiresPermissions("patient:list")
    String detail(Model model, HttpServletRequest request, @RequestParam(value = "treatCourseId") String treatCourseId) {

        List<LiverTestedDto> list = baseService.queryByTreatCourseId(treatCourseId);
        model.addAttribute("list", list);
        return viewRoot + "/list";
    }

    @RequestMapping("/main")
    String viewMain(Model model, HttpServletRequest request, @RequestParam(value = "treatCourseId") String treatCourseId) {

        List<LiverTestedDto> list = baseService.queryByTreatCourseId(treatCourseId);
        model.addAttribute("list", list);
        model.addAttribute("treatCourseId", treatCourseId);
        return viewRoot + "/main";
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
