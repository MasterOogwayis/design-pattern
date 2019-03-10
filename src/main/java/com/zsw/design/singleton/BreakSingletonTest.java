package com.zsw.design.singleton;

import com.zsw.design.singleton.lazy.LazyTarget;
import lombok.Cleanup;
import lombok.SneakyThrows;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * 尝试破坏单例
 *
 * @author Shaowei Zhang on 2019/3/10 15:53
 **/
public class BreakSingletonTest {


    @SneakyThrows
    public static void main(String[] args) {
        LazyTarget target = LazyTarget.getInstance();
        // 1. 通过反射破坏单例 成功
        Constructor<LazyTarget> constructor = LazyTarget.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        LazyTarget reflectTarget = constructor.newInstance();
        System.out.println("反射: " + (target.equals(reflectTarget)));

        // 2. 通过序列化破坏单例 成功
        @Cleanup ByteArrayOutputStream bos = new ByteArrayOutputStream();
        @Cleanup ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(target);
        @Cleanup ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
        LazyTarget seriableTarget = (LazyTarget) ois.readObject();
        System.out.println("序列化: " + (target.equals(seriableTarget)));


    }

}
