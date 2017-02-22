/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.thinkinginjava.thread;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/9/27 13:26
 * @Package_name com.feizi.thinkinginjava.thread
 */
public class CallableDemo {
    //Callable接口是一种具有类型参数的泛型，它的类型参数表示的是从方法call()
    // （而不是run()）中返回的值，并且必须使用ExectorService.submit()方法调用它
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results = new ArrayList<Future<String>>();
        for (int i = 0; i < 10; i++) {
            results.add(exec.submit(new TaskWithResult(i)));
        }

        for (Future<String> fs : results){
            try {
                System.out.println(fs.get());
            } catch (InterruptedException e) {
                System.out.println(e);
                return;
            } catch (ExecutionException e) {
                System.out.println(e);
                return;
            }finally {
                exec.shutdown();
            }
        }
    }
}

class TaskWithResult implements Callable<String>{
    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }

    public String call(){
        if(id % 2 == 0){
            return "hahahahahahahah " + id;
        }else{
            return "result of TaskWithResult " + id;
        }
    }
}
