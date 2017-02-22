/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.designpattern.observer;

/**
 * @Desc 具体的目标对象，负责把有关状态存入到相应的观察者对象中
 * @Author feizi
 * @Date 2016/10/8 10:17
 * @Package_name com.feizi.designpattern.observer
 */
public class ConcreteSubject extends Subject{
    //目标对象的状态
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        this.notifyObservers();
    }


}
