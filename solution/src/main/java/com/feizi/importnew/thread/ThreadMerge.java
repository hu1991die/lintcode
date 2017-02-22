/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.importnew.thread;

/**
 * @Desc 线程合并实例(join)
 * @Author feizi
 * @Date 2016/10/12 13:04
 * @Package_name com.feizi.importnew.thread
 */
public class ThreadMerge {
    public static void main(String[] args) {
        System.out.println("主线程开启...");

        Thread thread1 = new Thread(new Plugin1());
        Thread thread2 = new Thread(new Plugin2());

        try {
            thread1.start();//开始插件1的安装
            thread1.join();//等待插件1的安装线程结束
            thread2.start();//再开始插件2的安装
            thread2.join();//等待插件2的安装线程结束，才能回到主线程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("主线程结束，程序安装完成！");
    }
}

/**
 * @Desc 插件1
 * @Author feizi
 * @Date 2016/10/12 13:05
 * @param
 * @return
 */
class Plugin1 implements Runnable{

    public void run() {
        System.out.println("插件1开始安装...");
        System.out.println("安装中...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("插件1完成安装...");
    }
}

/**
 * @Desc 插件2
 * @Author feizi
 * @Date 2016/10/12 13:06
 * @param
 * @return
 */
class Plugin2 implements Runnable{

    public void run() {
        System.out.println("插件2开始安装...");
        System.out.println("安装中...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("插件2完成安装...");
    }
}
