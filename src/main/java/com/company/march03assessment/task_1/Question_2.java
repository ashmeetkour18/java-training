package com.company.march03assessment.task_1;

import java.util.Arrays;
import java.util.List;

public class Question_2 {

    public static boolean isListContainSum(List<Integer> list, int expectedSum) {
        return list.stream().anyMatch(element -> list.contains(expectedSum - element)
                && list.indexOf(element) != list.lastIndexOf(expectedSum - element));


    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 6, 4, 6);
        System.out.println(isListContainSum(list, 12));
    }
}
