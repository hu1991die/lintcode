/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.importnew.observerpattern.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc 被观察者-目标对象
 * @Author feizi
 * @Date 2016/10/9 16:06
 * @Package_name com.feizi.importnew.observerpattern.v2
 */
public abstract class Subject {
    protected boolean isChanaged;
    protected List<Observer> observers = new ArrayList<Observer>();

    public Subject() {
        isChanaged = false;
    }

    /**
     * @Desc 添加观察者
     * @Author feizi
     * @Date 2016/10/9 16:11
     * @param
     * @return
     */
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    /**
     * @Desc 移除观察者
     * @Author feizi
     * @Date 2016/10/9 16:11
     * @param
     * @return
     */
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    /**
     * @Desc 清空观察者列表
     * @Author feizi
     * @Date 2016/10/9 16:12
     * @param
     * @return
     */
    public void removeObservers(){
        observers.clear();
    }

    /**
     * @Desc 通知观察者
     * @Author feizi
     * @Date 2016/10/9 16:12
     * @param
     * @return
     */
    public void notifyObservers(){
        if(isChanaged){
            for (Observer observer : observers){
                observer.update(this);
            }
            isChanaged = false;
        }
    }
}
