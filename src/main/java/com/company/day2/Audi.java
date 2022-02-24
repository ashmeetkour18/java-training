package com.company.day2;

public class Audi implements Car {

    String color;
    int cost;
    int average;
    String model;

    public Audi(String color, int cost, int average, String model) throws Exception {
        if (!validate(color, cost, average, model)) throw new Exception("Exception");
        this.color = color;
        this.cost = cost;
        this.average = average;
        this.model = model;
    }

    private boolean validate(String color, int cost, int average, String model) {
        return true;
    }

    @Override
    public double getTotalMaintainaceCost() {
        return cost * average;
    }
}
