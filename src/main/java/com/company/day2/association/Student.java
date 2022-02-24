package com.company.day2.association;

public class Student {
    private Course[] courses;
    private String name;

    Student(String _name) {
        name = _name;
    }

    private void addCourse(Course c) {

    }

    public String getName() {
        return name;
    }
}