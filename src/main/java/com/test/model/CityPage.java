package com.test.model;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class CityPage<City> extends Page<City> {
    private Integer selectInt;
    private String selectStr;

    public CityPage(long current, long size) {
        super(current, size);
    }
}
