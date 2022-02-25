package com.company.day9.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Utility {
        public static Session getSession(String hibernateMappingFile){
            Configuration configuration = new Configuration();
            configuration.configure();
            configuration.addResource(hibernateMappingFile);
            SessionFactory sessionFactory = configuration.buildSessionFactory();
            Session session = sessionFactory.openSession();
            return session;
        }
    public static Session getSession(){
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Student.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        return session;
    }

}