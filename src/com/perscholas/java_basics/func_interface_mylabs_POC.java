package com.perscholas.java_basics;
import java.util.*;
import java.util.function.*;

public class func_interface_mylabs_POC {
    //Please Upload screenshot of Code and results
    public static void main(String[] args) {
        FunctionJavaUtil test_1 = new FunctionJavaUtil();
        FuncInterface3 test_2 = new FuncInterface3();
        FunctionJavaUtil3 test_3 = new FunctionJavaUtil3();
        FuncInterfaceGeneric test_4 = new FuncInterfaceGeneric();
        Lab_5_EntryPoint test_5 = new Lab_5_EntryPoint();
    }
}
// Lab1
// Add code to make it work
// Begin Code
// https://www.geeksforgeeks.org/function-interface-in-java-with-examples/
//
// Importing interface
class FunctionJavaUtil {
    // Java Program to Illustrate Functional Interface
    // Via apply() method
    // Main driver method
    public FunctionJavaUtil() {
        // Function which takes in a number
        // and returns half of it
        //Function<Integer, Double> half = a -> a / 2.0;
        Function<Double, Double> half = a -> a / 2.0;
        Double dblInput = 58.5;

        // Applying the function to get the result
        Double dd = half.apply(dblInput);
        System.out.println(dd);
    }
}
// End of Code
// Lab 2 ==============================================
// BEGIN CODE
    // https://www.geeksforgeeks.org/functional-interfaces-java/
    // Java program to demonstrate lambda expressions to
    // implement a user defined functional interface.
    // Single Abstract Method (SAM) types or interfaces
    // The major benefit of java 8 functional interfaces is that we
    // can use lambda expressions to instantiate them and avoid
    // using bulky anonymous class implementation.
    //  WHAT YOU NEED done: Implement the FunctionalInterface  Square
class FuncInterface3 {
    interface Square{
        int calculate(int x);
    }
        public FuncInterface3() {
            int a = 5;

            // lambda expression to define the calculate method
            Square s = (int x) -> x * x;

            // parameter passed and return type must be
            // same as defined in the prototype
            int ans = s.calculate(a);
            System.out.println(ans);
        }
    }
// END of Code
// Lab 3 ============================================
// https://www.geeksforgeeks.org/function-interface-in-java-with-examples/
// Java Program to illustrate compose() method
//  Importing Function interface
//  Main class
class FunctionJavaUtil3 {
        // Main driver method
        public FunctionJavaUtil3()
        {
            // Function which takes in a number and
            // returns half of it
            Function<Integer, Double> half = a -> a / 2.0;

            // INSERT CODE TO TRIPLE THE VALUE OF THE HALF FUNCTION
            half = half.andThen( a-> a*3);

            // Applying the function to get the result
            System.out.println(half.apply(5));
        }
    }

// END of code
// LAB 4 =============================
//Generalized (template) functional interface.
// WHAT YOU NEED done:
//CODE The interface that operates on the generic type T.
class FuncInterfaceGeneric {
    interface IValue<T> {
        T GetValue();
    }

    public FuncInterfaceGeneric() {
        // Declare a reference to the IValue functional interface
        // that will operate on the Float type
        IValue<Float> refIValue;

        // Set a lambda expression with reference to the type Float
        refIValue = () -> 3.1415f; // return the value of float type

        // Invoke method GetValue(), which returns 3.1415f
        float v = refIValue.GetValue(); // v = 3.1415
        System.out.println("v = " + v);
    }
}
// END of code

// LAB 5==============================================
// Code up this object
//Begin Code
class Student {
    int id;

    String name;

    double percentage;

    String specialization;

    public Student(int id, String name, double percentage, String specialization) {
        this.id = id;

        this.name = name;

        this.percentage = percentage;

        this.specialization = specialization;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String toString() {
        return id + "-" + name + "-" + percentage + "-" + specialization;
    }
}
//  End code student obj

// Begin code for Main Caller
//
// Original Doc
//
// https://javaconceptoftheday.com/java-8-functional-interfaces/
//

class Lab_5_EntryPoint {

