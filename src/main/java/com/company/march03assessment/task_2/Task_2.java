package com.company.march03assessment.task_2;

public class Task_2 {
    public static void main(String[] args) {
        int[] array = new int[]{11, 71, 32, 30, 53};
        sorting(array);
        System.out.print("After sorting -> ");
        for (int element : array)
            System.out.print(element + " ");
    }

    private static void sorting(int[] array) {
        int key = 0;
        int i;
        for (int j = 1; j < array.length; j++) {
            key = array[j];
            i = j - 1;
            while (i >= 0 && array[i] > key) {
                array[i + 1] = array[i];
                i = i - 1;
            }
            array[i + 1] = key;
        }

    }
}