package com.company.day8.demo;

public class Car {
    private Integer id;
    private Double speed;
    private String name;
    private Float horsePower;
    private Character maker;

    public Car(){}

    public Car(Double speed, String name, Float horsePower, Character maker) {
        this.speed = speed;
        this.name = name;
        this.horsePower = horsePower;
        this.maker = maker;
    }

    public Car(Integer id, Double speed, String name, Float horsePower, Character maker) {
        this.id = id;
        this.speed = speed;
        this.name = name;
        this.horsePower = horsePower;
        this.maker = maker;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", speed=" + speed +
                ", name='" + name + '\'' +
                ", horsePower=" + horsePower +
                ", maker=" + maker +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Float horsePower) {
        this.horsePower = horsePower;
    }

    public Character getMaker() {
        return maker;
    }

    public void setMaker(Character maker) {
        this.maker = maker;
    }
}
