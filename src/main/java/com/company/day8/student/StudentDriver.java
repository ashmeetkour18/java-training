package com.company.day8.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentDriver {
    public static void main(String[] args) {
        Student student = new Student("student -2", Arrays.asList(22, 87, 89));
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Student.class);
        configuration.addResource("Student_1.hbm.xml");

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        System.out.println(student);
        session.persist(student);
    /* session.persist(Student3);
   session.persist(Student4);
    session.persist(Student5);*/
        transaction.commit();
        session.close();
    }
}
