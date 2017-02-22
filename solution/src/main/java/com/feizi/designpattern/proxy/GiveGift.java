/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.designpattern.proxy;

/**
 * @Desc 送礼物接口
 * @Author feizi
 * @Date 2016/10/11 10:26
 * @Package_name com.feizi.designpattern.proxy
 */
public interface GiveGift {
    /**
     * @Desc 送花
     * @Author feizi
     * @Date 2016/10/11 10:26
     * @param
     * @return
     */
    void giveFlowers();

    /**
     * @Desc 送巧克力
     * @Author feizi
     * @Date 2016/10/11 10:27
     * @param
     * @return
     */
    void giveChocolate();

    /**
     * @Desc 送书
     * @Author feizi
     * @Date 2016/10/11 10:27
     * @param
     * @return
     */
    void giveBook();
}