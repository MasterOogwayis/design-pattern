package com.zsw.design.delegate;

/**
 * 客户
 *
 * @author Shaowei Zhang on 2019/3/14 23:36
 **/
public class Customer {

    public void order(String dish, Waiter waiter) {
        String food = waiter.order(dish);
        System.out.println(food);
    }


}
