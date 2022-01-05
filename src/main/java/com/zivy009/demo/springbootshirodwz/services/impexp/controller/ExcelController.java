package com.zivy009.demo.springbootshirodwz.services.impexp.controller;

import com.zivy009.demo.springbootshirodwz.services.impexp.dto.ChestPatientExcelDto;
import com.zivy009.demo.springbootshirodwz.services.impexp.util.ExcelUtils;
import com.zivy009.demo.springbootshirodwz.services.patient.dto.PatientAdvSearchDto;
import com.zivy009.demo.springbootshirodwz.services.patient.service.AdvSearchService;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.dto.BodypartEnum;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.service.IChestService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/excel")
public class ExcelController {

  @Autowired
  AdvSearchService advSearchService;
  @Autowired
  IChestService chestService;

  @PostMapping("/{code}/exp")
  public void exp(HttpServletRequest request,
      @PathVariable(value = "code") String code,
      HttpServletResponse response) {
    if (StringUtils.equalsIgnoreCase(code, BodypartEnum.chest.name())) {
      List<ChestPatientExcelDto> list = null;
      PatientAdvSearchDto searchParam = advSearchService.getParamFromRequest(request);
      list = chestService.list(searchParam);
      ExcelUtils
            .exportExcel(list, null, "肺癌", ChestPatientExcelDto.class, "肺癌20211229.xlsx", response);
    }
  }
}
