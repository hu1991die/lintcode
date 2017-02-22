/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.thinkinginjava.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/9/27 13:16
 * @Package_name com.feizi.thinkinginjava.thread
 */
public class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
