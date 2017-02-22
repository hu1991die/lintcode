/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.importnew.thread;

/**
 * @Desc 线程优先级实例
 * @Author feizi
 * @Date 2016/10/12 13:15
 * @Package_name com.feizi.importnew.thread
 */
public class PriorityThreadDemo {
    public static void main(String[] args) {
        //创建三个线程
        Thread thread1 = new Thread(new PriorityThread(), "Thread1");
        Thread thread2 = new Thread(new PriorityThread(), "Thread2");
        Thread thread3 = new Thread(new PriorityThread(), "Thread3");

        //设置优先级
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(8);

        //开始启动线程
        thread3.start();
        thread1.start();
        thread2.start();
    }
}

/**
 * @Desc 设置线程启动优先级
 * @Author feizi
 * @Date 2016/10/12 13:18
 * @param
 * @return
 */
class PriorityThread implements Runnable{

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}
