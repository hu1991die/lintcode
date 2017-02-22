/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.thinkinginjava.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/9/27 13:10
 * @Package_name com.feizi.thinkinginjava.thread
 */
public class FixedThreadPool {
    public static void main(String[] args) {
        // Constructor argument is number of threads
        ExecutorService exec = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++){
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
