package com.zsw.design.proxy.istatic;

import com.zsw.design.proxy.ObjectTarget;
import lombok.AllArgsConstructor;

/**
 * 显示的通过代码实现代理，当功能扩展时必须扩展新功能的实现
 *
 * @author ZhangShaowei on 2019/3/12 10:59
 **/
@AllArgsConstructor
public class StaticProxy implements ObjectTarget {

    private ObjectTarget target;


    @Override
    public String doSomething() {
        System.out.println("static proxy...start");
        String str = this.target.doSomething();
        System.out.println("static proxy...end");
        return str;
    }
}
