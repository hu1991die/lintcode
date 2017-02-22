/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.thinkinginjava.thread;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/9/27 9:35
 * @Package_name com.feizi.thinkinginjava.thread
 */
public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            Thread thread = new Thread(new LiftOff());
            thread.start();
        }
    }
}
