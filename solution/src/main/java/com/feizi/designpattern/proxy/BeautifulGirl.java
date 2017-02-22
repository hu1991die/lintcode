/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.designpattern.proxy;

/**
 * @Desc 美女类
 * @Author feizi
 * @Date 2016/10/11 10:23
 * @Package_name com.feizi.designpattern.proxy
 */
public class BeautifulGirl {
    String name;

    public BeautifulGirl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
