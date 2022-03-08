package com.company.day12.ShareTrading;

import com.company.day12.dependency.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

import static org.springframework.boot.BootstrapRegistry.Scope.SINGLETON;

@Configuration
//@ImportResource("bean-config.xml")
public class MyConfig {
    /*
    Examples : Verify for each if the multiple objects fetched from
    the IOC Container are same or different
    (i) When you don't provide any Scope on the Bean
    (ii) When you provide @Scope("singleton")
    (iii) When you provide @Scope("prototype")
     */
    @Bean
    @Scope("singleton")
    //  @Scope("prototype")
    public Sorting getQuickSort() {
        System.out.println("Inside @Bean @Scope method");
        return new QuickSort();
    }

    @Bean
    public Sorting getMergeSort() {
        return new MergeSort();
    }

    @Bean
    public Sorting getBubbleSort() {
        return new BubbleSort();
    }

    @Bean
    public Users getUsers() {
        // For the users object it will display the hashcode
        // of getQuickSort() object
        return new Users(getQuickSort());
    }
    /*
    @Bean methods -> There objects that these functions returned are cached or stored.
    And if the method is called again. It checks if an object is already available or
    not. If its avaiable it doesnt createa a new object.
     */
}
/*
These beans go into Application context and then we can fetch them
from Application Context
 */
