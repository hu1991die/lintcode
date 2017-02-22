/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.thread;

/**
 * @Desc 多线程
 * @Author feizi
 * @Date 2016/11/10 16:57
 * @Package_name com.feizi.thread
 */
public class ThreadDemo {
    public static void main(String[] args) {
        /*MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();*/

        HisThread a = new HisThread("A");
        HisThread b = new HisThread("B");

        a.start();
        b.start();
    }
}

class MyThread implements Runnable{

    private int count;
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(name + " : " + i);
            count++;
        }
        System.out.println("count:" + count);
    }
}

class HisThread extends Thread{
    private int count;
    private String name;

    public HisThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(name + " : " + i);
            count++;
        }
        System.out.println("count:" + count);
    }

}