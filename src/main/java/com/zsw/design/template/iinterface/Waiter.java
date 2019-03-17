package com.zsw.design.template.iinterface;

/**
 * @author Shaowei Zhang on 2019/3/17 17:53
 **/
public interface Waiter {

    default void cut(Pizza pizza) {
        pizza.cut("切成是18块");
    }

    default void box(Pizza pizza) {
        pizza.box("无需打包，装盘");
    }

}
