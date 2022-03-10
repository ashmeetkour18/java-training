package com.company.test.controller;

import org.springframework.stereotype.Component;

@Component
public class First implements  Dao{
    String s="first";
    @Override
    public void first(String s) {
        System.out.println(s+"  first ----");

    }

    @Override
    public void second(String s) {

    }
}
