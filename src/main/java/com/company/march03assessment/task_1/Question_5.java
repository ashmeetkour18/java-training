package com.company.march03assessment.task_1;

import java.util.*;
import java.util.stream.Collectors;

public class Question_5 {
    private static List<Integer> maxKfromList(List<Integer> list, int k) {
        return list.stream().sorted((o1, o2) -> o2 - o1).limit(k).collect(Collectors.toList());

    }

    public static void main(String[] args) {
        System.out.println(maxKfromList(Arrays.asList(1, 4, 5, 6, 7), 2));
    }
}