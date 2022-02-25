package com.company.day9.person;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

/*

Q1
Use a custom generator and plug it into this Student class

Q2:
(i) create a Person class and map it to person_records table
 (ii) provide an autogeneration strategy for the Id column
 (iii) For the name column -> varchar(200) not null
 (iv) boolean isHired -> false
  columnDefinition="not null" // exact query or statment that would be used in mysql
  default

*/
@Entity
@Table(name = "person_records")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custom-person-generator")
    @GenericGenerator(strategy = "com.company.day8.demo.CustomIdGenerator", name = "custom-person-generator")
    private Integer id;
    @Column(name = "name", length = 200, nullable = false)
    private String name;
   //    @Column(columnDefinition = "boolean default false")
    private Boolean isHired=false;

    public Person() {
    }

    public Person(Integer id, String name, Boolean isHired) {
        this.id = id;
        this.name = name;
        this.isHired = isHired;
    }

    public Person(String name, Boolean isHired) {
        this.name = name;
        this.isHired = isHired;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name='" + name + '\'' + ", isHired=" + isHired + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getHired() {
        return isHired;
    }

    public void setHired(Boolean hired) {
        isHired = hired;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}





