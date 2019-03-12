package com.zsw.design.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Administrator on 2019/03/11 19:28
 **/
@Data
@AllArgsConstructor
public class ChildrenTarget implements Serializable {

    private String name;

}
