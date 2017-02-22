/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.designpattern.proxy;

/**
 * @Desc 美女闺蜜
 * @Author feizi
 * @Date 2016/10/11 10:30
 * @Package_name com.feizi.designpattern.proxy
 */
public class HerChum implements GiveGift{

    You you;

    public HerChum(BeautifulGirl mm) {
        this.you = new You(mm);
    }

    /**
     * @Desc 送花
     * @Author feizi
     * @Date 2016/10/11 10:26
     * @return
     */
    public void giveFlowers() {
        you.giveFlowers();
    }

    /**
     * @Desc 送巧克力
     * @Author feizi
     * @Date 2016/10/11 10:27
     * @return
     */
    public void giveChocolate() {
        you.giveChocolate();
    }

    /**
     * @Desc 送书
     * @Author feizi
     * @Date 2016/10/11 10:27
     * @return
     */
    public void giveBook() {
        you.giveBook();
    }
}
