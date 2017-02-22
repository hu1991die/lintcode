/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.thread.pdf;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/12/7 10:08
 * @Package_name com.feizi.thread.pdf
 */
public class Example {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread threadA = new CounterThread(new Counter());
        Thread threadB = new CounterThread(new Counter());

        threadA.start();
        threadB.start();
    }
}
