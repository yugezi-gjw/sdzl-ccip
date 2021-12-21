package com.zivy009.demo.springbootshirodwz.persistence.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zivy009.demo.springbootshirodwz.persistence.model.TreatCourseGalactophore;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TreatCourseGalactophoreMapper extends BaseMapper<TreatCourseGalactophore> {
    @Select("SELECT * FROM treat_course_galactophore where treat_course_id = #{treatCourseId}")
    TreatCourseGalactophore queryByTreatCourseId(String treatCourseId);
}