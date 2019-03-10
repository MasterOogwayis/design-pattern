package com.zsw.design.singleton;

import com.zsw.design.singleton.lazy.LazyTarget;

/**
 * @author Shaowei Zhang on 2019/3/10 15:10
 **/
public class LazyTargetTest {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            new Thread(() -> System.out.println(LazyTarget.getInstance())).start();
        }

    }

}
