package com.test.controller;

import com.test.entity.City;
import com.test.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService service;

    /**
     * 获取city /getCity 与 getCity 效果一样
     *
     * @param id
     * @return
     */
    @GetMapping("getCity")
    public City getCity(long id) {
        return service.getCity(id);
    }

    @GetMapping("getCityByName")
    public List<City> getCityByName(@RequestParam("name") String name) {
        return service.getCityByName(name);
    }

    @GetMapping("getCityLikeName")
    public List<City> getCityLikeName(@RequestParam("name") String name) {
        return service.getCityLikeName(name);
    }

    @GetMapping("getCityPage")
    public List<City> getCityPage(Integer firstId, Integer secondId) {
        return service.getCityPage(firstId, secondId);
    }
}
