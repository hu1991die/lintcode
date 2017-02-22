/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.jvm;


import java.util.ArrayList;
import java.util.List;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/12/13 10:27
 * @Package_name com.feizi.jvm
 */
public class TestOutOfMemoryError {

    static class OOMObject{

    }

    public static void main(String[] args) {
        // 测试java堆
        TestOutOfMemoryError test = new TestOutOfMemoryError();
//        test.javaHeapSpace();
//        test.methodAreaFlow();
//        test.constantPoolFlow();
        test.memoryLeak();
    }

    /**
     * @Desc Java 堆溢出
     * @Author feizi
     * @Date 2016/12/14 16:36
     * @param 
     * @return 
     */
    public static void javaHeapSpace(){
        List<OOMObject> list = new ArrayList<TestOutOfMemoryError.OOMObject>();
        while (true){
            list.add(new OOMObject());
        }
    }

    /**
     * @Desc 虚拟机栈溢出
     * @Author feizi
     * @Date 2016/12/14 16:37
     * @param 
     * @return 
     */
    public static int stackOverFolw(){
        return stackOverFolw();
    }

    /**
     * @Desc 方法区溢出
     * @Author feizi
     * @Date 2016/12/14 16:46
     * @param
     * @return
     */
    public static void methodAreaFlow(){
        while (true){
            TestOutOfMemoryError test = new TestOutOfMemoryError();
            test.print(test.toString());
        }
    }

    /**
     * @Desc 运行时常量池溢出
     * @Author feizi
     * @Date 2016/12/14 17:00
     * @param
     * @return
     */
    public static void constantPoolFlow(){
        List<String> list = new ArrayList<String>();
        int i = 0;
        while (true){
            list.add(String.valueOf(i++).intern());
        }
    }

    /**
     * @Desc 模拟内存泄漏
     * @Author feizi
     * @Date 2016/12/14 17:16
     * @param 
     * @return 
     */
    public static void memoryLeak(){
        List<int[]> list = new ArrayList<int[]>();

        Runtime run = Runtime.getRuntime();

        int i = 1;
        while (true){
            int[] arr = new int[1024];
            list.add(arr);

            if(i++ % 1000 == 0){
                System.out.print("最大堆内存=" + run.maxMemory() / 1024 / 1024 + "M, ");
                System.out.print("已分配内存=" + run.totalMemory() /1024 / 1024 + "M, ");
                System.out.print("剩余空间内存=" + run.freeMemory() / 1024 / 1024 + "M, ");
                System.out.println("最大可用内存=" + ( run.maxMemory() - run.totalMemory() + run.freeMemory() ) / 1024 / 1024 + "M");
                sleep(1000);
            }
        }
    }

    /**
     * @Desc 休眠
     * @Author feizi
     * @Date 2016/12/14 17:13
     * @param
     * @return
     */
    public static void sleep(long time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void print(String str){
        System.out.println(str + "================" + str);
    }
}
