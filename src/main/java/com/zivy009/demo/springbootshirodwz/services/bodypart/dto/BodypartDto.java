package com.zivy009.demo.springbootshirodwz.services.bodypart.dto;

import com.zivy009.demo.springbootshirodwz.persistence.model.Bodypart;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.collections.CollectionUtils;

public class BodypartDto {
  private Long id;

  private String bodypartCode;

  private String bodypart;

  private String status;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getBodypartCode() {
    return bodypartCode;
  }

  public void setBodypartCode(String bodypartCode) {
    this.bodypartCode = bodypartCode;
  }

  public String getBodypart() {
    return bodypart;
  }

  public void setBodypart(String bodypart) {
    this.bodypart = bodypart;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public static BodypartDto fromEntity(Bodypart entity) {
    BodypartDto dto = new BodypartDto();
    dto.setId(entity.getId());
    dto.setBodypartCode(entity.getBodypartCode());
    dto.setBodypart(entity.getBodypart());
    dto.setStatus(entity.getStatus());
    return dto;
  }

  public static List<BodypartDto> fromEntityList(List<Bodypart> entityList) {
    List<BodypartDto> result = new ArrayList<>();
    if (CollectionUtils.isNotEmpty(entityList)) {
      entityList.forEach(p -> result.add(fromEntity(p)));
    }
    return result;
  }
}
