package com.company.day10.passanger;

import jakarta.persistence.*;

import java.util.Set;

/*
    design tables
    airport(id, name)
    passengers(id,name,airport_id)
    tickets(id,number,passenger_id)

    So the Airport class will contain a @OneToMany(mappedBy="airport") on Set<Passenger>
    Passenger class will contain a ManyToOne on airport and OneToMany on tickets
    and ticket class will contain manytoOne on passenger


    there could be many passengers in the passenger table.
    And each will be mapped to an airport having a particular ticket

    We will have three classes here Airport, Passenger, Ticket
    Take a break for 10-15 mins if you need to
    *
    */
@Entity
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Airport airport;
    @OneToMany(mappedBy = "passenger" ,cascade = CascadeType.PERSIST)
    private Set<Ticket> ticket;

    public Passenger() {
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", airport=" + airport +
                ", tickets=" + ticket +
                '}';
    }

    public Passenger(Integer id, String name, Airport airport, Set<Ticket> tickets) {
        this.id = id;
        this.name = name;
        this.airport = airport;
        this.ticket = tickets;
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

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    public Set<Ticket> getTicket() {
        return ticket;
    }

    public void setTicket(Set<Ticket> ticket) {
        this.ticket = ticket;
    }
}
