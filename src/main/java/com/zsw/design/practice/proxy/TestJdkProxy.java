package com.zsw.design.practice.proxy;

import com.zsw.design.practice.proxy.jdk.JdkProxy;
import com.zsw.design.practice.proxy.target.ObjectTarget;
import com.zsw.design.practice.proxy.target.WorkTarget;

/**
 * JDK 提供的动态代理方法重新生成一个
 *      1. 拿到被代理对象的引用
 *      2. 通过反射获取到所有接口
 *      3. 通过Proxy重新生成一个新的类，新的类实现了被代理对象所有接口方法
 *      4. 动态生成java，吧新加的逻辑方法由一定的逻辑去调用
 *      5. 编译生成的java生成.class
 *      6. 以上过程叫字节码重组
 *
 * @author ZhangShaowei on 2018/10/26 9:56
 **/
public class TestJdkProxy {

    public static void main(String[] args) {
        ObjectTarget proxy = (ObjectTarget) new JdkProxy().getInstance(new WorkTarget());
        System.out.println(proxy.getClass());
        System.out.println("- - - - - - - - - - 分割线 - - - - - - - - - -");
        proxy.doSomething();
        System.out.println("- - - - - - - - - - 分割线 - - - - - - - - - -");
        proxy.doOtherthing();
        System.out.println("- - - - - - - - - - 分割线 - - - - - - - - - -");
        proxy.doNothing();
    }

}
