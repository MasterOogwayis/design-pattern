package com.zsw.design.delegate;

/**
 * 测试委派模式
 *
 * @author Shaowei Zhang on 2019/3/14 23:31
 **/
public class TestDelegate {

    public static void main(String[] args) {

        new Customer().order("回锅肉", new Waiter());

    }

}
