/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.thinkinginjava.thread;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/9/27 9:05
 * @Package_name com.feizi.thinkinginjava.thread
 */
public class LiftOff implements Runnable{
    protected int countDown = 10;//default
    private static int taskCount = 0;
    private final int id = taskCount++;

    public LiftOff() {
        System.out.println("Waiting for LiftOff!");
    }

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    public String status(){
        return "#" + id + "(" + (countDown > 0 ? countDown : "LiftOff!") + "),";
    }

    public void run() {
        while (countDown-- > 0){
            System.out.println(status());
            Thread.yield();
        }
    }
}
