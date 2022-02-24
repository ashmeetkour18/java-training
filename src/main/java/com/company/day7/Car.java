package com.company.day7;

public class Car {
    private int id;
    private String name;
    private int speed;
    private int cost;



    public Car(int id, String name, int speed,int cost) {
        this.id = id;
        this.name = name;
        this.speed = speed;
        this.cost  = cost;
    }

    public Car( String name, int speed,int cost) {
        this.name = name;
        this.speed = speed;
        this.cost  = cost;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" + "id=" + id + ", name='" + name + '\'' + ", speed=" + speed + '}';
    }
}
