/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.importnew.thread;

/**
 * @Desc 多线程实例
 * @Author feizi
 * @Date 2016/10/12 9:32
 * @Package_name com.feizi.importnew.thread
 */
public class MultiThread {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA("ThreadA");
        ThreadB threadB = new ThreadB("ThreadB");

        threadA.start();
        threadB.start();
    }
}

/**
 * @Desc 通过实现Runnable接口创建线程
 * @Author feizi
 * @Date 2016/10/12 9:33
 * @param
 * @return
 */
class ThreadA implements Runnable{

    private Thread thread;
    private String threadName;

    public ThreadA(String threadName) {
        this.thread = new Thread(this,threadName);
        this.threadName = threadName;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(threadName + " : " + i);
        }
    }

    public void start(){
        thread.start();
    }
}

class ThreadB extends Thread{
    private String threadName;

    public ThreadB(String threadName) {
        super(threadName);
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(threadName + " : " + i);
        }
    }
}