    public Lab_5_EntryPoint() {

        List<Student> listOfStudents = new ArrayList<Student>();
        listOfStudents.add(new Student(111, "John", 81.0, "Mathematics"));
        listOfStudents.add(new Student(222, "Harsha", 79.5, "History"));
        listOfStudents.add(new Student(333, "Ruth", 87.2, "Computers"));
        listOfStudents.add(new Student(444, "Aroma", 63.2, "Mathematics"));
        listOfStudents.add(new Student(555, "Zade", 83.5, "Computers"));
        listOfStudents.add(new Student(666, "Xing", 58.5, "Geography"));
        listOfStudents.add(new Student(777, "Richards", 72.6, "Banking"));
        listOfStudents.add(new Student(888, "Sunil", 86.7, "History"));
        listOfStudents.add(new Student(999, "Jordan", 58.6, "Finance"));
        listOfStudents.add(new Student(101010, "Chris", 89.8, "Computers"));
        //====================================
        // a) Predicate – Tests an object
        //====================================
        // Imagine an operation where you want only a list of “Mathematics”
        // students from the above listOfStudents. Let’s see how to do it using Predicate.
        //
        // WHAT YOU NEED done:
        // Lambda expression implementing Predicate : Checking specialization of a Student for “Mathematics”
        //YOUR CODE HERE
        Predicate<Student> mathematicsPredicate = (b) -> b.getSpecialization().equals("Mathematics");

        List<Student> mathematicsStudents = new ArrayList<Student>();

        for (Student student : listOfStudents) {
            if (mathematicsPredicate.test(student)) {
                mathematicsStudents.add(student);
            }
        }

        System.out.println("\n==============> Dump Math list...");
        Iterator<Student> mathIter = mathematicsStudents.iterator();
        while (mathIter.hasNext()) {
            System.out.println(mathIter.next());
        }
        //====================================
        // b) Consumer – Consumes an object
        //====================================
        // Consumer represents an operation which takes an argument and returns nothing.
        // Use this functional interface If you want to compose a lambda expression which
        // performs some operations on an object.
        // For example, displaying all students with their percentage.
        // Lambda expression implementing Consumer : Displaying all students with
        // their percentage

        System.out.println("\n==============> Students with their percentage...");
        Consumer<Student> percentageConsumer = (Student student) -> {
            System.out.println(student.getName() + " : " + student.getPercentage());
        };

        for (Student student : listOfStudents) {
            percentageConsumer.accept(student);
        }
        //====================================
        // c) Function – Applies to an object
        //====================================

        // Function represents an operation which takes an argument of type T and
        // returns a result of type R. Use this functional interface if you want to
        // extract some data from  existing data.

        // For example, extracting only the names from listOfStudents.

        // Lambda expression implementing Function : Extracting only the names of all students

        Function<Student, String> nameFunction = (Student student) -> student.getName();

        List<String> studentNames = new ArrayList<>();

        for (Student student : listOfStudents) {
            studentNames.add(nameFunction.apply(student));
        }

        System.out.println("\n==============> Dump Student Name list...");
        Iterator<String> nameIter = studentNames.iterator();
        while (nameIter.hasNext()) {
            System.out.println(nameIter.next());
        }
        //====================================
        // d) Supplier – Supplies the objects
        //====================================

        // Supplier represents an operation which takes no argument and returns
        // the results of type R. Use this functional interface when you want to
        // create new objects.

        // Lambda expression implementing Supplier : Creating a new Student

        Supplier<Student> studentSupplier =
                () -> new Student(111111, "New Student", 92.9, "Java 8");

        listOfStudents.add(studentSupplier.get());

        System.out.println("\n==============> Dump Additional Student list...");
        Iterator<Student> stuIter = listOfStudents.iterator();
        while (stuIter.hasNext()) {
            System.out.println(stuIter.next());
        }
    }
}
// End Code
// End LABS
