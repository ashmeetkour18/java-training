package com.company.day10.passanger;

import jakarta.persistence.*;

/*
 tickets(id,number,passenger_id)
*/
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Long ticketNumber;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Passenger passenger;
    public Ticket() {
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", ticketNumber=" + ticketNumber +
                ", passenger=" + passenger +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(Long ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Ticket(Integer id, Long ticketNumber, Passenger passenger) {
        this.id = id;
        this.ticketNumber = ticketNumber;
        this.passenger = passenger;
    }

}
