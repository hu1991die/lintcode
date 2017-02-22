/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.thread;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/11/10 17:20
 * @Package_name com.feizi.thread
 */
public class TestThread {

    public static void main(String[] args) {
        /*RunnableDemo R1 = new RunnableDemo("Thread-1");
        R1.start();

        RunnableDemo R2 = new RunnableDemo("Thread-2");
        R2.start();*/

        MyThreadDemo M1 = new MyThreadDemo("Thread-1");
        M1.start();

        MyThreadDemo M2 = new MyThreadDemo("Thread-2");
        M2.start();
    }
}

/**
 * @Desc 继承Thread类
 * @Author feizi
 * @Date 2016/11/10 17:42
 * @param
 * @return
 */
class MyThreadDemo extends Thread{
    private Thread t;
    private String threadName;

    public MyThreadDemo(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        for (int i = 4; i > 0; i--) {
            System.out.println("Thread " + threadName + ", " + i);

            try {
                //让线程休眠一会儿
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println("Thread " + threadName + " interrupted.");
            }
            System.out.println("Thread " + threadName + " exiting.");
        }
    }

    public void start(){
        System.out.println("Staring " + threadName);
        if(null == t){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

/**
 * @Desc 实现Runnable接口
 * @Author feizi
 * @Date 2016/11/10 17:42
 * @param
 * @return
 */
class RunnableDemo implements Runnable{

    private Thread t;
    private String threadName;

    public RunnableDemo(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating " + threadName);
    }

    public void run(){
        System.out.println("Running " + threadName);
        for (int i = 4; i > 0; i--){
            System.out.println("Thread: " + threadName + ", " + i);

            try {
                //让线程休眠一会儿
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println("Thread " +  threadName + " interrupted.");
            }
            System.out.println("Thread " +  threadName + " exiting.");
        }
    }

    public void start(){
        System.out.println("Starting " + threadName);
        if(null == t){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}