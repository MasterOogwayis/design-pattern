package com.zsw.design.practice.proxy.staticed;

import com.zsw.design.practice.proxy.target.ObjectTarget;
import lombok.AllArgsConstructor;

/**
 * @author ZhangShaowei on 2018/10/26 9:34
 **/
@AllArgsConstructor
public class StaticProxy {

    /**
     * 代理者一般都持有被代理这的引用
     */
    private ObjectTarget target;


    public void doSomething() {
        System.out.println("静态代理： start");
        this.target.doSomething();
        System.out.println("静态代理：end");
    }

    public void doOtherthing() {
        System.out.println("静态代理： start");
        this.target.doOtherthing();
        System.out.println("静态代理：end");
    }

    public void doNothing() {
        System.out.println("静态代理： start");
        this.target.doNothing();
        System.out.println("静态代理：end");
    }


}
