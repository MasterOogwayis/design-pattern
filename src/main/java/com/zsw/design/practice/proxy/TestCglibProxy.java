package com.zsw.design.practice.proxy;

import com.zsw.design.practice.proxy.cglib.CglibProxy;
import com.zsw.design.practice.proxy.target.ObjectTarget;
import com.zsw.design.practice.proxy.target.WorkTarget;

/**
 * @author ZhangShaowei on 2018/10/26 10:24
 **/
public class TestCglibProxy {

    public static void main(String[] args) {

        ObjectTarget proxy = (ObjectTarget) new CglibProxy().getInstance(WorkTarget.class);
        System.out.println(proxy.getClass());
        System.out.println("- - - - - - - - - - 分割线 - - - - - - - - - -");
        proxy.doSomething();
        System.out.println("- - - - - - - - - - 分割线 - - - - - - - - - -");
        proxy.doOtherthing();
        System.out.println("- - - - - - - - - - 分割线 - - - - - - - - - -");
        proxy.doNothing();

    }

}
