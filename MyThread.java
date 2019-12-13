package com.company;

public class MyThread implements Runnable {

    @Override
    public void run() {
        Singleton singleton = Singleton.getObject(Thread.currentThread().getName());
        System.out.println(singleton.getValue());
    }
}


