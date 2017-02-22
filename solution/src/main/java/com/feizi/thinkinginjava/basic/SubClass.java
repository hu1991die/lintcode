/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.thinkinginjava.basic;

import java.util.*;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/9/30 9:39
 * @Package_name com.feizi.thinkinginjava.basic
 */
public class SubClass extends Parent{
    //静态变量
    public static String s_staticField = "子类-静态变量";

    //普通变量
    public String s_Field = "子类-普通变量";

    //静态初始化块
    static{
        System.out.println(s_staticField);
        System.out.println("子类-静态初始化块");
    }

    //初始化块
    {
        System.out.println(s_Field);
        System.out.println("子类-初始化块");
    }

    //构造器
    public SubClass() {
        System.out.println("子类-构造器");
    }

    public static void main(String[] args) {
        System.out.println("=====================in main=================");
        new SubClass();
        System.out.println("=========================second subCLass=====");
        new SubClass();
        Hashtable hashtable;
        HashMap hashMap;
        ArrayList arrayList;
        LinkedList linkedList;
        Vector vector;
    }
}

class Parent{
    //静态变量
    public static String p_StatucField = "父类--静态变量";

    //普通变量
    public String p_Field = "父类--普通变量";

    //静态初始化块
    static{
        System.out.println(p_StatucField);
        System.out.println("父类--静态初始化块");
    }

    //初始化块
    {
        System.out.println(p_Field);
        System.out.println("父类--初始化块");
    }

    //构造器
    public Parent() {
        System.out.println("父类--构造器");
    }
}