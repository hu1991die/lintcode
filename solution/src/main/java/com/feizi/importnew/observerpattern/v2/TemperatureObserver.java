/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.importnew.observerpattern.v2;

/**
 * @Desc 人，温度检测观察者
 * @Author feizi
 * @Date 2016/10/9 16:13
 * @Package_name com.feizi.importnew.observerpattern.v2
 */
public class TemperatureObserver implements Observer{
    public void update(Subject observerable) {
        Water water = (Water) observerable;
        System.out.println("温度：" + water.getTemperature() + "，状态：" + water.getStatus());
        System.out.println("TemperatureObserver observing...");
    }
}
