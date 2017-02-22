/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.importnew.observerpattern.v1;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/10/9 15:54
 * @Package_name com.feizi.importnew.observerpattern
 */
public class ObserverModule {
    public static void main(String[] args) {
        Person person = new Person();
        Water water = new Water();
        water.addObserver(person);
        water.setBoiled();
    }
}

/**
 * @Desc 人，观察者
 * @Author feizi
 * @Date 2016/10/9 15:59
 * @param
 * @return
 */
class Person{
    public void update(String data){
        System.out.println(data + "关电源...");
    }
}

/**
 * @Desc 水，目标对象（被观察者）
 * @Author feizi
 * @Date 2016/10/9 15:59
 * @param
 * @return
 */
class Water{
    private Person person;
    private boolean isBoiled;

    public Water() {
        isBoiled = false;
    }

    public void setBoiled(){
        isBoiled = true;
        notifyObsderver();
    }

    public void addObserver(Person person){
        this.person = person;
    }

    public void removeObserver(){
        if(person != null){
            person = null;
        }
    }

    public void notifyObsderver(){
        if(isBoiled && person != null){
            person.update("水开了，");
            isBoiled = false;
        }
    }
}
