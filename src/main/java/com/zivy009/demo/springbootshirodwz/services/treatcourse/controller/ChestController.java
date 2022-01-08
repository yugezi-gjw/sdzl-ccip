package com.zivy009.demo.springbootshirodwz.services.treatcourse.controller;

import com.zivy009.demo.springbootshirodwz.common.exception.MyRuntimeException;
import com.zivy009.demo.springbootshirodwz.common.exception.MyRuntimeRightException;
import com.zivy009.demo.springbootshirodwz.controller.base.BaseController;
import com.zivy009.demo.springbootshirodwz.persistence.model.SysUser;
import com.zivy009.demo.springbootshirodwz.services.bloodtested.service.IBloodTestedService;
import com.zivy009.demo.springbootshirodwz.services.multiprimary.dto.MultiPrimaryDto;
import com.zivy009.demo.springbootshirodwz.services.multiprimary.service.IMultiPrimaryService;
import com.zivy009.demo.springbootshirodwz.services.patient.service.IPatientService;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.dto.ChestDto;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.service.ChestServiceImpl;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.service.IChestService;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.service.ITreatCourseService;
import com.zivy009.demo.springbootshirodwz.services.treathistory.dto.TreatHistoryDto;
import com.zivy009.demo.springbootshirodwz.services.treathistory.service.ITreatHistoryService;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
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
  @Autowired
  IMultiPrimaryService multiPrimaryService;
  @Autowired
  ITreatHistoryService treatHistoryService;

  String viewRoot = "treatcourse/chest";

  @RequestMapping("/edit")
  @RequiresPermissions("patient:add")
  String edit(Model model, HttpServletRequest request,
      @RequestParam(value = "treatCourseId") String treatCourseId) {
    ChestDto chestDto = chestService.selectByTreatCourseId(treatCourseId);
    if (StringUtils.isEmpty(chestDto.getTreatCourseId())) {
      chestDto.setTreatCourseId(treatCourseId);
    }
    List<MultiPrimaryDto> multiPrimaryDtoList = multiPrimaryService.selectByTreatCourseId(
        chestDto.getTreatCourseId());
    List<TreatHistoryDto> treatHistoryDtoList = treatHistoryService.selectByTreatCourseId(
        chestDto.getTreatCourseId());

    model.addAttribute("model", chestDto);
    model.addAttribute("treatHistoryDtoList", treatHistoryDtoList);
    model.addAttribute("multiPrimaryDtoList", multiPrimaryDtoList);
    return viewRoot + "/edit";
  }

  @RequestMapping(value = "/save")
  @ResponseBody
  String save(ChestDto chestDto) {

    Subject subject = SecurityUtils.getSubject();

    SysUser sysUser = (SysUser) subject.getPrincipal();

    String jsonReturn = this.ajaxSuccess();
    int returnInt = 0;
    try {
      if (StringUtils.isEmpty(chestDto.getTreatCourseId())) {
        throw new MyRuntimeException("The treat course id is null.");
      }
      if (chestDto.getId() != null) {
        Date curDate = new Date();
        chestDto.setUpdatedAt(curDate);
        chestDto.setUpdatedBy(sysUser.getLoginName());
        if (CollectionUtils.isNotEmpty(chestDto.getMultiPrimaryList())) {
          chestDto.getMultiPrimaryList().forEach(p -> {
            p.setTreatCourseId(chestDto.getTreatCourseId());
            p.setUpdatedAt(curDate);
            p.setUpdatedBy(sysUser.getLoginName());
          });
        }
        if (CollectionUtils.isNotEmpty(chestDto.getTreatHistoryList())) {
          chestDto.getTreatHistoryList().forEach(p -> {
            p.setTreatCourseId(chestDto.getTreatCourseId());
            p.setUpdatedAt(curDate);
            p.setUpdatedBy(sysUser.getLoginName());
          });
        }
        returnInt = baseService.update(chestDto);
      } else {
        chestDto.setCreatedBy(sysUser.getLoginName());
        if (CollectionUtils.isNotEmpty(chestDto.getMultiPrimaryList())) {
          chestDto.getMultiPrimaryList().forEach(p -> {
            p.setTreatCourseId(chestDto.getTreatCourseId());
            p.setCreatedBy(sysUser.getLoginName());
          });
        }
        if (CollectionUtils.isNotEmpty(chestDto.getTreatHistoryList())) {
          chestDto.getTreatHistoryList().forEach(p -> {
            p.setTreatCourseId(chestDto.getTreatCourseId());
            p.setCreatedBy(sysUser.getLoginName());
          });
        }
        returnInt = baseService.save(chestDto);
      }

    } catch (MyRuntimeRightException rightE) {
      jsonReturn = this.ajaxFail("警告：" + rightE.getMessage());
    } catch (Exception e) {

      e.printStackTrace();
      jsonReturn = this.ajaxFail("发生异常：" + e.getMessage());
    }
    return jsonReturn;
  }

  @RequestMapping("/view")
  String view(Model model, HttpServletRequest request,
      @RequestParam(value = "treatCourseId") String treatCourseId) {

    ChestDto chestDto = chestService.selectByTreatCourseId(treatCourseId);
    List<MultiPrimaryDto> multiPrimaryDtoList = multiPrimaryService.selectByTreatCourseId(
        chestDto.getTreatCourseId());
    List<TreatHistoryDto> treatHistoryDtoList = treatHistoryService.selectByTreatCourseId(
        chestDto.getTreatCourseId());

    model.addAttribute("treatHistoryDtoList", treatHistoryDtoList);
    model.addAttribute("multiPrimaryDtoList", multiPrimaryDtoList);
    model.addAttribute("treatCourseChest", chestDto);

    return viewRoot + "/view";
  }

}
