/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.thinkinginjava.thread;

import java.util.concurrent.*;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/9/28 13:49
 * @Package_name com.feizi.thinkinginjava.thread
 */
public class DaemonThreadPoolExecutor extends ThreadPoolExecutor{
    public DaemonThreadPoolExecutor() {
        super(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), new DaemonThreadFactory());
    }
}
