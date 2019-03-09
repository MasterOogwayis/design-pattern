package com.zsw.design.test.proxy;

import com.zsw.design.practice.proxy.target.ObjectTarget;
import com.zsw.design.practice.proxy.target.WorkTarget;
import com.zsw.design.test.proxy.jdk.JdkProxy;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * jdk 提供的动态代理方法
 * 1. 拿到被代理对象的引用
 * 2. 获取到他所有的接口，反射获取
 * 3. 通过Proxy重新生成一个新的类，同时新的类实现了被代理类所有接口方法
 * 4. 动态生成java代码，把新加的逻辑方法由一定的逻辑代码去调用
 * 5. 编译生成的java代码.class
 * 6. 以上过程叫字节码重组
 * <p>
 * 提示：1. jdk 有个规范，只要是 $ 开头的类一般都是自动生成的
 * 2. 可以通过反编译查看生成的源代码
 *
 * @author Administrator on 2018/10/18 20:11
 **/
public class TestJdkProxy {

    public static void main(String[] args) {

        String path = "C:\\Users\\Administrator\\Desktop\\$Proxy0.class";

        ObjectTarget proxyTarget = (ObjectTarget) new JdkProxy().getInstance(new WorkTarget());
        System.out.println(proxyTarget.getClass());
        proxyTarget.doSomething();
        System.out.println("------------------------------------------");
        proxyTarget.doOtherthing();
        System.out.println("------------------------------------------");
        proxyTarget.doNothing();

        byte[] $Proxy0s = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{ObjectTarget.class});

        try (
                FileOutputStream fos = new FileOutputStream(path)
        ) {
            fos.write($Proxy0s);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
