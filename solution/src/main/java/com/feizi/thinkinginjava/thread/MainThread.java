/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.thinkinginjava.thread;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/9/27 9:16
 * @Package_name com.feizi.thinkinginjava.thread
 */
public class MainThread {
    public static void main(String[] args) {
        /*LiftOff launch = new LiftOff();
        launch.run();*/

        for (int i = 0; i < 5; i++){
            Thread thread = new Thread(new LiftOff());
            thread.start();
        }
    }
}
