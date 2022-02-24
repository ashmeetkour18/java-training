package com.company.day3.collections;

import java.util.Arrays;
import java.util.List;

public class ListExample {
    private static int sumOfListElements(List<Integer> listOfIntegers) {
        int sum = 0;
        return listOfIntegers.stream().mapToInt(s -> s).sum();
    }

    private static int getIntegerFromList(List<Integer> listOfIntegers, int i) {
        if (listOfIntegers.size() - 1 < i) {
            throw new MyException("ArrayList size crossed");
        }
        ;

        return listOfIntegers.get(i);
    }

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 5, 6);
        try {
            getIntegerFromList(listOfIntegers, 10);
        } catch (MyException exception) {
            exception.printStackTrace();
        }

     /*   List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(  sumOfListElements(listOfIntegers));;

        */

    }


}
