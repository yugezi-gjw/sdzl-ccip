package com.zivy009.demo.springbootshirodwz.services.pathologyresult.controller;

import com.zivy009.demo.springbootshirodwz.common.exception.MyRuntimeRightException;
import com.zivy009.demo.springbootshirodwz.controller.base.BaseController;
import com.zivy009.demo.springbootshirodwz.services.pathologyresult.dto.PathologyResultDto;
import com.zivy009.demo.springbootshirodwz.services.pathologyresult.service.IPathologyResultService;
import com.zivy009.demo.springbootshirodwz.services.pathologyresult.service.PathologyResultServiceImp;
import com.zivy009.demo.springbootshirodwz.services.testresult.dto.TestResultDto;
import com.zivy009.demo.springbootshirodwz.services.testresult.service.ITestResultService;
import com.zivy009.demo.springbootshirodwz.services.testresult.service.TestResultServiceImpl;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/pathology_result")
public class PathologyResultController extends BaseController<PathologyResultServiceImp> {

    @Autowired
    IPathologyResultService baseService;

    String viewRoot = "pathology_result";

    @RequestMapping(value = "/save")
    @ResponseBody
    String save(@RequestParam(value = "treatCourseId") String treatCourseId, PathologyResultDto dto) {

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
    String detail(Model model, HttpServletRequest request, @RequestParam(value = "treatCourseId") String treatCourseId) {

        List<PathologyResultDto> list = baseService.queryByTreatCourseId(treatCourseId);
        model.addAttribute("pathologyResultList", list);
        return viewRoot + "/list";
    }

    @RequestMapping(value = "/del")
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
