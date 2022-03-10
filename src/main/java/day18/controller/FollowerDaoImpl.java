package day18.controller;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FollowerDaoImpl implements  FollowerDao{
   @Autowired
    Session session;
    @Override
    public void saveFollower(Follower follower) {
        session.beginTransaction();
        session.persist(follower);
        session.getTransaction().commit();
    }
}
