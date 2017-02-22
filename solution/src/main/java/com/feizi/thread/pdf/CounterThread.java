/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.thread.pdf;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/12/7 10:00
 * @Package_name com.feizi.thread.pdf
 */
public class CounterThread extends Thread {
    protected Counter counter = null;

    public CounterThread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            counter.add(i);
        }
    }
}
