package com.company.day4;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        String s = "This is sample is a This" ;
        System.out.println(frequencyOfWord(s));
    }

    private static Map<String, Integer> frequencyOfWord(String s) {
        Map<String, Integer> map = new HashMap<>();
        String[] s1 = s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            if (map.containsKey(s1[i])) map.put(s1[i], map.get(s1[i]) + 1);
            else map.put(s1[i], 1);
        }
        return map;
    }
}
