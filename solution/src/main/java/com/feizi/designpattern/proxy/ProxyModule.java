/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.designpattern.proxy;

/**
 * @Desc 客户端
 * @Author feizi
 * @Date 2016/10/11 10:32
 * @Package_name com.feizi.designpattern.proxy
 */
public class ProxyModule {
    public static void main(String[] args) {
        BeautifulGirl mm = new BeautifulGirl("妹纸...");

        HerChum herChum = new HerChum(mm);

        herChum.giveBook();
        herChum.giveFlowers();
        herChum.giveChocolate();
    }
}
