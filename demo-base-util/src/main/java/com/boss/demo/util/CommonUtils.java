package com.boss.demo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonUtils {
    public static SimpleDateFormat getCurrentTime(){
        return new SimpleDateFormat(String.format("yyyy-MM-dd HH:mm:ss", new Date()));
    }
}
