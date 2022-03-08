package com.company.day10.passanger;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AirPortDriver {
    public static void main(String[] args) {
        // Session session = Utility.getSession();
//        insert();
       // insertInInitial();
   remove();
    }

    public static void remove() {
        Session session = Utility.getSession();
        Transaction transaction = session.beginTransaction();
        Airport airport = session.get(Airport.class, 1);
        session.remove(airport);
        transaction.commit();
    }

    private static void insertInInitial() {
        Session session = Utility.getSession();
        Transaction transaction = session.beginTransaction();
        Airport airport = session.get(Airport.class, 1);
        Passenger passenger = new Passenger();
        passenger.setAirport(airport);
        passenger.setName("passanger-2");
        Ticket ticket = new Ticket();
        ticket.setPassenger(passenger);
        ticket.setTicketNumber(4566l);
        session.persist(ticket);
        transaction.commit();
        session.close();

    }


    private static void insert() {
        Session session = Utility.getSession();
        Transaction transaction = session.beginTransaction();
        Airport airport = new Airport();
        airport.setName("air port -1");
        Passenger passenger = new Passenger();
        passenger.setName("passanger-1");
        passenger.setAirport(airport);
        Ticket ticket = new Ticket();
        ticket.setTicketNumber(1234l);
        ticket.setPassenger(passenger);
        session.persist(ticket);
        transaction.commit();
        session.close();

    }

}
