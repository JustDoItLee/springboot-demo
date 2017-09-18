package com.lzweb.demo.web.dao;

import com.lzweb.demo.web.domain.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李智
 * @date 2017/9/3
 */
@Mapper
public interface CityMapper {
    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */
//    @Select("select * from city where city_name = #{cityName}")
    City findByName(@Param("cityName") String cityName);
}