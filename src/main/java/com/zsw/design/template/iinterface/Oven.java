package com.zsw.design.template.iinterface;

/**
 * @author Shaowei Zhang on 2019/3/17 17:31
 **/
public interface Oven {

    default void bake(Pizza pizza) {
        pizza.bake("350℃ 烤20分钟");
    }

}
