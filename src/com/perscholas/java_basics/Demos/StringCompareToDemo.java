package com.perscholas.java_basics.Demos;
/*
By Using compareTo() method,
The String class's compareTo() method compares values lexicographically. It returns an integer value that describes if
 the first string is less than, equal to, or greater than the second string.
// return 0 if this string is the same as another;
// <0 if lexicographically less than another; or >0


Suppose s1 and s2 are two String objects. If:
s1 == s2 : The method returns 0.
s1 > s2 : The method returns a positive value.
s1 < s2 : The method returns a negative value.
 */
public class StringCompareToDemo {
    public static void main(String args[]){
        String s1="Perscholas";
        String s2="Perscholas";
        String s3="Perscholas";
        System.out.println(s1.compareTo(s2));//0
        System.out.println(s1.compareTo(s3));//1(because s1>s3)
        System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )
    }
}
