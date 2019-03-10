package com.zsw.design.singleton;

import com.zsw.design.singleton.lazy.LazySafeTarget;
import com.zsw.design.singleton.lazy.LazyTarget;
import lombok.Cleanup;
import lombok.SneakyThrows;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 测试安全的单例模式，屏蔽序列化，反射
 *
 * 结论，传统方式创建对象无论怎么写都能通过反射修改类达到破坏单例模式
 *
 * 目前看来只有 枚举不能被破坏
 *
 * @author Shaowei Zhang on 2019/3/10 15:53
 **/
public class SafeSingletonTest {


    @SneakyThrows
    public static void main(String[] args) {
        LazySafeTarget target = LazySafeTarget.getInstance();


        // 1. 反射修改 初始化标记后 也可以破坏单例模式  成功
        Field initialed = LazySafeTarget.class.getDeclaredField("initialed");
        initialed.setAccessible(true);

        Field modifiers = Field.class.getDeclaredField("modifiers");
        modifiers.setAccessible(true);//设置为可访问
        modifiers.setInt(initialed, initialed.getModifiers() & ~Modifier.FINAL);
        initialed.set(null, false);

        Constructor<LazySafeTarget> constructor = LazySafeTarget.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        LazySafeTarget reflectTarget = constructor.newInstance();
        System.out.println("反射: " + (target.equals(reflectTarget)));


        // 2. 通过序列化破坏单例
        @Cleanup ByteArrayOutputStream bos = new ByteArrayOutputStream();
        @Cleanup ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(target);
        @Cleanup ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
        LazySafeTarget seriableTarget = (LazySafeTarget) ois.readObject();
        System.out.println("序列化: " + (target.equals(seriableTarget)));


    }

}
