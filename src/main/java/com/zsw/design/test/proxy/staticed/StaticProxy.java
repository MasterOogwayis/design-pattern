package com.zsw.design.test.proxy.staticed;

import com.zsw.design.practice.proxy.target.ObjectTarget;
import lombok.AllArgsConstructor;

/**
 * 静态代理，代理一般持有被代理目标的引用
 * 代理前就知道所有方法，必须每个方法硬编码
 *
 * @author Administrator on 2018/10/18 19:58
 **/
@AllArgsConstructor
public class StaticProxy {

    private ObjectTarget target;

    public void doSomething() {
        System.out.println("我来帮你做事儿了");
        this.target.doSomething();
        System.out.println("做完了...");
    }

    public void doOtherhing() {
        System.out.println("我来帮你做事儿了");
        this.target.doOtherthing();
        System.out.println("做完了...");
    }

    public void doNothing() {
        System.out.println("我来帮你做事儿了");
        this.target.doNothing();
        System.out.println("那算了...");
    }


}
