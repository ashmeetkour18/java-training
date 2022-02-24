package com.company.day5;

public class SerialNumber {

    public static void main(String[] args) {
        Print_1 print = new Print_1(100_00);
        Thread thread=new Thread(print);
        Thread thread1=new Thread(print);
        thread.start();
        thread1.start();
    }
}
class Print_1 implements Runnable {
    public static volatile int count=0;
    public static volatile int end;
    private Integer integerToPrint;

    public Print_1(Integer _end) {
        end=_end;
    }

    @Override
    public void run() {
        while(end>0){
            synchronized (this) {
                System.out.println(count + " ");
                count++;
                end--;
            }
        }
    }
}