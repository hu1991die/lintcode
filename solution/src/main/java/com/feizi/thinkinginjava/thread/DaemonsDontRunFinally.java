/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.thinkinginjava.thread;

import java.util.concurrent.TimeUnit;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/9/28 14:09
 * @Package_name com.feizi.thinkinginjava.thread
 */
public class DaemonsDontRunFinally {
    public static void main(String[] args) {
        Thread t = new Thread(new ADaemon());
        t.setDaemon(true);
        t.start();
    }
}

class ADaemon implements Runnable{
    public void run() {
        try {
            System.out.println("Starting ADaemon.");
            TimeUnit.MILLISECONDS.sleep(1500);
        } catch (InterruptedException e) {
            System.err.println("Exiting via InterruptedException.");
        }finally {
            System.out.println("This should always run?");
        }
    }
}