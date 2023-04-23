package com.perscholas.java_basics.Demos;
/*
The Java String compareTo() method compares the given string with the current string. It is a method of ‘Comparable’
interface that is implemented by the String class. It either returns a positive number, a negative number, or 0.
 */
public class CompareToDemo {
    public static void main(String args[]) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "hemlo";
        String s4 = "flag";
        System.out.println(s1.compareTo(s2)); // 0 because both are equal
        System.out.println(s1.compareTo(s3)); //-1 because "l" is only one time lower than "m"
        System.out.println(s1.compareTo(s4)); // 2 because "h" is 2 times greater than "f"
    }
}