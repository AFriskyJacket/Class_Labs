package com.perscholas.java_basics;

import java.util.*;

public class LambdaPractice {
    public static void main(String[] args) {
        printUsingLambda();
        TestStaticMethods test_2 = new TestStaticMethods();
    }
    public static void printUsingLambda(){
        ArrayList<String> names = new ArrayList<>();

        String[] firstName = {"Harold", "Luciano", "Tyree", "Nyla", "Natalie", "Quincy", "Devyn", "Aliana"};

        Collections.addAll(names, firstName);
        // Print every item in the list using lambda expressions.
        names.forEach(n -> System.out.println(n));

        names.forEach(n -> System.out.println(names.indexOf(n) + " " + n ));
        names.forEach(n -> System.out.println(n.toUpperCase()));

        AddTwoNumbers numbers = (x,y) -> x+y;
        System.out.println(numbers.adds(2,3));
        numbers = (x,y)-> x-y;
        System.out.println(numbers.adds(2,3));
        MyNumber showIt = x -> x;
        System.out.println(showIt.showNumber(5));
    }

}
interface StaticMethods{
    static void methodOne(){
        System.out.println("m");
    }
    void methodTwo();
}
class TestStaticMethods implements StaticMethods{
    public TestStaticMethods(){
        methodTwo();
        StaticMethods.methodOne();
    }
    @Override
    public void methodTwo(){
        System.out.println("M");
    }

}
interface AddTwoNumbers{
    int adds(int x, int y);
}
interface MyNumber{
    int showNumber(int x);
}