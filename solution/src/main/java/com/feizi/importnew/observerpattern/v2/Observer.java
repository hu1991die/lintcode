/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.importnew.observerpattern.v2;

/**
 * @Desc 观察者
 * @Author feizi
 * @Date 2016/10/9 16:05
 * @Package_name com.feizi.importnew.observerpattern.v2
 */
public interface Observer {
    void update(Subject observerable);
}