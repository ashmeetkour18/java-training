package com.company.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    Dao dao;
    @Autowired
    Dao1 dao1;

    @GetMapping("/get")
    public String get() {
        dao.first("f");
        dao1.second("s");
        return "....?";
    }
}
