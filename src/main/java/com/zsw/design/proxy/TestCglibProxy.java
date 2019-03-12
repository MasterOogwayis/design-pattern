package com.zsw.design.proxy;

import com.zsw.design.proxy.cglib.CglibProxy;

/**
 * @author ZhangShaowei on 2019/3/12 13:39
 **/
public class TestCglibProxy {

    public static void main(String[] args) {

        WorkTarget target = new CglibProxy().getInstance(WorkTarget.class);
        String str = target.doSomething();
        System.err.println(str);

    }

}
