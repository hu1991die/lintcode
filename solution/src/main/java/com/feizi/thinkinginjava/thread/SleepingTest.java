/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.thinkinginjava.thread;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/9/27 14:13
 * @Package_name com.feizi.thinkinginjava.thread
 */
public class SleepingTest extends LiftOff{
    @Override
    public void run() {
        try {
            while (countDown-- > 0){
                long t = new Random(10L).nextLong();
                TimeUnit.MILLISECONDS.sleep(t);
                System.out.println("休眠" + t);
            }
        } catch (InterruptedException e) {
            System.err.println("Interrupt.");
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            exec.execute(new SleepingTest());
        }
        exec.shutdown();
    }
}
