package com.zsw.design.template.iinterface;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Shaowei Zhang on 2019/3/17 17:46
 **/
@Data
public class CheesePizza implements Pizza {

    @Accessors(fluent = true, chain = false)
    private String name;

    @Accessors(fluent = true, chain = false)
    private String bake;

    @Accessors(fluent = true, chain = false)
    private String cut;

    @Accessors(fluent = true, chain = false)
    private String box;

    public String toString() {
        return this.name + " " + this.bake + " " + this.cut + " " + this.box;
    }

}
