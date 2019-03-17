package com.zsw.design.template.iinterface;

import lombok.AllArgsConstructor;

/**
 * @author Shaowei Zhang on 2019/3/17 17:29
 **/
@AllArgsConstructor
public class PizzaShop {

    private Cooker cooker;

    private Oven oven;

    private Waiter waiter;

    public Pizza order() {
        Pizza pizza = this.cooker.create();
        this.oven.bake(pizza);
        this.waiter.cut(pizza);
        this.waiter.box(pizza);
        return pizza;
    }



}
