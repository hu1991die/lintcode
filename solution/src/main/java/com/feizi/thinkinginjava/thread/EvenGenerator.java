/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.thinkinginjava.thread;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/9/29 15:55
 * @Package_name com.feizi.thinkinginjava.thread
 */
public class EvenGenerator extends IntGenerator{
    private int currentEvenValue = 0;

    @Override
    public int next() {
        ++currentEvenValue;//Danger point here!
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator());
    }
}
