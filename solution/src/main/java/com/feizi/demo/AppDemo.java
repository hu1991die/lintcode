/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.demo;

import java.util.*;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/10/11 9:23
 * @Package_name com.feizi.demo
 */
public class AppDemo {
    public static void main(String[] args) {
        AppDemo appDemo = new AppDemo();

        appDemo.testArrayList();

        System.out.println(10>>1);
    }

    public void testArrayList(){
        List<String> list = new ArrayList<String>();
        List<String> list1 = new LinkedList<String>();
        Vector<String> vector = new Vector<String>();
        list.add("语文：99");
        list.add("数学：98");
        list.add("英语：100");
        list.add("英语1：100");
        list.add("英语：100");
        list.add("英语：100");
        list.add("英语：100");
        list.add("英语：100");
        list.add("英语：100");
        list.add("英语：100");
        list.add("英语：100");

        String s = list.set(4, "阿西八：100");
        System.out.println("旧值：" + s);
        list.remove(0);

        for (String str : list) {
            System.out.println(str);
        }
    }

    public void test(){
        Map<String, String> map = new HashMap<String, String>();
        System.out.println(16>>>20);

        List<String> list = new ArrayList<String>();

        Map<String, String> table = new Hashtable<String,String>();

        TreeMap<String, String> treeMap = new TreeMap<String, String>();

        StringBuffer sb = new StringBuffer();

        StringBuilder sbl = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new Mythread());
            t.start();
        }
    }
}

class Mythread implements Runnable{

    private Map<String, Object> map = new HashMap<String, Object>();

    public void run() {
        for (int i = 0; i < 100; i++) {
            map.put(String.valueOf(i), i);
        }

        Set<Map.Entry<String, Object>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Object>> itera = entrySet.iterator();
        while (itera.hasNext()){
            Map.Entry<String, Object> entry = itera.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
