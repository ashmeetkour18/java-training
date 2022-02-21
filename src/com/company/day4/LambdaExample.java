package com.company.day4;

import java.util.Locale;

interface Operation {
    public int operate(int num1, int num2);
}
interface  Case{
    public String lowerCase(String s);
}

public class LambdaExample {
    public static void main(String[] args) {

        System.out.println(function(2,3,new PowerOpration()));
        System.out.println(functionToLoweCase("DEV"));
    }
    // function(a,b,operation) and depending upon this third argument. performs
    // the operation.
    // a + b , a - b
    // function(a,b,operation)  operation = "+", "-", "*", "/"

    // I can add any number of new operators and this function definition
    // remain same.
    public static String functionToLoweCase(String s){
        Case aCase =(s1)-> s.toLowerCase();
        return s;
    }

    public static int function(int num1, int num2, Operation operation) {
        return operation.operate(num1, num2);
    }
}

class AddOperation implements Operation {

    @Override
    public int operate(int num1, int num2) {
        return num1 + num2;
    }
}

class MinusOperation implements Operation {

    @Override
    public int operate(int num1, int num2) {
        return num1 - num2;
    }
}
class  PowerOpration implements Operation {

    @Override
    public int operate(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }
}
