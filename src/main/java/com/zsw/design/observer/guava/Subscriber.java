package com.zsw.design.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * 订阅者
 *
 * @author Shaowei Zhang on 2019/3/18 1:16
 **/
public interface Subscriber {

    @Subscribe
    void action(GPerForum forum);

}
