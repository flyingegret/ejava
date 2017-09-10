package com.flying.egret;

/**
 * 测试继承 初始化
 *
 * @author egret
 * @create 2017-09-10 17:46
 **/

class Art {
    Art(){
        System.out.println("Art constructor");
    }
}

class Drawing extends Art {
    Drawing(){
        System.out.println("Drawing constructor");
    }
}
public class Cartoon extends  Drawing{
    public  Cartoon(){
        System.out.println("Cartoon constructor");
    }

    public static void main(String[] args){
        Cartoon cartoon = new Cartoon();
    }
}



