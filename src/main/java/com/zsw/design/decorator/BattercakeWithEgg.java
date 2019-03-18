package com.zsw.design.decorator;

/**
 * @author Shaowei Zhang on 2019/3/18 21:06
 **/
public class BattercakeWithEgg extends BattercakeDecorator {


    public BattercakeWithEgg(Battercake battercake) {
        super(battercake);
    }

    @Override
    public String getName() {
        return super.getName() + " +1个鸡蛋 ";
    }

    @Override
    public Integer getPrice() {
        return super.getPrice() + 1;
    }

}
