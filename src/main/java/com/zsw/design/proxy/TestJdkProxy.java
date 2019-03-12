package com.zsw.design.proxy;

import com.zsw.design.proxy.jdk.JdkProxy;

/**
 * @author ZhangShaowei on 2019/3/12 11:05
 **/
public class TestJdkProxy {

    public static void main(String[] args) {

        ObjectTarget target = new JdkProxy().getInstance(new WorkTarget());
        String something = target.doSomething();
        System.err.println(something);

    }

}
