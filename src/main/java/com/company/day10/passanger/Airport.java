package com.company.day10.passanger;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "airport_table")
public class Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @OneToMany(mappedBy = "airport", cascade = CascadeType.ALL)
    private Set<Passenger> passenger;

    public Airport(Integer id, String name, Set<Passenger> passengers) {
        this.id = id;
        this.name = name;
        this.passenger = passengers;
    }

    public Airport() {
    }

    @Override
    public String toString() {
        return "Airport{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passengers=" + passenger +
                '}';
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

    public Set<Passenger> getPassenger() {
        return passenger;
    }

    public void setPassenger(Set<Passenger> passenger) {
        this.passenger = passenger;
    }

}
