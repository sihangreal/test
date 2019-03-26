package com.test.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 映射数据库 city
 */
@Data
@TableName("city")
public class City {
    @TableId("ID")
    private long id;
    @TableField("Name")
    private String name;
    @TableField("CountryCode")
    private String countryCode;
    @TableField("District")
    private  String district;
    @TableField("Population")
    private  long population;
}
