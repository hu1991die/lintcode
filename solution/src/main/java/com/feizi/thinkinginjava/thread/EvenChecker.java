/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.thinkinginjava.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/9/29 14:41
 * @Package_name com.feizi.thinkinginjava.thread
 */
public class EvenChecker implements Runnable{
    private IntGenerator generator;
    private final int id;

    public EvenChecker(IntGenerator g, int ident) {
        this.generator = g;
        this.id = ident;
    }

    public void run() {
        while (!generator.isCanceled()){
            int val = generator.next();
            if(val % 2 != 0){
                System.out.println(val + " is not even!");
                generator.cancel();//Cancel all EvenCkeckers
            }
        }
    }

    //Test and type of IntGenerator;
    public static void test(IntGenerator gp, int count){
        System.out.println("Press Control-C to exit");
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++) {
            exec.execute(new EvenChecker(gp, i));
        }
        exec.shutdown();
    }

    //Default value for count
    public static void test(IntGenerator gp){
        test(gp, 10);
    }
}
