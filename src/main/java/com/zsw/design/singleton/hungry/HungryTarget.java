package com.zsw.design.singleton.hungry;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * 饿汉式
 *
 * @author Shaowei Zhang on 2019/3/10 15:09
 **/
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class HungryTarget {


    private static HungryTarget INSTANCE = new HungryTarget();


    /**
     * 线程安全，但浪费空间
     *
     * @return
     */
    public static HungryTarget getInstance() {
        return INSTANCE;
    }


}
