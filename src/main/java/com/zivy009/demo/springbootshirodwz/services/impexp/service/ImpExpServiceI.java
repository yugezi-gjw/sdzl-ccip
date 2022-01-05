package com.zivy009.demo.springbootshirodwz.services.impexp.service;

import java.util.List;
import org.springframework.web.multipart.MultipartFile;

public interface ImpExpServiceI {
  <T>List<T> imp(MultipartFile file, Class<T> pojoClass);
  void exp(List<?> list, String title, Class<?> pojoClass);
}
