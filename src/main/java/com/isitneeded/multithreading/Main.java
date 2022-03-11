package com.isitneeded.multithreading;

public class Main {
    public static void main(String[] args) {
        //Single Task Single thread
        Thread1 thread1 = new Thread1();
        thread1.start();

        //Single Task multiple thread
        Thread1 thread11 = new Thread1();
        thread11.start();

        //Multiple task multiple thread
        Thread2 thread2 = new Thread2();
        thread2.start();

        Thread3 thread3 = new Thread3();
        thread3.start();

    }
}
