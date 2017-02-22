/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.importnew.observerpattern.v2;

/**
 * @Desc 水，被观察者
 * @Author feizi
 * @Date 2016/10/9 16:14
 * @Package_name com.feizi.importnew.observerpattern.v2
 */
public class Water extends Subject{
    private double temperature;
    private String status;

    public Water() {
        super();
        this.temperature = 0;
        this.status = "冷水";
    }

    public Water(Observer observer){
        this();
        observers.add(observer);
    }

    public double getTemperature() {
        return temperature;
    }

    public String getStatus() {
        return status;
    }

    public void change(double temperature){
        this.temperature = temperature;
        if(temperature < 40){
            status = "冷水";
        }else if(temperature >= 40 && temperature < 60){
            status = "温水";
        }else if(temperature >= 60 && temperature < 100){
            status = "热水";
        }else{
            status = "开水";
        }
        this.isChanaged = true;
        notifyObservers();
    }
}
