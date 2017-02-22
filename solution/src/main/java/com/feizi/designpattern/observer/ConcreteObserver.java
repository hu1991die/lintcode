/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.designpattern.observer;

/**
 * @Desc 具体的观察者对象，实现更新方法，使得自身的状态和目标的状态保持一致
 * @Author feizi
 * @Date 2016/10/8 10:21
 * @Package_name com.feizi.designpattern.observer
 */
public class ConcreteObserver implements Observer{

    //观察者的状态
    private String observerState;

    /**
     * @param subject
     * @return
     * @Desc 观察者更新的方法
     * @Author feizi
     * @Date 2016/10/8 10:31
     */
    public void update(Subject subject) {
        //获取目标类的状态同步到观察者的状态中
        observerState = ((ConcreteSubject)subject).getSubjectState();
    }
}
