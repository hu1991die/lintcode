/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.importnew.thread;

import java.io.PrintWriter;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/10/12 11:32
 * @Package_name com.feizi.importnew.thread
 */
public class PrinterThread {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread printerThread = new Thread(printer, "打印线程");
        printerThread.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("有紧急任务出现，需中断打印线程.");
        System.out.println("中断前的状态：" + printerThread.isInterrupted());
        //中断打印线程
        printerThread.interrupt();
        System.out.println("中断后的状态：" + printerThread.isInterrupted());
    }
}

class Printer implements Runnable{

    public void run() {
        while(!Thread.currentThread().isInterrupted()){
            //如果当前线程未被中断，则执行打印工作
            System.out.println(Thread.currentThread().getName() + "打印中...");
        }

        if(Thread.currentThread().isInterrupted()){
            //返回当前线程的状态，并清除状态
            System.out.println("interrupted:" + Thread.interrupted());
            System.out.println("isInterrupted:" + Thread.currentThread().isInterrupted());
        }
    }
}
