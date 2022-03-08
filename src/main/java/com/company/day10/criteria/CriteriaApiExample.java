package com.company.day10.criteria;

import com.company.day9.hql.Student;
import com.company.day9.hql.Utility;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;

import java.util.List;




/*
* SELECT message, count(userId)
FROM user_records GROUP BY userId
HAVING count(userId)=(
SELECT max(mycount)
FROM (
SELECT message, count(userId) mycount
FROM user_records
GROUP BY userId)as counter);
*
* */
public class CriteriaApiExample {
    public static void main(String[] args) {
        Session session = Utility.getSession();
        groupedBy(session);
        // predicate means a condition that is evaluated to true or false
        // from Student where marks > 90
        System.out.println();
        //   selectQuery();

    }

    private static CriteriaQuery<Double> average(Session session) {
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Double> criteriaQuery = criteriaBuilder.createQuery(Double.class);
        Root<Student> root = criteriaQuery.from(Student.class);
        criteriaQuery.select(criteriaBuilder.avg(root.get("marks")));
        return criteriaQuery;
    }

    private static void groupedBy(Session session) {
        CriteriaBuilder builder = session.getCriteriaBuilder();

        CriteriaQuery<Object[]> criteriaQuery = builder.createQuery(Object[].class);
        Root<Student> root = criteriaQuery.from(Student.class);
        criteriaQuery.multiselect(root.get("name"), builder.count(root.get("name")));
        criteriaQuery.groupBy(root.get("name"));
        List<Object[]> resultList = session.createQuery(criteriaQuery).getResultList();
        resultList.forEach(student -> System.out.println("Student Name: " + student[0] + "\t count : " + student[1]));

    }


    private static CriteriaQuery<Student> studentCriteriaQuery(Session session) {
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
        Root<Student> root = criteriaQuery.from(Student.class);
        criteriaQuery.select(root).where(criteriaBuilder.between(root.get("name"), "student-1", "student-2"));
        return criteriaQuery;
    }

    private static CriteriaQuery<Student> betweenMethod(Session session) {
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
        Root<Student> root = criteriaQuery.from(Student.class);
        criteriaQuery.select(root).where(criteriaBuilder.between(root.get("marks"), 10, 20));
        return criteriaQuery;
    }


    private static CriteriaQuery<Student> ltMethod(Session session) {
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
        Root<Student> root = criteriaQuery.from(Student.class);
        criteriaQuery.select(root).where(criteriaBuilder.lt(root.get("marks"), 10));

        return criteriaQuery;
    }

    private static CriteriaQuery<Student> gtMethod(Session session) {
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
        Root<Student> root = criteriaQuery.from(Student.class);
        criteriaQuery.select(root).where(criteriaBuilder.gt(root.get("marks"), 90));

        return criteriaQuery;
    }


    private static void selectQuery() {
        Session session = Utility.getSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
        Root<Student> root = criteriaQuery.from(Student.class);
        /*
        root is like root of a tree.
        Binary Trees in algorithm or in general what is a tree in a graph
         */
        criteriaQuery.select(root);
        System.out.println(session.createQuery(criteriaQuery).getResultList());
    }


}
