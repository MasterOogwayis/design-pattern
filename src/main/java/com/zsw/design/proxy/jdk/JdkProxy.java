package com.zsw.design.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk 提供的代理动过动态生成字节码 ，实现接口来增强功能，必须是接口才行
 *
 * @author ZhangShaowei on 2019/3/12 11:01
 **/
public class JdkProxy implements InvocationHandler {

    private Object target;

    @SuppressWarnings("unchecked")
    public <T> T getInstance(T target) {
        this.target = target;
        Class clazz = target.getClass();
        return (T) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("jdk proxy..start");
        Object object = method.invoke(target, args);
        System.out.println("jdk proxy..end");
        return object;
    }
}
