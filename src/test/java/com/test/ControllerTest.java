package com.test;

import com.alibaba.fastjson.JSON;
import com.test.controller.CityController;
import com.test.entity.City;
import com.test.service.CityService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ControllerTest {


    @Autowired
    private CityController s;

    @Autowired
    private CityService service;

    @Test
    public void testController() throws Exception{
        System.out.println(s.getCity(1));
    }

    @Test
    public  void test(){
//        List<City> citys= service.getCityLikeName("%Manc");
//        List<String> cityNames=service.getCityNames();
//        List<String> cityNamesAndCountrys=service.getCityNameAndCountry();

        //List<City> cities=service.getCityMyPage(1,20,"NLD");

        List<City> cities=service.getCityCo();
        for (City city: cities
             ) {
            System.out.println(JSON.toJSON(city));
        }
    }

}
