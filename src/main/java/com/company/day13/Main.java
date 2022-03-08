package com.company.day13;

public class Main {
    public static void main(String[] args) {
       /* Users user = new Users();
        user.addSortingMethod(new MergeSort());
        user.sort();*/
        /*ShareTrading shareTrading=new ShareTrading(new Strategy2());
        shareTrading.strategy();*/
        LazySingleton singleton = LazySingleton.getInstance();
        LazySingleton singleton1 = LazySingleton.getInstance();
        System.out.println(singleton.hashCode() + " , "+singleton1.hashCode());

        EagerSingleton eagerSingleton=EagerSingleton.getInstance();
        EagerSingleton eagerSingleton1=EagerSingleton.getInstance();
        System.out.println(eagerSingleton.hashCode()+" , "+eagerSingleton1.hashCode());
    }
}
/*
Question: generally which design pattern is used to develop a software?
Ans:
There are 100's of Design patterns. It depends on what kind of Problem you are dealing with. There is no
single design pattern. All of them have a use depending upon the problem you are trying to solve.
But there are General Design Principles or Coding Guidelines. Design Principles are different from Design Patterns

The most common Design Principles are :
1) DRY - Don't Repeat Yourself
Basically means you should not duplicate code
2) Single Responsibility Principle
Each class you write should have only one responsibility.
It should not do that job of two classes. If that is the case then split
it into two classes
3) Open/Closed Principle
Each Class should be open to extension but closed to modification.
This is something that is achieved with Dependency Injection as we saw in the examples

Some principles are famous and have an acronym called SOLID Design principles.

 */