/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.designpattern.observer.weather;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/10/8 10:51
 * @Package_name com.feizi.designpattern.observer.weather
 */
public class ConcreteWeatherSubject extends WeatherSubject{
    //天气的内容信息
    private String weatherContent;

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
        this.notifyObservers();
    }
}
