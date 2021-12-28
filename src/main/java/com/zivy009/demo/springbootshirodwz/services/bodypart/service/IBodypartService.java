package com.zivy009.demo.springbootshirodwz.services.bodypart.service;

import com.zivy009.demo.springbootshirodwz.services.bodypart.dto.BodypartDto;
import java.util.List;

public interface IBodypartService {
  List<BodypartDto> list();
  BodypartDto selectByCode(String code);
}
