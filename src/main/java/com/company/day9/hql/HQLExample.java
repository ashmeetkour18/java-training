package com.company.day9.hql;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class HQLExample {
    public static void main(String[] args) {
        sumOfAll();
        maksGreater(40);
        //    insertRecords();
        //aggregateFunctions();

    }

    private static void insertRecords() {
        Session session = Utility.getSession();
        String[] names = new String[]{"student-1", "student-2", "student-3", "student-4"};
        Transaction transaction = session.beginTransaction();
        for (int i = 0; i < 100; i++) {
            Student student = new Student();
            student.setName(names[(int) (Math.random() * 4)]);
            student.setMarks((int) (Math.random() * 100));
            session.persist(student);
        }
        transaction.commit();
        session.close();
    }

    private static void fetchRecords() {
        Session session = Utility.getSession();
        // you change the table name
        // mysql server, postgres, MS SQL, Oracle Database
        // the query is smaller
        List<Student> studentList = session.createQuery("from Student", Student.class).getResultList();
        System.out.println(studentList);
    }

    private static void fetchRecords2() {
        Session session = Utility.getSession();
        // you change the table name
        // mysql server, postgres, MS SQL, Oracle Database
        // the query is smaller
        Student student = session.get(Student.class, 1);
        System.out.println(student);
    }

    private static void fetchRecords3() {
        Session session = Utility.getSession();
        // you change the table name
        // mysql server, postgres, MS SQL, Oracle Database
        // the query is smaller
        List<Integer> objectList = session.createQuery("select marks from Student", Integer.class).getResultList();
        System.out.println(objectList);
    }

    private static void aggregateFunctions() {
        Session session = Utility.getSession();
        // you change the table name
        // mysql server, postgres, MS SQL, Oracle Database
        // the query is smaller
        Long numberOfRecords = session.createQuery("select count(*) from Student", Long.class).getSingleResult();
        System.out.println(numberOfRecords);
    }

    private static void aggregateFunctions2() {
        Session session = Utility.getSession();
        // you change the table name
        // mysql server, postgres, MS SQL, Oracle Database
        // the query is smaller
        Integer numberOfRecords = session.createQuery("select max(marks) from Student", Integer.class).getSingleResult();
        System.out.println(numberOfRecords);
    }

    private static void sumOfAll() {
        Session session = Utility.getSession();
        Object result = session.createQuery("select sum(marks) from Student", Object.class).getSingleResult();
        System.out.println(result);
    }

    private static void maksGreater(int mark) {
        Session session = Utility.getSession();
        List<Student> studentList = session.createQuery("from Student where marks>40",Student.class).getResultList();
        System.out.println(studentList);
    }
}