/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.designpattern.observer.weather;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc 天气预报目标对象:
 * 定义观察者列表，提供注册和删除观察者对象的方法
 * @Author feizi
 * @Date 2016/10/8 10:41
 * @Package_name com.feizi.designpattern.observer.weather
 */
public class WeatherSubject {

    //订阅天气的人列表集合
    private List<Observer> observers = new ArrayList<Observer>();

    //注册订阅了天气的人
    public void attach(Observer observer){
        observers.add(observer);
    }

    //移除指定的订阅了天气的人
    public void detach(Observer observer){
        observers.remove(observer);
    }

    /**
     * @Desc 通知所有已经订阅了天气的人
     * @Author feizi
     * @Date 2016/10/8 11:02
     * @param 
     * @return 
     */
    protected void notifyObservers(){
        for (Observer observer : observers){
            observer.update(this);
        }
    }
}
