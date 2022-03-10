package com.company.test.controller;

import org.springframework.stereotype.Component;

@Component
public class Second implements Dao1{

String s2 ="dev";
    @Override
    public void second(String s) {
        System.out.println(s+"  second ----");
    }
}
