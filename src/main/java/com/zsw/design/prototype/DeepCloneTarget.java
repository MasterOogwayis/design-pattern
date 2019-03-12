package com.zsw.design.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.SneakyThrows;

import java.io.*;

/**
 * @author Administrator on 2019/03/11 19:28
 **/
@Data
@AllArgsConstructor
public class DeepCloneTarget implements Cloneable, Serializable {

    private ChildrenTarget childrenTarget;


    @Override
    public Object clone() {
        return this.deepClone();
    }

    @SneakyThrows
    public Object deepClone() {
        return CloneUtils.clone(this);
    }


}
