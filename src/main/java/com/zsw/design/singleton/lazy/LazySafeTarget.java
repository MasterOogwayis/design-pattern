package com.zsw.design.singleton.lazy;

import java.io.Serializable;
import java.util.Objects;

/**
 * 懒加载模式，屏蔽反射，序列化破坏单例
 *
 * @author Shaowei Zhang on 2019/3/10 15:09
 **/
public class LazySafeTarget implements Serializable {

    private static final long serialVersionUID = 3700417911849243512L;
    private static LazySafeTarget INSTANCE;

    /**
     * 若使用反射修改次字段呢？
     */
    private static boolean initialed = false;

    private static final byte[] LOCK = new byte[0];

    private LazySafeTarget() {
        // 同一个线程当然可以第二次获取锁咯
        synchronized (LOCK) {
            if (initialed) {
                throw new RuntimeException("请不要破坏单例模式");
            }
        }
    }

    /**
     * 线程安全，但影响效率
     *
     * @return
     */
    public static LazySafeTarget getInstance() {
        if (Objects.isNull(INSTANCE)) {
            synchronized (LOCK) {
                if (Objects.isNull(INSTANCE)) {
                    INSTANCE = new LazySafeTarget();
                    initialed = true;
                }
            }
        }
        return INSTANCE;
    }

    /**
     * 防止序列化破坏单例
     *
     * @return
     */
    public Object readResolve() {
        return INSTANCE;
    }

}
