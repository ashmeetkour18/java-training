package com.company.hibernate_assessment.question7;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Question_7 {
    public static void main(String[] args) {
        insert();
        //insert();
    }

    private static void insert() {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        Product product = new Product();
        product.setName("product_1");
        product.setPrice(124);
        session.persist(product);
        //transaction.commit();
        Product product1 = new Product();
        product1.setName("product_2");
        product.setPrice(124);
        session.persist(product1);
        transaction.commit();
        session.close();
    }


    public static Session getSession() {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Product.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        return session;
    }
}
