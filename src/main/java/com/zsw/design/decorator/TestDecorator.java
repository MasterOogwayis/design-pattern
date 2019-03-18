package com.zsw.design.decorator;

/**
 * 装饰器模式
 *
 * @author Shaowei Zhang on 2019/3/18 0:17
 **/
public class TestDecorator {

    public static void main(String[] args) {

        Battercake battercake = new BaseBattercake();

        battercake = new BattercakeWithEgg(battercake);

        battercake = new BattercakeWithEgg(battercake);

        battercake = new SausageBattercake(battercake);

        System.out.println(battercake.getName() + ",总价 " + battercake.getPrice());

    }

}
