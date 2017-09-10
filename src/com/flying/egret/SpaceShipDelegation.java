package com.flying.egret;

/**
 * 测试代理
 *
 * @author egret
 * @create 2017-09-10 17:54
 **/
public class SpaceShipDelegation {
    private String name;
    private SpaceShipControl control = new SpaceShipControl();
    public SpaceShipDelegation(String name){
        this.name = name;
    }

    //Delegated methods
    public void back(int velocity){
        control.back(velocity);
    }

    public void down(int velocity){
        control.down(velocity);
    }

    public void forward(int velocity){
        control.forward(velocity);
    }
        public void left(int velocity){
        control.left(velocity);
    }

    public void right(int velocity){
        control.right(velocity);
    }

    public void up(int velocity){
        control.up(velocity);
    }

    public void turboBoost(){
        control.turBoost();
    }

    public static void main(String[] args){
        SpaceShipDelegation protector = new SpaceShipDelegation("NASA Protector");
        protector.forward(1000);
    }
}



