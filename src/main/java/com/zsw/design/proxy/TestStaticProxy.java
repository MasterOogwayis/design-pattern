package com.zsw.design.proxy;

import com.zsw.design.proxy.istatic.StaticProxy;

/**
 * @author ZhangShaowei on 2019/3/12 11:01
 **/
public class TestStaticProxy {

    public static void main(String[] args) {

        ObjectTarget target = new StaticProxy(new WorkTarget());
        String something = target.doSomething();
        System.err.println(something);

    }

}
