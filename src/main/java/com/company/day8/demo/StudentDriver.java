package com.company.day8.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDriver { public static void main(String[] args) {


    //Car car=new Car(3,"hyundai",100);

   /* Student student=new Student("name1","1001","university1");
    Student student2=new Student("name2","1003","university1");
    Student student3=new Student("name3","2001","university2");
   */
    Student student=new Student("name1","1001","university1");
    Student student2=new Student("name2","1003","university1");
    Student student3=new Student("name3","2001","university2");
    Student student4=new Student("name4","1004","university1");
    Student student5=new Student("name5","2002","university2");
    Configuration configuration = new Configuration();
    configuration.configure();
    configuration.addAnnotatedClass(Student.class);
    configuration.addResource("Student.hbm.xml");

    SessionFactory sessionFactory = configuration.buildSessionFactory();
    Session session=sessionFactory.openSession();
    Transaction transaction = session.beginTransaction();
  session.persist(student);
    session.persist(student2);
    /* session.persist(student3);
   session.persist(student4);
    session.persist(student5);*/
    transaction.commit();
    session.close();
        /*
        Configurations are done using
        (i) XML
        (ii) Annotations
         */

}
}