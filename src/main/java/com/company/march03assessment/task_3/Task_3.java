package com.company.march03assessment.task_3;

import java.util.Map;
import java.util.TreeMap;

public class Task_3 {
    static Integer[] mergeArrays(int[] first, int[]
            second) {
        Map<Integer, Boolean> map = new TreeMap<>();
        for (int i = 0; i < first.length; i++) {
            map.put(first[i], true);
        }
        for (int i = 0; i < second.length; i++) {
            map.put(second[i], true);
        }

        return map.keySet().toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        int[] first = {1, 3, 8, 9}, second = {8, 12, 14, 16};
        Integer[] integers = mergeArrays(first, second);
        for (Integer integer : integers) {
            System.out.println(integer);
        }
        System.out.println();
    }
}
