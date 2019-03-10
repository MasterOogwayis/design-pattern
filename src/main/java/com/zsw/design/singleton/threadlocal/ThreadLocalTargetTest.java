package com.zsw.design.singleton.threadlocal;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Shaowei Zhang on 2019/3/10 16:40
 **/
@Slf4j
public class ThreadLocalTargetTest {

    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                log.info("{}", ThreadLocalTarget.getInstance());
                log.debug("{}", ThreadLocalTarget.getInstance());
            }).start();

        }


    }

}
