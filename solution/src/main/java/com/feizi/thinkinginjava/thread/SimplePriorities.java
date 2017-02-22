/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.thinkinginjava.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Desc 线程优先级
 * @Author feizi
 * @Date 2016/9/27 14:29
 * @Package_name com.feizi.thinkinginjava.thread
 */
public class SimplePriorities implements Runnable{
    private int countDown = 5;
    private volatile double d;// No optimization
    private int priority;

    public SimplePriorities(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return Thread.currentThread() + " : " + countDown;
    }

    public void run() {
        Thread.currentThread().setPriority(priority);
        while (true){
            // An expensive, interruptable operation:
            for (int i = 0; i < 1000000; i++) {
                d += (Math.PI + Math.E) / (double) i;
                if(i % 100000 == 0){
                    // 让步机制
                    Thread.yield();
                }
            }
            System.out.println(this);
            if(--countDown == 0){
                return;
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new SimplePriorities(Thread.MIN_PRIORITY));
        }
        exec.execute(new SimplePriorities(Thread.MAX_PRIORITY));
        exec.shutdown();
    }
}
