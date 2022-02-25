package com.company.day10.criteria;

import com.company.day9.hql.Student;
import com.company.day9.hql.Utility;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;

public class CriteriaApiExample {
    public static void main(String[] args) {
        Session session  = Utility.getSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Student> critertiaQuery = criteriaBuilder.createQuery(Student.class);
        Root<Student> root = critertiaQuery.from(Student.class);
        /*
        root is like root of a tree.
        Binary Trees in algorithm or in general what is a tree in a graph
         */
        critertiaQuery.select(root);
        System.out.println(session.createQuery(critertiaQuery).getResultList());

    }

}
