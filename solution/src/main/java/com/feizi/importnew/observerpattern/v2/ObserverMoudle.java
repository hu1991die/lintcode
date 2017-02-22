/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.importnew.observerpattern.v2;

/**
 * @Desc 客户端
 * @Author feizi
 * @Date 2016/10/9 16:31
 * @Package_name com.feizi.importnew.observerpattern.v2
 */
public class ObserverMoudle {
    public static void main(String[] args) {
        TemperatureObserver temperatureObserver = new TemperatureObserver();
        BoildObserver boildObserver1 = new BoildObserver("关闭电源...");
        BoildObserver boildObserver2 = new BoildObserver("继续保温...");

        Water water = new Water(temperatureObserver);
        water.addObserver(boildObserver1);
        water.addObserver(boildObserver2);

        water.change(45);
        water.change(80);
        water.change(100);
    }
}
