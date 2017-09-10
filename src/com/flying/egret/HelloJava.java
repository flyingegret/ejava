package com.flying.egret;

import java.util.Date;

/**
 * 测试输出
 *
 * @egret
 * @create 2017-09-09 10:07
 **/
public class HelloJava {
    public static void main(String[] args){
        System.out.println("hi, this is egret!");
        System.out.println("it's :"+new Date());
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));

    }
}
