/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.thinkinginjava.thread;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/9/28 14:42
 * @Package_name com.feizi.thinkinginjava.thread
 */
public class SimpleThread extends Thread{
    private int countDown = 5;
    private static int threadCount = 0;

    public SimpleThread() {
        //Store the thread name
        super(Integer.toString(++threadCount));
        start();
    }

    @Override
    public String toString() {
        return "#" + getName() + "(" + countDown + "),";
    }

    @Override
    public void run() {
        while (true){
            System.out.println(this);
            if(--countDown == 0){
                return;
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new SimpleThread().setName("[Thread" + i + "]");
        }
    }
}
