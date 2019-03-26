package com.test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.entity.City;
import com.test.model.CityPage;
import com.test.model.ParamSome;
import org.apache.ibatis.annotations.Param;


public interface CityMapper extends BaseMapper<City> {

    //@Select("select * from city where (id > #{pg.selectInt} and CountryCode = #{pg.selectStr}) and (id < #{ps.yihao} and CountryCode = #{ps.erhao})")
    CityPage<City> mySelectPage(@Param("pg") CityPage<City> myPage, @Param("ps") ParamSome paramSome);
}
