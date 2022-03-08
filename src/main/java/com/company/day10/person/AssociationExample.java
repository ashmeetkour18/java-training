package com.company.day10.person;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class AssociationExample {
    public static void main(String[] args) {

        Session session = Utility.getSession();
        Transaction transaction = session.beginTransaction();
        Person person = session.get(Person.class, 3);
        session.remove(person);
        transaction.commit();
        session.close();       /* insertInitial();
         */        // insertNewPhoneNumber();
        /*  Session session = Utility.getSession();
        Transaction transaction = session.beginTransaction();
        Person person = new Person();
        person.setName("name-2");
        session.persist(person);
        transaction.commit();
        session.close();*/
    }


    private static void deletePerson() {
        Session session = Utility.getSession();
        Transaction transaction = session.beginTransaction();
        Person person = new Person();
        person.setId(1);
        //      PhoneNumber phoneNumber  = new PhoneNumber();
        //    phoneNumber.setId(3);
        // session.remove(phoneNumber);
        session.remove(person);
        transaction.commit();
        session.close();
    }


    private static void insertNewPhoneNumber() {
        Session session = Utility.getSession();
        Transaction transaction = session.beginTransaction();
        Person person = session.get(Person.class, 1);
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setNumber("999999");
        phoneNumber.setProvider("jio");
        phoneNumber.setPerson(person);

        session.persist(phoneNumber);
        transaction.commit();
        session.close();
    }

    private static void insertInitial() {
        Session session = Utility.getSession();
        Transaction transaction = session.beginTransaction();
        PhoneNumber phoneNumber = new PhoneNumber();
        Person person = new Person();
        person.setName("name-1");
        phoneNumber.setNumber("1234");
        phoneNumber.setProvider("airtel");
        phoneNumber.setPerson(person);

        session.persist(phoneNumber);
        transaction.commit();
        session.close();
    }
}