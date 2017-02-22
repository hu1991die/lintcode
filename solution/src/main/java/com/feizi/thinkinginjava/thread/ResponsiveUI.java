/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.thinkinginjava.thread;

import java.io.IOException;

/**
 * @Desc 创建有响应的用户界面
 * @Author feizi
 * @Date 2016/9/29 13:55
 * @Package_name com.feizi.thinkinginjava.thread
 */
public class ResponsiveUI extends Thread {
    private static volatile double d = 1;

    public ResponsiveUI() {
        setDaemon(true);
        start();
    }

    @Override
    public void run() {
        while (true){
            d = d + (Math.PI + Math.E) / d;
        }
    }

    public static void main(String[] args) throws IOException {
//        new UnresponsiveUI();//Must kill this process
        new ResponsiveUI();
        System.in.read();
        System.out.println(d);//Shows progress
    }
}

class UnresponsiveUI{
    private volatile double d = 1;

    public UnresponsiveUI() throws IOException {
        while (d > 0){
            d = d + (Math.PI + Math.E) / d;
            System.in.read();// never gets here
        }
    }
}
