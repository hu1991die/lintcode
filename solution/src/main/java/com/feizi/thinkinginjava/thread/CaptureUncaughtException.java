/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.thinkinginjava.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/9/29 14:09
 * @Package_name com.feizi.thinkinginjava.thread
 */
public class CaptureUncaughtException {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool(new HandlerThreadFactory());
        exec.execute(new ExceptionThread2());
    }
}

class ExceptionThread2 implements Runnable{
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(" run() by " + t);
        System.out.println(" eh = " + t.getUncaughtExceptionHandler());

        throw new RuntimeException();
    }
}

class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler{

    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(" caught " + e);
    }
}

class HandlerThreadFactory implements ThreadFactory{

    public Thread newThread(Runnable r) {
        System.out.println(this + " creating new Thread");
        Thread t = new Thread(r);
        System.out.println(" created " + t);
        t.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        System.out.println(" eh = " + t.getUncaughtExceptionHandler());
        return t;
    }
}
