package com.company.day3.collections;

public class Student {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
/*
    @Override
    public int compareTo(Object o) {
        Student student  = (Student) o;
        return this.name.compareTo(student.getName()); *//*Integer.compare(rollNumber,student.getRollNumber());*//*
    }*/
    // write a compareTo function which sorts the student array by name instead of roll number

}