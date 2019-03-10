package com.zsw.design.singleton.register;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Shaowei Zhang on 2019/3/10 15:44
 **/
@Getter
@AllArgsConstructor
public enum  EnumTarget {

    INSTANCE(new Object());

    private Object target;

}
