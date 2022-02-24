package com.company.day8.student;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
    private Integer id;
    private String name;
    private List<Integer> marks;
    public Student() {
    }

    public Student(Integer id, String name, List<Integer> marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public Student(String name, List<Integer> marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", marks=" + marks + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarks() {
        return marks.stream()
                .map(mark -> mark.toString())
                .collect(Collectors.joining(","));
    }

    public void setMarks(String marks) {
        this.marks = Arrays.asList(marks.split(","))
                .stream().map(mark -> Integer.parseInt(mark))
                .collect(Collectors.toList());
    }
}
