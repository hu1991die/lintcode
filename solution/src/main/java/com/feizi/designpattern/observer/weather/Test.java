/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.designpattern.observer.weather;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/10/8 13:09
 * @Package_name com.feizi.designpattern.observer.weather
 */
public class Test {
    public static void main(String[] args) {
        //1、创建目标
        ConcreteWeatherSubject weatherSubject = new ConcreteWeatherSubject();

        //2、创建观察者
        ConcreteObserver girlObserver = new ConcreteObserver();

        //3、注册观察者

        //4、目标发布天气
    }
}
