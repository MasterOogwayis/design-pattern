package com.zsw.design.singleton.lazy;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

/**
 * 懒加载模式
 *
 * @author Shaowei Zhang on 2019/3/10 15:09
 **/
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LazyTarget implements Serializable {

    private static final long serialVersionUID = 6170095765845357218L;
    private static LazyTarget INSTANCE;

    // 线程不安全
//    public static LazyTarget getInstance() {
//        if (Objects.isNull(INSTANCE)) {
//            INSTANCE = new LazyTarget();
//        }
//        return INSTANCE;
//    }

    /**
     * 线程安全，但影响效率
     *
     * @return
     */
    public static synchronized LazyTarget getInstance() {
        if (Objects.isNull(INSTANCE)) {
            INSTANCE = new LazyTarget();
        }
        return INSTANCE;
    }


}
