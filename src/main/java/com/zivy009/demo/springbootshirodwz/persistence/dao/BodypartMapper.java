package com.zivy009.demo.springbootshirodwz.persistence.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zivy009.demo.springbootshirodwz.persistence.model.Bodypart;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BodypartMapper extends BaseMapper<Bodypart> {

  @Select("SELECT * FROM bodypart where status = 'active'")
  List<Bodypart> selectAll();

  @Select("SELECT * FROM bodypart where status = 'active' and bodypart_code = #{bodypartCode}")
  Bodypart selectByCode(String bodypartCode);
}