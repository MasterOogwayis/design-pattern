package com.zsw.design.delegate;

import lombok.AllArgsConstructor;

/**
 * 厨师
 *
 * @author Shaowei Zhang on 2019/3/14 23:37
 **/
@AllArgsConstructor
public class Chef {

    private String name;

    private String dishes;

    public String cook() {
        System.out.println("我是厨师" + this.name + "，我负责烹调 " + this.dishes);
        return this.dishes;
    }


}
