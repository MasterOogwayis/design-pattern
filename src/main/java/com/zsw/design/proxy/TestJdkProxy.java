package com.zsw.design.proxy;

import com.zsw.design.proxy.jdk.JdkProxy;

/**
 * @author ZhangShaowei on 2019/3/12 11:05
 **/
public class TestJdkProxy {

    public static void main(String[] args) {

        // 自动生成 $Proxy0,class 文件
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        ObjectTarget target = new JdkProxy().getInstance(new WorkTarget());
        String something = target.doSomething();
        System.err.println(something);
//        String name = "$Proxy0";
//        String fileName = name + ".class";
//        byte[] bytes = ProxyGenerator.generateProxyClass(name, new Class[]{ObjectTarget.class});
//
//        Files.write(Paths.get(fileName), bytes, StandardOpenOption.CREATE);

    }

}
