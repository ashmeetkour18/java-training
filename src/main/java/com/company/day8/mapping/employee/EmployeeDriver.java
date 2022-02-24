package com.company.day8.mapping.employee;

import com.company.utils.Utility;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeDriver {
    public static void main(String[] args) {
        Session session = Utility.getSession("employee.hbm.xml");
        Transaction transaction = session.beginTransaction();
       // Employee employee  = new Employee("name-1");
        Employee employee = session.get(Employee.class, 1);
        Department department  = new Department("department- 2" , employee);
        session.persist(department);
        transaction.commit();;
        session.close();;
    }
}
