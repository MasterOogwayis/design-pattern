package com.zsw.design.singleton.lazy;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * 懒加载模式
 *
 * @author Shaowei Zhang on 2019/3/10 15:09
 **/
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LazyDoubleCheckTarget {

    private static LazyDoubleCheckTarget INSTANCE;

    /**
     * 双检锁模式，线程安全，多线程下也能保证性能
     *
     * @return
     */
    public static synchronized LazyDoubleCheckTarget getInstance() {
        if (Objects.isNull(INSTANCE)) {
            synchronized (LazyDoubleCheckTarget.class) {
                if (Objects.isNull(INSTANCE)) {
                    INSTANCE = new LazyDoubleCheckTarget();
                }
            }
        }
        return INSTANCE;
    }


}
