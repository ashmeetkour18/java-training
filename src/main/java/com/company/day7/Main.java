package com.company.day7;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/*
Hibernate - ORM
ORM -> Object relational mapping
Person object, I want to store this person object in a table.
Person is a class , save this object
It will automatically insert the person object  into a table.
We define a person class and create an object of it
hibernate will map this object to the mysql table.
ORM
// persistence -> storage
JPA -> Java persistence API
       (Jakarta persistence API) <-- 2021

JPA is part o java library and, it provides a set of interface
Hibernate provides implementation of those interfaces.
JPA providers
Hibernate is one example of JPA provider.
Another example of JPA provider is EclipseLink
we need to provide it details


        <class name="Car" table="Car">
        <id name="id" type="int">
        <generator class="increment"></generator>
        </id>
        Try using this generator element inside the id class
        And then don't use the generator
        Experiment with both ways
        When you create the object of your class called Car car = new Car()
        car.setProperties….
        Don't set the ID and see what happens,
        the increment will automatically provide the ID
        So you won't need to keep track of specifying the ID.

        Few Questions:
        1) Suppose I manually insert an entry into the Table with Id=100
             what ID will be inserted by hibernate when we
              (I) Don't specify any generator
              (ii) we specify the increment generator
              (iii) We specify the sequence generator
        Note: When we insert the entry into the table with hibernate in the above examples we are not passing the ID in the java code
        But are using the empty constructor to create the object and then assigning the properties using setters and getters

 */
public class Main {

    public static void main(String[] args) {
        // create person table
        // insert into person values(1,"name-1","address-1")
        //Person person = new Person(3, "name-3", "address-3");
        // To convert it to a SQL statement
        // hibernate needs to know which table are we inserting data in.
        // and what are the data types.
        // mapping the object fields to the table columns
        // class is mapped to a table
        Car car = new Car( "car", 600, 8000000);

        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Person.class);
        configuration.addResource("Car.hbm.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(car);
        transaction.commit();
        session.close();
        /*
        Configurations are done using
        (i) XML
        (ii) Annotations
         */

    }
}