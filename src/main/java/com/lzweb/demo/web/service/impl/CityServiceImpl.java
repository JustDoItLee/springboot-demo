package com.lzweb.demo.web.service.impl;

import com.lzweb.demo.web.dao.CityMapper;
import com.lzweb.demo.web.domain.City;
import com.lzweb.demo.web.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 李智
 * @date 2017/9/3
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;

    public City findCityByName(String cityName) {
        return cityMapper.findByName(cityName);
    }

}