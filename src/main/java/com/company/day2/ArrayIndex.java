package com.company.day2;

public class ArrayIndex {

    public static int arrayIndex(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] intArray =
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(arrayIndex(intArray, 11));
    }
}
