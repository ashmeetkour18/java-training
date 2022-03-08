package com.company.march03assessment.task_1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
In  this case fibonacciOfIterative is faster and better way to find the fibonacci series
because in fibonacciOfRecursive it needed to maintain stack  and their may be chance
stackoverflow .
*/
public class Question_3 {
    static int n1 = 0, n2 = 1, n3;

    private static void fibonacciOfStream(int i) {

        System.out.println("Fibonacci " +
                Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                        .limit(i)
                        .map(p -> p[0])
                        .map(String::valueOf)
                        .collect(Collectors.joining(",")));
    }

    public static void main(String[] args) {
        System.out.println("--------------iterative-------------------------");
        fibonacciOfStream(10);

    }

}
