package com.company.day2.inheritance;

public class Driver {
    public static void main(String[] args) {
/*
        Circle circle = new Circle();
        System.out.println(circle.getRadius());
        System.out.println(circle);
        Circle circle2 = new Circle(1,"red",true);
        System.out.println(circle.getColor());
*/

        Rectangle rectangle = new Rectangle(2, 5);
        System.out.println("length ->" + rectangle.getLength() + " width-> " + rectangle.getWidth() + " area -> " + rectangle.getArea());

    }
}