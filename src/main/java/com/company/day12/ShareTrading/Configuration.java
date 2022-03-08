package com.company.day12.ShareTrading;

import com.company.day12.dependency.MergeSort;
import com.company.day12.dependency.QuickSort;
import com.company.day12.dependency.Sorting;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public Sorting getQuickSort() {
        return new QuickSort();
    }

    @Bean
    public Sorting getMergeSort() {
        return new MergeSort();
    }
}