package com.flying.egret;

/**
 * 测试对象的等价性
 *
 * @egret
 * @create 2017-09-10 13:07
 **/
public class Equivalence {
    public static void main(String[] args){
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1 == n2); //false ==比较的是对象的引用
        System.out.println(n1 != n2); //true
        //比较两个对象内容是否相同的普世方法 equals 该方法不适用于基本类型 不适用于自定义类
        System.out.println(n1.equals(n2));//true
        String s1 = "egret";
        String s2 = "egret";
        System.out.println(s1.equals(s2));//true
        String s3 = new String ("egret");
        String s4 = new String("egret");
        System.out.println(s3.equals(s4));//true

        int a = 1;
        int b = 0;
        System.out.println("---&---");
        System.out.println("a&a:"+(a&a));
        System.out.println("a&b:"+(a&b));
        System.out.println("b&b:"+(b&b));
        System.out.println("---|---");
        System.out.println("a|a:"+(a|a));
        System.out.println("a|b:"+(a|b));
        System.out.println("b|b:"+(b|b));
        System.out.println("---^---");
        System.out.println("a^a:"+(a^a));
        System.out.println("a^b:"+(a^b));
        System.out.println("b^b:"+(b^b));
        System.out.println("---~---");
        System.out.println("~a:"+(~a));
        System.out.println("~b:"+(~b));

        int i = -1;
        System.out.println(Integer.toBinaryString(i));
        i = 0;
        System.out.println(Integer.toBinaryString(i));

    }

}



