package com.company.day4;

public class MultithreadingTask {
    public static void main(String[] args) throws InterruptedException {
        int[] array = new int[1000];
        for (int i = 0; i < 1000; i++) {
            array[i] = i;
        }
        int sumforCheck = 0;
        for (int i = 0; i < array.length; i++) {
            sumforCheck += array[i];
        }

        SumOfArray sumOfArray_1 = new SumOfArray(array, 1, 499);
        SumOfArray sumOfArray_2 = new SumOfArray(array, 500, 999);
        Thread thread1 = new Thread(sumOfArray_1);
        Thread thread2 = new Thread(sumOfArray_2);

        thread1.setName("thread_1");
        thread2.setName("thread_2");
        thread1.start();
        thread2.start();
        thread2.join();
        thread1.join();

        int sum = sumOfArray_1.sum + sumOfArray_2.sum;
        System.out.println(".....Sum.... " + sum + " = " + sumforCheck);


    }

}

class SumOfArray implements Runnable {
    int[] arr;
    int start;
    int end;
    int sum = 0;

    SumOfArray(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;

    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "   " + start + " " + end);
        for (int i = start; i <= end; i++) {
            sum = sum + arr[i];
        }
        System.out.println(Thread.currentThread().getName() + "   " + start + " " + end + " sum " + sum);
    }
}

/*
class CustomThread extends Thread {
    private static long sum;
    private static long sum2;
    private final int start;
    private final int end;

    public CustomThread(int _start, int _end) {

        start = _start;
        end = _end;

    }

    public static long getSum() {


        return sum + sum2;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            if (Thread.currentThread().getName() == "sum1") {
                sum = sum + i;
            } else sum2 = sum2 + i;
        }

    }
}*/
