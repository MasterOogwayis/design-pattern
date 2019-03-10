package com.gupaoedu.vip.pattern.singleton.threadlocal;

/**
 * Created by Tom.
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            ThreadLocal.withInitial(() -> new ThreadLocalSingleton());

    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }
}
