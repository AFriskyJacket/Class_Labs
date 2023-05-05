package com.perscholas.java_basics;

public class Null_PTR_Labs {
    public static void main(String[] args) {
        NullPtrExcept lab_1 = new NullPtrExcept();
        System.out.println();
        NullPtrExcept2 lab_2 = new NullPtrExcept2();
        System.out.println();
        ThrowableExample lab_3 = new ThrowableExample();
        System.out.println();
        NestedDemo lab_4 = new NestedDemo();
    }
}
// BEGIN LAB 1


//A Java program to demonstrate that invoking a method
//on null causes NullPointerException

// WHAT YOU NEED to do:
// Please re-write code  to avoid NullPointerException
class NullPtrExcept {
    public NullPtrExcept() {
        // Initializing String variable with null value
        String ptr = null;

        try {
            if (ptr.equals("gfg"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        } catch (NullPointerException e) {
            System.out.print("NullPointerException Caught");
        }
        ptr = "gfg";
        try {
            if (ptr.equals("gfg"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        } catch (NullPointerException e) {
            System.out.print("NullPointerException Caught");
        }
    }
}

// BEGIN LAB 2 ===========================================

// A Java program to demonstrate that we should
// check if parameters are null or not before
// using them.

// WHAT YOU NEED to do:

// Please write a static  method called getLength(s)  to return length of string s. It throws
// IllegalArgumentException if s is null.
//=============== begin code
class NullPtrExcept2 {
    public NullPtrExcept2() {
        // String s set an empty string and calling getLength()
        String s = "";
        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }

        // String s set to a value and calling getLength()
        s = "GeeksforGeeks";
        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }

        // Setting s as null and calling getLength()
        s = null;
        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }
    }

    // Function to return length of string s. It throws
    // IllegalArgumentException if s is null.
    private static int getLength(String word) {
        if (word == null) {
            throw new IllegalArgumentException();
        }
        return word.length();
    }
}

// BEGIN LAB 3
class ThrowableExample {

    // Main Method
    public ThrowableExample() {
        try {
            testException();
        } catch (Throwable e) {
            // Print using tostring()
            System.out.println("Exception: "
                    + e.toString());
        }
    }

    // Method which throws Exception
    public static void testException() throws Exception {
        // WHAT YOU NEED to do:  code this method
        throw new Exception("this is a test Exception");
    }
}

// Begin Lab 4

// WHAT YOU NEED to do:  change this code to throw ArithmeticException
class NestedDemo {
    public NestedDemo() {
        //main try-block
        try {
            //try-block2
            try {
                //try-block3
                try {
                    int arr[] = {1, 2, 3, 4};
                    /* I'm trying to display the value of an element which doesn't exist. The code should throw an exception       */
                    //System.out.println(arr[10]);
                    throw new ArithmeticException();
                } catch (ArithmeticException e) {
                    System.out.print("Arithmetic Exception");
                    System.out.println(" handled in try-block3");
                }
                throw new ArithmeticException();
            } catch (ArithmeticException e) {
                System.out.print("Arithmetic Exception");
                System.out.println(" handled in try-block2");
            }
            throw new ArithmeticException();
        } catch (ArithmeticException e3) {
            System.out.print("Arithmetic Exception");
            System.out.println(" handled in main try-block");
        } catch (ArrayIndexOutOfBoundsException e4) {
            System.out.print("ArrayIndexOutOfBoundsException");
            System.out.println(" handled in main try-block");
        } catch (Exception e5) {
            System.out.print("Exception");
            System.out.println(" handled in main try-block");
        }
    }
}