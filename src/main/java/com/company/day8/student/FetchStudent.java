package com.company.day8.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

public class FetchStudent {
    public static void main(String[] args) {
       // Student student  = new Student("student -1" , Arrays.asList(22,87,89));
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Student.class);
        configuration.addResource("Student_1.hbm.xml");

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        List<Student> from_student_1_table = session.createQuery("from Student", Student.class).getResultList();
        System.out.println(from_student_1_table);
    }
}
