package com.company;

public class Main {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread(),"Summer");
        Thread thread2 = new Thread(new MyThread(),"Winter");
        Thread thread3 = new Thread(new MyThread(),"Spring");
        Thread thread4 = new Thread(new MyThread(),"Fall");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
