package com.company.day8.demo;

public class Student {
    private int id;
    private String name;
    private String rollNo;
    private String university;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }



    public Student(String name, String rollNo, String university) {
        this.name = name;
        this.rollNo = rollNo;
        this.university = university;
    }
public Student(){

}
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", university='" + university + '\'' +
                '}';
    }
}