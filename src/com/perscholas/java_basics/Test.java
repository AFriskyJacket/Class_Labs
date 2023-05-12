package com.perscholas.java_basics;

@FunctionalInterface
interface MyFunctionalInterface {
    public Integer sqr(int a);

    default String sqr(String a) {
        return a + a;
    }
}

public class Test {
    public static void main(String[] args) {
        MyFunctionalInterface fi = n -> {
            return (Integer) (n * n);
        };
        System.out.println(fi.sqr(5));
    }
}