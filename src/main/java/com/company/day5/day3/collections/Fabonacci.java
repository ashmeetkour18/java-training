  package com.company.day5.day3.collections;

public class Fabonacci {
    static int n1 = 0, n2 = 1, n3;

    static void fibonacciOfRecursive(int nth) {

        if (nth > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            fibonacciOfRecursive(nth - 1);
        }
    }

    private static void fabonacciOfIterative(int nth) {
        int n1 = 0, n2 = 1, n3;

        System.out.print(+n2 + " ");
        for (int i = 0; i < nth; i++) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }

    private static int sumoFDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }

    public static int sumoFDigitsRecussion(int num) {
        if (num != 0) {
            return num % 10 + sumoFDigitsRecussion(num / 10);
        }
        return 0;
    }

    public static void main(String[] args) {
   /*     System.out.println("--------------iterative-------------------------");
        fabonacciOfIterative(10000);
        System.out.println("-----------recurcive----------------------------");
        fibonacciOfRecursive(600);
   */
        System.out.println(sumoFDigits(876));
        System.out.println(sumoFDigitsRecussion(876));
    }


}
















