package com.zsw.design.test.proxy;

import com.zsw.design.practice.proxy.target.WorkTarget;
import com.zsw.design.test.proxy.staticed.StaticProxy;

/**
 * 静态代理，代理前就知道所有方法，每个方法都需要硬编码
 *
 * @author Administrator on 2018/10/18 19:57
 **/
public class TestStaticProxy {

    public static void main(String[] args) {

        StaticProxy proxy = new StaticProxy(new WorkTarget());
        proxy.doSomething();
        proxy.doOtherhing();
        proxy.doNothing();


    }

}
