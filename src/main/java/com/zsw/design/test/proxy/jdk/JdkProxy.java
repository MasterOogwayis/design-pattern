package com.zsw.design.test.proxy.jdk;


import com.zsw.design.practice.proxy.target.ObjectTarget;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 * <p>
 * JDK 提供的动态代理代理 Proxy，必须实现接口
 * 重组字节码的方式实现代理
 *
 * @author Administrator on 2018/10/18 20:05
 **/
public class JdkProxy implements InvocationHandler {


    /**
     * 代理对象持有被代理对象的引用
     */
    private ObjectTarget target;

    public Object getInstance(ObjectTarget target) {
        this.target = target;

        Class<?> clazz = this.target.getClass();

        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("jdk proxy: 我来帮你做事儿了");
        method.invoke(target, args);
        System.out.println("jdk proxy: 做完了...");
        return null;
    }
}
