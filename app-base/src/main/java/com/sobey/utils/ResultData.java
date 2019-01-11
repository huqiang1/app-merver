package com.sobey.utils;

import java.util.HashMap;
import java.util.Map;

public class ResultData {

    public static Map success(Object obj){

        Map map = new HashMap();
        map.put("message","success");
        map.put("code","00");
        map.put("data",obj);

        return map;
    }

}
