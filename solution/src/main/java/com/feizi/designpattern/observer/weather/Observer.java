/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.designpattern.observer.weather;

/**
 * @Desc 观察者接口
 * @Author feizi
 * @Date 2016/10/8 10:44
 * @Package_name com.feizi.designpattern.observer.weather
 */
public interface Observer {
    //观察者更新状态
   void update(WeatherSubject weatherSubject);
}
