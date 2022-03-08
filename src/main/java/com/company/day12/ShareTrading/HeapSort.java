package com.company.day12.ShareTrading;

import com.company.day12.dependency.Sorting;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

@ComponentScan
public class HeapSort implements Sorting {
    @Override
    public void sort(List<Integer> listToBeSorted) {
        System.out.println("Inside HeapSort");
    }
}