package com.test.util;

import java.util.HashMap;

public class MapUtil {

    public  static HashMap getColumnMap(String key,String value){
        HashMap map=new HashMap<String, String>();
        map.put(key,value);
        return  map;
    }
}
