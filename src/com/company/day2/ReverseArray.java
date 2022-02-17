package com.company.day2;

public class ReverseArray {

    static void reverse(int[] arr) {
        int n = arr.length;
        int temp;
        for (int index = 0; index < n / 2; index++) {
            temp = arr[index];
            arr[index] = arr[n - index - 1];
            arr[n - index - 1] = temp;
        }

        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(arr[k]);
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        reverse(arr);
    }
}
