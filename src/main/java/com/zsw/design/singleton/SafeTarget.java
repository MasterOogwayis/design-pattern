package com.zsw.design.singleton;

import java.io.Serializable;
import java.util.Objects;

/**
 * 完全安全的单例
 *
 * @author Shaowei Zhang on 2019/3/19 23:23
 **/
public class SafeTarget implements Serializable {

    private static final long serialVersionUID = -3232049958570799407L;

    private SafeTarget() {

        if (Objects.nonNull(TargetHolder.INSTANCE)) {
            throw new RuntimeException("请不要破坏单例模式");
        }

    }

    public static SafeTarget getInstance(){
        return TargetHolder.INSTANCE;
    }



    private static final class TargetHolder {
        private static final SafeTarget INSTANCE = new SafeTarget();
    }

    public Object readResolve() {
        return TargetHolder.INSTANCE;
    }


}
