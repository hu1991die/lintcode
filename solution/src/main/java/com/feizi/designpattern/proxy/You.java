/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.designpattern.proxy;

/**
 * @Desc 你
 * @Author feizi
 * @Date 2016/10/11 10:27
 * @Package_name com.feizi.designpattern.proxy
 */
public class You implements GiveGift{

    //美女
    BeautifulGirl mm;

    public You(BeautifulGirl mm) {
        this.mm = mm;
    }

    /**
     * @Desc 送花
     * @Author feizi
     * @Date 2016/10/11 10:26
     * @return
     */
    public void giveFlowers() {
        System.out.println(mm.getName() + ",送你一束花...");
    }

    /**
     * @Desc 送巧克力
     * @Author feizi
     * @Date 2016/10/11 10:27
     * @return
     */
    public void giveChocolate() {
        System.out.println(mm.getName() + ",送你一盒巧克力...");
    }

    /**
     * @Desc 送书
     * @Author feizi
     * @Date 2016/10/11 10:27
     * @return
     */
    public void giveBook() {
        System.out.println(mm.getName() + ",送你一本书...");
    }
}
