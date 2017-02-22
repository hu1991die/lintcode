/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.thinkinginjava.thread;

import java.util.concurrent.TimeUnit;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/9/28 13:54
 * @Package_name com.feizi.thinkinginjava.thread
 */
public class Daemons {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(new Daemon());
        thread.setDaemon(true);
        thread.start();
        System.out.println("thread.isDaemon() = " + thread.isDaemon() + ", ");

        System.out.println();

        //线程休眠
        TimeUnit.SECONDS.sleep(10);
    }
}

class Daemon implements Runnable{
    private Thread[] t = new Thread[10];

    public void run() {
        for (int i = 0; i < t.length; i++) {
            t[i] = new Thread(new DaemonSpawn());
            t[i].start();
            System.out.println("DaemonSpawn " + i + " started. ");
        }

        System.out.println();

        for (int i = 0; i < t.length; i++) {
            System.out.println("t[" + i + "].isDaemon() = " + t[i].isDaemon() + ", ");
        }

        while (true){
            Thread.yield();
        }
    }
}

class DaemonSpawn implements Runnable{
    public void run() {
        while (true){
            Thread.yield();
        }
    }
}