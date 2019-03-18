package com.zsw.design.decorator;

/**
 * @author Shaowei Zhang on 2019/3/18 21:15
 **/
public class SausageBattercake extends BattercakeDecorator {
    public SausageBattercake(Battercake battercake) {
        super(battercake);
    }

    @Override
    String getName() {
        return super.getName() + " +1根香肠";
    }

    @Override
    Integer getPrice() {
        return super.getPrice() + 2;
    }
}
