package com.hospital_purchase.util;

import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Identities {

    private static SecureRandom random = new SecureRandom();

    /**
     * 封装JDK自带的UUID, 通过Random数字生成, 中间有-分割.
     */
    public static String uuid() {
        return UUID.randomUUID().toString();
    }

    /**
     * 封装JDK自带的UUID, 通过Random数字生成, 中间无-分割.
     */
    public static String uuid2() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /**
     *
     * @param name 单名
     * @return 单名+年月日+随机数
     */
    public static String randomLong(String name) {
        Date date=new Date();
        DateFormat format=new SimpleDateFormat("yyyyMMdd");
        return name+format.format(date)+Math.abs(random.nextLong());
    }



}
