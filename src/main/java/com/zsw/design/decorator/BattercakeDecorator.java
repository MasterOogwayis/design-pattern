package com.zsw.design.decorator;

import lombok.AllArgsConstructor;

/**
 * @author Shaowei Zhang on 2019/3/18 21:13
 **/
@AllArgsConstructor
public class BattercakeDecorator extends Battercake {

    private Battercake battercake;

    @Override
    String getName() {
        return this.battercake.getName();
    }

    @Override
    Integer getPrice() {
        return this.battercake.getPrice();
    }
}
