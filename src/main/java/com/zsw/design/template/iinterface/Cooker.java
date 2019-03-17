package com.zsw.design.template.iinterface;

/**
 * @author Shaowei Zhang on 2019/3/17 17:30
 **/
public interface Cooker {

    default Pizza create() {
        Pizza pizza = new CheesePizza();
        pizza.name("Cheese");
        return pizza;
    }

}
