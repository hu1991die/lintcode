/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.thread.demo;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/11/10 17:56
 * @Package_name com.feizi.thread.demo
 */
public class DisplayMessage implements Runnable {
    private String message;

    public DisplayMessage(String message) {
        this.message = message;
    }

    public void run() {
        while (true){
            System.out.println(message);
        }
    }
}
