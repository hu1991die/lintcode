/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.thread.demo;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/11/10 17:57
 * @Package_name com.feizi.thread.demo
 */
public class GuessANumber extends Thread {
    private int number;

    public GuessANumber(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int counter = 0;
        int guess = 0;

        do {
            guess = (int) (Math.random() * 100 + 1);
            System.out.println(this.getName() + " guesses " + guess);
            counter++;
        }while (guess != number);
        System.out.println("** Correct!" + this.getName() + " in " + counter + "guesses.**");
    }
}
