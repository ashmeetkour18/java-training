package com.company.day9.tweet;

import com.company.day9.hql.Student;
import com.company.day9.hql.Utility;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Map;

/*
Q3:
Write a class Tweet with fields
 (i) id <-  primary key
 (ii) String userId
 (iii) String tweet
 (iv) Generate random data like in this example say 100 records
(v)
 write a group by clause which returns
 for each user the count of tweets

*/
public class TweeterDriver {
    public static void main(String[] args) {
        //insertRecords();
        fetchRecords();
    }

    public static Session getSession() {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Tweet.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        return session;
    }

    private static void insertRecords() {
        Session session = getSession();
        String[] names = new String[]{"user-1", "user2-2", "user-3", "user-4"};
        Transaction transaction = session.beginTransaction();
        for (int i = 0; i < 10; i++) {
            Tweet tweet = new Tweet();
            tweet.setUserId(names[(int) (Math.random() * 4)]);
            tweet.setTweet("tweet  -> " + (Math.random() * 100));
            session.persist(tweet);
        }
        transaction.commit();
        session.close();
    }

    private static void fetchRecords() {
        Session session = getSession();
        // you change the table name
        // mysql server, postgres, MS SQL, Oracle Database
        // the query is smaller
        List<?> tweets = session.createQuery
                ("select count(tweet),userId  group by userId ").list();
        System.out.println(tweets);

    }


}
