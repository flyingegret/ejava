package com.flying.egret;

/**
 * 构造器的调用顺序
 *
 * @author egret
 * @create 2017-09-12 23:24
 **/

class Meal{
    Meal(){System.out.println("Meal()");}
}

class Bread{
    Bread(){System.out.println("Bread()");}
}

class Chese{
    Chese(){System.out.println("Chese()");}
}

class Lettuce{
    Lettuce(){System.out.println("Lettuce()");}
}

class Lunch extends Meal{
    Lunch(){System.out.println("Lunch()");}
}

class PortableLunch extends Lunch{
    PortableLunch(){System.out.println("PortableLunch()");}
}

/**
 *
 Meal()
 Lunch()
 PortableLunch()  此为最底层导出类
 Bread()
 Chese()
 Lettuce() 此上按声明顺序调用成员对象的初始化方法
 Sandwich() 最后调用导出类构造器主体
 */
public class Sandwich extends PortableLunch {
    private Bread b = new Bread();
    private Chese c = new Chese();
    private Lettuce l = new Lettuce();
    public Sandwich(){System.out.println("Sandwich()");}
    public static void main(String[] args){
        new Sandwich();
    }
}



