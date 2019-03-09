package com.zsw.design.practice.proxy;

import com.zsw.design.practice.proxy.staticed.StaticProxy;
import com.zsw.design.practice.proxy.target.WorkTarget;

/**
 * 静态代理： 代理前就知道所有方法，每个方法都要硬编码实现附加逻辑
 *
 * @author ZhangShaowei on 2018/10/26 9:38
 **/
public class TestStaticProxy {

    public static void main(String[] args) {
        StaticProxy proxy = new StaticProxy(new WorkTarget());
        proxy.doSomething();
        System.out.println("- - - - - - - - - - 分割线 - - - - - - - - - -");
        proxy.doOtherthing();
        System.out.println("- - - - - - - - - - 分割线 - - - - - - - - - -");
        proxy.doNothing();
    }


}
