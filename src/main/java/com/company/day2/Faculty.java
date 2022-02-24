package com.company.day2;

public class Faculty {
    private String facultyName;
    private String facultyDesignation;
    private String facultyDepartment;
    private String[] subjects;
    private int facultyAge;
    private int facutySalary;

    public Faculty(String facultyName, String facultyDesignation, String facultyDepartment, String[] subjects, int facultyAge, int facutySalary) {
        this.facultyName = facultyName;
        this.facultyDesignation = facultyDesignation;
        this.facultyDepartment = facultyDepartment;
        this.subjects = subjects;
        this.facultyAge = facultyAge;
        this.facutySalary = facutySalary;
    }
}
