package com.zsw.design.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Administrator on 2019/03/11 19:28
 **/
@Data
@AllArgsConstructor
public class CloneTarget implements Cloneable {

    private ChildrenTarget childrenTarget;


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
