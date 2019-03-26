package com.test.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.test.entity.City;
import com.test.mapper.CityMapper;
import com.test.model.CityPage;
import com.test.model.ParamSome;
import com.test.util.MapUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class CityService {

    @Autowired
    private CityMapper mapper;

    public City getCity(long id){
        return mapper.selectById(id);
    }

    public List<City> getCityByName(String name){
        return  mapper.selectByMap(MapUtil.getColumnMap("Name",name));
    }

    public  List<City> getCityLikeName(String name){
        QueryWrapper queryWrapper=new QueryWrapper();
        //queryWrapper.lambda().like("Name",name);
        queryWrapper.like("Name",name);
        return  mapper.selectMaps(queryWrapper);
    }

    public  List<String> getCityNames(){
        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.select("name");
        return  mapper.selectMaps(queryWrapper);
    }

    public  List<String> getCityNameAndCountry(){
        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.select("name","countrycode");
        return  mapper.selectMaps(queryWrapper);
    }

    public  List<City> getCityPage(Integer first,Integer second){
        Page<City> page = new Page<>(1, 5);
        IPage<City> cityIPage = mapper.selectPage(page, new QueryWrapper<City>()
                .between("ID", first,second));
       return cityIPage.getRecords();
    }

    public  List<City> getCityMyPage(Integer first,Integer second,String key){
        CityPage<City> cityPage=new CityPage<City>(1,5).setSelectInt(first).setSelectStr(key);
        ParamSome paramSome = new ParamSome(second,key);
        CityPage<City> userMyPage = mapper.mySelectPage(cityPage, paramSome);
        return userMyPage.getRecords();
    }

    public  List<City> getCityCo(){
        Page<City> page = new Page<>(1, 5);
        IPage<City> cityIPage = mapper.selectPage(page, new QueryWrapper<City>()
                .like("Name","N").or().like("CountryCode","N").orderByAsc("Name"));
        return cityIPage.getRecords();
    }
}
