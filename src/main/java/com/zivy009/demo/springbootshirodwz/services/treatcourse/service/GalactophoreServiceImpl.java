package com.zivy009.demo.springbootshirodwz.services.treatcourse.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zivy009.demo.springbootshirodwz.persistence.dao.TreatCourseChestMapper;
import com.zivy009.demo.springbootshirodwz.persistence.dao.TreatCourseGalactophoreMapper;
import com.zivy009.demo.springbootshirodwz.persistence.model.TreatCourseChest;
import com.zivy009.demo.springbootshirodwz.persistence.model.TreatCourseGalactophore;
import com.zivy009.demo.springbootshirodwz.persistence.tools.CommonMapper;
import com.zivy009.demo.springbootshirodwz.services.multiprimary.dto.MultiPrimaryDto;
import com.zivy009.demo.springbootshirodwz.services.multiprimary.service.IMultiPrimaryService;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.dto.ChestDto;
import com.zivy009.demo.springbootshirodwz.services.treatcourse.dto.GalactophoreDto;
import com.zivy009.demo.springbootshirodwz.services.treathistory.dto.TreatHistoryDto;
import com.zivy009.demo.springbootshirodwz.services.treathistory.service.ITreatHistoryService;
import java.util.List;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GalactophoreServiceImpl extends ServiceImpl<TreatCourseGalactophoreMapper, TreatCourseGalactophore> implements
    IGalactophoreService {

  @Autowired
  CommonMapper commonMapper;
  @Autowired
  IMultiPrimaryService multiPrimaryService;
  @Autowired
  ITreatHistoryService treatHistoryService;


  @Transactional(rollbackFor = Exception.class)
  @Override
  public int save(GalactophoreDto dto) {
    List<MultiPrimaryDto> multiPrimaryDtoList = dto.getMultiPrimaryList();
    if (CollectionUtils.isNotEmpty(multiPrimaryDtoList)) {
      multiPrimaryDtoList.forEach(p -> {
        multiPrimaryService.save(p);
      });
    }
    List<TreatHistoryDto> treatHistoryList = dto.getTreatHistoryList();
    if (CollectionUtils.isNotEmpty(treatHistoryList)) {
      treatHistoryList.forEach(p -> {
        treatHistoryService.save(p);
      });
    }
    TreatCourseGalactophore entity = dto.toEntity();
    return baseMapper.insert(entity);
  }

  @Transactional(rollbackFor = Exception.class)
  @Override
  public int update(GalactophoreDto dto) {
    multiPrimaryService.deleteByTreatCourseId(dto.getTreatCourseId());
    treatHistoryService.deleteByTreatCourseId(dto.getTreatCourseId());
    List<MultiPrimaryDto> multiPrimaryDtoList = dto.getMultiPrimaryList();
    if (CollectionUtils.isNotEmpty(multiPrimaryDtoList)) {
      multiPrimaryDtoList.forEach(p -> {
        multiPrimaryService.save(p);
      });
    }
    List<TreatHistoryDto> treatHistoryList = dto.getTreatHistoryList();
    if (CollectionUtils.isNotEmpty(treatHistoryList)) {
      treatHistoryList.forEach(p -> {
        treatHistoryService.save(p);
      });
    }
    TreatCourseGalactophore entity = dto.toEntity();
    return baseMapper.updateById(entity);
  }

  @Override
  public GalactophoreDto selectByTreatCourseId(String treatCourseId) {
    TreatCourseGalactophore entity = baseMapper.queryByTreatCourseId(treatCourseId);
    return GalactophoreDto.fromEntity(entity);
  }
}
