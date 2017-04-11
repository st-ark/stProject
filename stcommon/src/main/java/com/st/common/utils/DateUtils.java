package com.st.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 获取当前时间
 * Created by Administrator on 2017/4/11.
 */
public class DateUtils {
    public static String getDate(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return  sdf.format(date);
    }

    public static void main(String[] args) {
        System.out.println(DateUtils.getDate());
    }
}
