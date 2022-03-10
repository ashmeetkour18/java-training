package com.company.day12.dependency;

import java.util.List;

public class QuickSort implements Sorting{
    @Override
    public void sort(List<Integer> listToBeSorted) {
        System.out.println("Inside Quicksort");
    }
}