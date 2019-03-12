package com.zsw.design.proxy.jdk;

import com.zsw.design.proxy.ObjectTarget;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
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
