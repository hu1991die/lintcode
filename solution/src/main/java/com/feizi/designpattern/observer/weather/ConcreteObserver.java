/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.designpattern.observer.weather;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/10/8 11:26
 * @Package_name com.feizi.designpattern.observer.weather
 */
public class ConcreteObserver implements Observer{

    //观察者的名字，是谁收到了这个讯息
    private String observerName;

    //天气内容的情况，这个消息从目标出获取
    private String weatherContent;

    //提醒的内容：黄明的女朋友提醒约会，老妈则提醒购物
    private String remindThing;

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
    }

    public String getRemindThing() {
        return remindThing;
    }

    public void setRemindThing(String remindThing) {
        this.remindThing = remindThing;
    }

    public void update(WeatherSubject weatherSubject) {
        weatherContent = ((ConcreteWeatherSubject)weatherSubject).getWeatherContent();
        System.out.println( observerName + "收到了" + weatherContent + ", " + remindThing);
    }
}
