/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/9/23 19:44
 * @Package_name com.feizi
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(aa());
    }

    private static int aa(){
        int id=0;
        try{
            id=10;
        }finally{
            id=15;
            System.out.println("我执行了");
            return id;
        }
    }

    static {
        System.out.println("我执行了");
    }
}
