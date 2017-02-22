/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.thinkinginjava.thread;

import java.util.concurrent.ThreadFactory;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/9/27 15:47
 * @Package_name com.feizi.thinkinginjava.thread
 */
public class DaemonThreadFactory implements ThreadFactory {
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
