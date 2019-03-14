package com.zsw.design.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * 服务员
 *
 * @author Shaowei Zhang on 2019/3/14 23:36
 **/
public class Waiter {

    private Map<String, Chef> menu = new HashMap<>();


    public Waiter() {
        this.menu.put("面条", new Chef("A", "面条"));
        this.menu.put("包子", new Chef("B", "包子"));
        this.menu.put("馒头", new Chef("C", "馒头"));
        this.menu.put("饺子", new Chef("D", "饺子"));
        this.menu.put("回锅肉", new Chef("E", "回锅肉"));
    }

    public String order(String dish) {
        return this.menu.get(dish).cook();
    }






}
