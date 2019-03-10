package com.zsw.design.singleton.register;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册时单例
 *
 * @author Shaowei Zhang on 2019/3/10 15:47
 **/
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RegisterContainer {

    private static Map<Class<?>, Object> ioc = new ConcurrentHashMap<>();

    private static final byte[] lock = new byte[0];

    @SneakyThrows
    @SuppressWarnings("unchecked")
    public static <T> T getInstance(Class<T> clazz) {
        synchronized (lock) {
            if (!ioc.containsKey(clazz)) {
                ioc.put(clazz, clazz.getDeclaredConstructor().newInstance());
            }
        }
        return (T) ioc.get(clazz);
    }


}
