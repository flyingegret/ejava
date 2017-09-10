package com.flying.egret;

/**
 * 测试四处不同位置初始化&组合
 *
 * @author egret
 * @create 2017-09-10 17:07
 **/
class Soap{
    private String s;
    Soap(){
        System.out.println("Soap()");
        s = "Constructor";
    }

    @Override
    public String toString() {
        return s;
    }
}
public class Bath {

    private String // 1,Initializing at the point of definition
        s1 = "Happy",
        s2 = "Happy",
        s3,s4;
    private  Soap castitle;
    private int i;
    private float toy;
    public Bath(){
        System.out.println("Inside Bath()");
        s3 = "Joy"; // 2,Initialized in constructor
        toy = 3.14f;
        castitle = new Soap();
    }

    // 3,Instance initialization
    { i = 47; }

    @Override
    public String toString() {
        if (s4 == null) // 4,Delayed initialization
            s4 = "Joy";
        return
                "s1 = " + s1 + "\n"+
                "s2 = " + s2 + "\n"+
                "s3 = " + s3 + "\n"+
                "s4 = " + s4 + "\n"+
                "i = "  + i+ "\n"+
                "toy = " + toy + "\n"+
                "castitle = " + castitle;
    }

    public static void main(String[] args){
        Bath b = new Bath();
        System.out.println(b);
    }
}



