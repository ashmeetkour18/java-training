package com.company.day5;

import java.util.concurrent.TimeUnit;

public class SerialNum {
    static int num = 0;

    public static int number() {
        System.out.println(num);
        return num++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread_1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(number());
            }
        });
        Thread thread_2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(number());
            }
        });
        thread_1.start();
        TimeUnit.SECONDS.sleep(1);
        boolean start = true;
        thread_2.start();


    }
}