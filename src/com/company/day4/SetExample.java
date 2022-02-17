package com.company.day4;

import java.util.*;

public class SetExample {
    private static List<Integer> removeDuplicateFromList(List<Integer> list) {
        Set<Integer> set = new LinkedHashSet<>(list);
        return  new ArrayList<>(set);
    }
    public static void main(String[] args) {
       List<Integer> list = Arrays.asList(1,3,23,5,3,4,5,5,67,3,25,235,5,3,2,5);
        System.out.println(removeDuplicateFromList(list));;
    }


}
