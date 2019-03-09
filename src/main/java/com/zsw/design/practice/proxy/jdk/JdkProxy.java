package com.zsw.design.practice.proxy.jdk;

import com.zsw.design.practice.proxy.target.ObjectTarget;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ZhangShaowei on 2018/10/26 9:50
 **/
public class JdkProxy implements InvocationHandler {

    private ObjectTarget target;

    public Object getInstance(ObjectTarget target) {
        this.target = target;
        Class<?> clazz = this.target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我来帮你做事了");
        method.invoke(target, args);
        System.out.println("做完了...");
        return null;
    }
}
