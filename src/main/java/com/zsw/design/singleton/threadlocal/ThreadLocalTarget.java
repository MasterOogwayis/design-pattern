package com.zsw.design.singleton.threadlocal;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author Shaowei Zhang on 2019/3/10 16:38
 **/
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ThreadLocalTarget {

    private static final ThreadLocal<ThreadLocalTarget> threadLocal
            = ThreadLocal.withInitial(ThreadLocalTarget::new);

    public static ThreadLocalTarget getInstance() {
        return threadLocal.get();
    }

}
