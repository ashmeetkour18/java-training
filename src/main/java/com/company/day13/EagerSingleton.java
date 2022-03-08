package com.company.day13;

public class EagerSingleton {
    private static EagerSingleton singleton = new EagerSingleton();

    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        return singleton;
    }
}
/*
There are in general two types of Object Initializations /creations
(i) Lazy Instantiation (Lazy Loading/ Lazy Initialization)
(ii) Eager Instantiation (Eager Loading / Eager Initialization)
 */