package com.company.day2;

public class BMW implements Car {
    String color;
    int cost;
    int average;
    String model;

    public BMW(String color, int cost, int average, String model) {
        this.color = color;
        this.cost = cost;
        this.average = average;
        this.model = model;
    }

    @Override
    public double getTotalMaintainaceCost() {
        return cost * average;
    }
}
