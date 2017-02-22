/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.thread.pdf;

/**
 * @Desc 计数器
 * @Author feizi
 * @Date 2016/12/7 9:59
 * @Package_name com.feizi.thread.pdf
 */
public class Counter {
    long count = 0;

    public synchronized void add(long value){
        this.count += value;
        System.out.println(this.count);
    }
}
