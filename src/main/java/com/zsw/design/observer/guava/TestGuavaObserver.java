package com.zsw.design.observer.guava;


import com.google.common.eventbus.EventBus;

/**
 * @author Shaowei Zhang on 2019/3/18 1:02
 **/
public class TestGuavaObserver {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus("Test");

        Publisher publisher = new Student("GP16543");
        Question question = publisher.create("装饰者模式和代理模式有什么区别");

        eventBus.register(new Teacher("Tom"));
        eventBus.register(new Teacher("James"));
        eventBus.register(new Teacher("大白"));

        eventBus.post(new GPerForum("GPer生态圈", question));

    }

}
