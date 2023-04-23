package com.perscholas.java_basics.Demos;
/*
The String class's equals() method compares the original content of the string. It compares the values of strings for equality.
 */
public class EqualsDemo {
    public static void main(String args[]){
        String s1="PerScholas";
        String s2="PerScholas";
        String s3=new String("PerScholas");
        String s4="Teksystem";
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false
    }
}
