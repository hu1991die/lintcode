/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.importnew.observerpattern.v2;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/10/9 16:28
 * @Package_name com.feizi.importnew.observerpattern.v2
 */
public class BoildObserver implements Observer{
    private String doSomething;

    public BoildObserver(String doSomething) {
        this.doSomething = doSomething;
    }

    public void update(Subject observerable) {
        Water water = (Water) observerable;
        if(water.getTemperature() >= 100){
            System.out.println("状态：" + water.getStatus());
            System.out.println("BoildObserver:" + doSomething);
        }
    }
}
