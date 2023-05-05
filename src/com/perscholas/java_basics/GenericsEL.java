package com.perscholas.java_basics;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class GenericsEL {

    public static void main(String[] args) {
        lab_1();
        lab_2();
        lab_3();
    }

    public static void lab_1() {

        // initialize generic class
        // with Integer data
        GenericsClass<Integer> intObj = new GenericsClass<>(5);
        System.out.println("Generic Class returns: " + intObj.getData());

        // initialize generic class
        // with String data
        GenericsClass<String> stringObj = new GenericsClass<>("Java Programming");
        System.out.println("Generic Class returns: " + stringObj.getData());

        // initialize generic class  ENTER CODE HERE!
        // with Boolean data
        GenericsClass<Boolean> bolObj = new GenericsClass<>(true);
        System.out.println("Generic Class returns: " + bolObj.getData());
    }

    public static void lab_2() {
        // create an object of GenericsClass
        //GenericClassLAB2<String> obj = new GenericClassLAB2<>();
        //we changed the above to the below
        GenericClassLAB2<Number> obj = new GenericClassLAB2<>();
        obj.display();
    }

    public static void lab_3() {
        Printer myPrinter = new Printer();
        ArrayList<Integer> intArray = new ArrayList<>(Arrays.asList(new Integer[]{1, 2, 3}));
        ArrayList<String> stringArray = new ArrayList<>(Arrays.asList(new String[]{"Hello", "World"}));
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        // https://www.geeksforgeeks.org/class-getdeclaredmethods-method-in-java-with-examples/

        // The getDeclaredMethods() method of java.lang.Class class
        // is used to get the methods of this class, which are the
        // methods that are private, public, protected or default
        // and its members or the members of its member classes and
        // interfaces, but not the inherited methods. The method returns
        // the methods of this class in the form of an array of Method objects.

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if (name.equals("printArray"))
                count++;
            System.out.println("Method count=" + count);
        }

        if (count > 1) System.out.println("Method overloading is not allowed!");
    }
}

// create a generics class
class GenericsClass<T> {

    // variable of T type
    private T data;

    public GenericsClass(T data) {
        this.data = data;
    }

    // method that return T type variable
    public T getData() {
        return this.data;
    }
}

class GenericClassLAB2<T extends Number> {

    public void display() {
        System.out.println("This is a bounded type generics class.");
    }
}

class Printer {
    public void printArray(ArrayList toPrint) {
        for (Object print : toPrint) {
            System.out.println(print);
            System.out.println();
        }
    }
}
