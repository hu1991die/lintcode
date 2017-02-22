/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.thinkinginjava.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Desc 捕获异常
 * @Author feizi
 * @Date 2016/9/29 14:05
 * @Package_name com.feizi.thinkinginjava.thread
 */
public class ExceptionThread implements Runnable{

    public void run() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        try {
            ExecutorService exec = Executors.newCachedThreadPool();
            exec.execute(new ExceptionThread());
        } catch (Exception e) {
            //this statement will NOT execute!
            System.out.println("Exception has been handled.");
        }
    }
}
