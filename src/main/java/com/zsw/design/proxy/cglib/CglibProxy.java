package com.zsw.design.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib动过动态继承来实现功能增强，借口并不是必须的
 *
 * @author ZhangShaowei on 2019/3/12 13:11
 **/
public class CglibProxy implements MethodInterceptor {

    @SuppressWarnings("unchecked")
    public <T> T getInstance(Class<T> clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return (T) enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib proxy...start");
        Object obj = methodProxy.invokeSuper(o, objects);
        System.out.println("cglib proxy...end");
        return obj;
    }
}
