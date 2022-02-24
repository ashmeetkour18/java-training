package com.company.day8.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CarDriver {
    public static void main(String[] args) {
        Car car  = new Car(124.6,"car ",78.09f,'a');
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Car.class);
        configuration.addResource("Car_Day8.hbm.xml");

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(car);
    /* session.persist(Car3);
   session.persist(Car4);
    session.persist(Car5);*/
        transaction.commit();
        session.close();
    }
}
