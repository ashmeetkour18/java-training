package com.company.day2.association;


import java.util.Arrays;

public class driverProgram {
    public static void main(String[] args) {
        Student student1 = new Student("name-1");
        Student student2 = new Student("name-2");
        Student student3 = new Student("name-3");
        Student student4 = new Student("name-4");
        Student student5 = new Student("name-5");
        Student student6 = new Student("name-6");
        Course course = new Course();

        for (Student student : Arrays.asList(student1, student2, student3, student4, student5, student6)) {
            course.addStudent(student);
        }
        System.out.println("Students enrolled in course-1");
        course.print();

        Course course2 = new Course();
        course2.addStudent(student1);
        Student student7 = new Student("name-7");
        course2.addStudent(student7);

        System.out.println("Students enrolled in cours-2");
        course2.print();
        // course.addStudent


    }
}