package com.company.day12.ShareTrading;

import com.company.day12.ShareTrading.HeapSort;
import com.company.day12.dependency.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;

@SpringBootApplication
public class SpringMain {
    public static void main(String[] args) {
        // Application context contains only one object provided by us
        // QuickSort, it contains MergeSort object also
        // fetch MergeSort object from the ApplicationContext
        // and call sort funtion on it.
        ApplicationContext context = SpringApplication.run(MyConfig.class, args);
        Sorting quickSort = context.getBean(QuickSort.class);
        System.out.println("Hashcode of quicksort = " + quickSort.hashCode());
        quickSort = context.getBean(QuickSort.class);
        System.out.println("Hashcode of quicksort2 = " + quickSort.hashCode());
        quickSort.sort(new ArrayList<>());
        Sorting mergeSort = context.getBean(MergeSort.class);
        mergeSort.sort(new ArrayList<>());
        Sorting bubbleSort = context.getBean(BubbleSort.class);
        bubbleSort.sort(new ArrayList<>());
         Users users = context.getBean(Users.class);
        users.display();
        System.out.println("Starter spring project");
        // How we can put beans into IOC Container or Application Context

    }
}