/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.thinkinginjava.thread;

import java.util.concurrent.TimeUnit;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/9/27 15:26
 * @Package_name com.feizi.thinkinginjava.thread
 */
public class SimpleDaemons implements Runnable{
    private String name;

    public SimpleDaemons() {
    }

    public SimpleDaemons(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Daemons threads don't prevent the program from ending
    public void run() {
        try {
            while (true){
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + ": " + this.getName() + "启动了.");
            }
        } catch (InterruptedException e) {
            System.err.println("thread sleep() interrupted...");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread daemon = new Thread(new SimpleDaemons("【Thread" + i + "】"));
            daemon.setDaemon(true);//Must call before start()
            daemon.start();
        }
        System.out.println("All daemons started...");
        try {
            TimeUnit.MILLISECONDS.sleep(150);
        } catch (InterruptedException e) {
            System.err.println("daemon thread sleep() interrupted...");
        }
    }
}
