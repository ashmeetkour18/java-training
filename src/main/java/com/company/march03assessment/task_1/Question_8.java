package com.company.march03assessment.task_1;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question_8 {

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String s_1 = Stream.of(s1.split("")).sorted().collect(Collectors.joining());
        String s_2 = Stream.of(s2.split("")).sorted().collect(Collectors.joining());
        System.out.println(s_1 + " - " + s_2);
        return s_1.equals(s_2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("ABDe", "DBAC"));
    }
}