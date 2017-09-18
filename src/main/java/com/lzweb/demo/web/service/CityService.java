package com.lzweb.demo.web.service;

import com.lzweb.demo.web.domain.City;

/**
 * @author 李智
 * @date 2017/9/3
 */
public interface CityService {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName
     */
    City findCityByName(String cityName);
}