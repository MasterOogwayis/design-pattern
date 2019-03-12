package com.zsw.design.proxy;

/**
 * @author ZhangShaowei on 2019/3/12 10:58
 **/
public class WorkTarget implements ObjectTarget {


    @Override
    public String doSomething() {
        System.out.println("doSomething");
        return "success";
    }
}
