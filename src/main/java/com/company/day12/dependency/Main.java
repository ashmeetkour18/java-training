package com.company.day12.dependency;

/*
Dependency Injection
HTTP GET, POST, PUT methods
Postman <-- This is used to make HTTP GET, POST, PUT method calls
 */
public class Main {
    public static void main(String[] args) {
        Users user = new Users();
        user.addSortingMethod(new QuickSort());
        user.sort();
    }
}