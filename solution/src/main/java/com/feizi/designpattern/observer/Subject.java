/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc 目标对象：观察者列表，提供注册（添加）和删除观察者的接口
 * @Author feizi
 * @Date 2016/10/8 10:16
 * @Package_name com.feizi.designpattern.observer
 */
public class Subject {
    //观察者列表集合，用来保存注册的观察者对象
    private List<Observer> observers = new ArrayList<Observer>();

    //注册观察者对象
    public void attach(Observer observer){
        observers.add(observer);
    }

    //移除观察者对象
    public void detach(Observer observer){
        observers.remove(observer);
    }

    /**
     * @Desc 受保护的方法只有子类可以调用
     * @Author feizi
     * @Date 2016/10/8 10:25
     * @param
     * @return
     */
    protected void notifyObservers(){
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
