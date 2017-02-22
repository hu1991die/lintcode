package com.feizi;

import java.util.Random;

/**
 * @Desc 排序算法练习
 * @Author feizi
 * @Date 2016/9/22 18:21
 * @param
 * @return
 */
public class App {

    private static int ARRAY_MAX_LENGTH = 5;
    /**
     * @Desc 简单选择排序
     * @Author feizi
     * @Date 2016/9/22 18:21
     * @param
     * @return
     */
    public static void sortIntegers(int[] A){
        //外层循环控制比较的趟数，内层循环控制冒起的泡数
        for (int i = 0; i < A.length - 1; i++){
            for (int j = i + 1; j < A.length; j++){
                if(A[i] > A[j]){
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
    }

    /**
     * @Desc 冒泡，相邻的两个进行比较
     * @Author feizi
     * @Date 2016/9/22 20:11
     * @param
     * @return
     */
    public static void bubbleSortIntegers(int[] A){
        for(int i = 0; i < A.length - 1; i++){
            for (int j = 0; j < A.length - 1 - i; j++){
                if(A[j] > A[j + 1]){
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
    }

    public static void insertSortIntegers(int[] A){
        for (int i = 0; i < A.length; i++){
            int temp = A[i];
            for (int j = i + 1; j < A.length; j++){
                if(A[j] > temp){
                    A[j] = A[j - 1];//将大于temp的值整体后移一个单位
                }
                A[j - 1] = temp;
            }
        }
    }

    public static void main( String[] args ) {
        int[] A = new int[ARRAY_MAX_LENGTH];

        /***
         * 初始化数组
         */
        /*int j = 0;
        while (ARRAY_MAX_LENGTH > 0){
            A[j++] = --ARRAY_MAX_LENGTH;
        }*/

        for(int i = 0, j = ARRAY_MAX_LENGTH - 1; i < ARRAY_MAX_LENGTH && j > 0; i++, j--){
            A[i] = j;
        }

        System.out.println("=============排序之前：");
        System.out.print("[");
        for (int i = 0; i < A.length; i++){
            System.out.print(A[i] + ",");
        }
        System.out.println("]");

        long startTime = System.currentTimeMillis();

        //冒泡排序
//        sortIntegers(A);//20000-384,10000-165,2500-7,2000-9,1500-6, 1000-4，199990000

//        bubbleSortIntegers(A);//20000-488,10000-203,2500-15,2000-9,1500-4，1000-4,比较4950次

        insertSortIntegers(A);

        long endTime = System.currentTimeMillis();
        System.out.println("=============排序耗时：" + (endTime - startTime));
        System.out.println("=============排序之后：");

        System.out.print("[");
        for (int i = 0; i < A.length; i++){
            System.out.print(A[i] + ",");
        }
        System.out.println("]");
    }
}
