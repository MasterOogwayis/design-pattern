package com.zsw.design.factory;

import com.zsw.design.factory.abstractfactory.ChicagoStylePizzaStore;
import com.zsw.design.factory.abstractfactory.NYStylePizzaStore;
import com.zsw.design.factory.abstractfactory.SimplePizzaStore;

/**
 * @author Shaowei Zhang on 2019/3/7 21:39
 **/
public class AbstractFactoryTest {


    public static void main(String[] args) {

        PizzaStore pizzaStore = new SimplePizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");

        pizzaStore = new NYStylePizzaStore();
        pizza = pizzaStore.orderPizza("cheese");

        pizzaStore = new ChicagoStylePizzaStore();
        pizza = pizzaStore.orderPizza("cheese");

    }


}
