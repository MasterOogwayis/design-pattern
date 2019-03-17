package com.zsw.design.observer.guava;

/**
 * 发布者
 *
 * @author Shaowei Zhang on 2019/3/18 1:14
 **/
public interface Publisher {

    Question create(String question);

}
