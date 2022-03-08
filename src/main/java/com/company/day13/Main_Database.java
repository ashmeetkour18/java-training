package com.company.day13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
class Main_Database {
    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(Main_Database.class, args);
        DataBase_Bean bean = context.getBean(DataBase_Bean.class);
        System.out.println("intitail bean   -  " + bean);
        bean.setMysqlUrl("m");
        bean.setPassword("p");
        bean.setUserName("u");
        System.out.println("after set"+bean);
        DataBase_Bean bean1 = context.getBean(DataBase_Bean.class);
        System.out.println("intitail bean   -  " + bean1);
        bean1.setMysqlUrl("m1");
        bean1.setPassword("p1");
        bean1.setUserName("u1");
        System.out.println("after set"+bean1);
        System.out.println(bean.equals(bean1))
        ;
        System.out.println("bean"+bean);
        System.out.println("bean1"+bean1);
        Database database = Database.getInstance();
        database.setMysqlUrl("mysql1");
        database.setPassword("1");
        database.setUserName("k");
        System.out.println(database);

        Database database1 = Database.getInstance();
        database1.setMysqlUrl("mysql2");
        database1.setUserName("2");
        database1.setPassword("3");
        System.out.println("database " + database.hashCode() + "  database1 - " + database1.hashCode());
        System.out.println(database == database1);
        System.out.println(database.equals(database1));
        System.out.println(database);
        System.out.println(database1);
    }
}