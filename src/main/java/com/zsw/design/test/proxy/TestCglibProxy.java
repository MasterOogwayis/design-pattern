package com.zsw.design.test.proxy;

import com.zsw.design.practice.proxy.target.ObjectTarget;
import com.zsw.design.practice.proxy.target.WorkTarget;
import com.zsw.design.test.proxy.cglib.CglibProxy;

/**
 * @author Administrator on 2018/10/18 20:20
 **/
public class TestCglibProxy {


    public static void main(String[] args) {

        ObjectTarget target = (ObjectTarget) new CglibProxy().getInstance(WorkTarget.class);
        target.doSomething();
        System.out.println("------------------------------");
        target.doOtherthing();
        System.out.println("------------------------------");
        target.doNothing();
        System.out.println("------------------------------");
        System.out.println(target.getClass());
        System.out.println(target.toString());

    }

}
