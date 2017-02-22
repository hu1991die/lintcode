/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.thinkinginjava.thread;

/**
 * @Desc 整数生成器
 * @Author feizi
 * @Date 2016/9/29 14:30
 * @Package_name com.feizi.thinkinginjava.thread
 */
public abstract class IntGenerator {
    private volatile boolean canceled = false;

    public abstract int next();

    //Allow this to be canceled
    public void cancel() {
        this.canceled = true;
    }

    public boolean isCanceled() {
        return canceled;
    }
}
