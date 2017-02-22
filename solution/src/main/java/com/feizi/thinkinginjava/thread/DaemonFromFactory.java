/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.thinkinginjava.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/9/27 15:48
 * @Package_name com.feizi.thinkinginjava.thread
 */
public class DaemonFromFactory implements Runnable {
    private String name;

    public DaemonFromFactory() {
    }

    public DaemonFromFactory(String name) {
        this.name = name;
    }

    public void run() {
        try {
            while (true){
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + ": " + this.name);
            }
        } catch (InterruptedException e) {
            System.err.println("thread sleep() interrupted.");
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool(new DaemonThreadFactory());
        for (int i = 0; i < 10; i++) {
            exec.execute(new DaemonFromFactory("【Thread" + i + "】"));
        }
        System.out.println("All daemons started.");
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            System.err.println("main thread sleep() interrupted.");
        }
    }
}
