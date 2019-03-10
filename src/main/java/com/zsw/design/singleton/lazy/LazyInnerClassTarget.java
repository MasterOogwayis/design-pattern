package com.zsw.design.singleton.lazy;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * 内部类方式
 *
 * @author Shaowei Zhang on 2019/3/10 15:09
 **/
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LazyInnerClassTarget {

    private static class TargetHandler {
        private static LazyInnerClassTarget INSTANCE = new LazyInnerClassTarget();
    }

    /**
     * 线程安全，在使用到才会加载
     *
     * 5 种情况会初始化类
     * 1. 通过new 实例化一个对象，获取/设置这个对象的静态字段，调用此类的静态方法
     * 2. 使用反射对类进行调用
     * 3. 这个类的子类被初始化，父类会被先初始化
     * 4. main 方法所在的类，虚拟机启动时必定被初始化
     * 5. jdk1.7 动态语言 MethodHandle 解析后是设置static or invokestatic
     *
     *
     * @return
     */
    public static LazyInnerClassTarget getInstance() {
        return TargetHandler.INSTANCE;
    }


}
