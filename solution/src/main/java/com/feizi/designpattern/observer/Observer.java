/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.designpattern.observer;

/**
 * @Desc 观察者接口，定义一个更新的接口给那些在目标发生改变的时候被通知的对象
 * @Author feizi
 * @Date 2016/10/8 10:19
 * @Package_name com.feizi.designpattern.observer
 */
public interface Observer {

    /**
     * @Desc 观察者更新的方法
     * @Author feizi
     * @Date 2016/10/8 10:31
     * @param
     * @return
     */
    public void update(Subject subject);
}