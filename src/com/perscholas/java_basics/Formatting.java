package com.perscholas.java_basics;

import java.io.PrintStream;

public class Formatting {
    public static void main(String[] args) {
        double num = 100;
        Formatting f = new Formatting();

        f.printDouble(num);
        f.printDoubleAndString("Hello world ",num);
        f.format2Decimal(num);
        f.format3Decimal(num);
        f.format4Decimal(num);

    }
    //1
    public PrintStream printDouble(double d) {
        return System.out.printf("%f%n", d);
    }
    //2
    public PrintStream printDoubleAndString(String s, double d) {
        return System.out.printf(s +"%f%n", d);
    }
    //3
    public PrintStream format4Decimal( double d) {
        return System.out.printf("%.4f%n", d);
    }
    //4
    public PrintStream format3Decimal(double d) {
        return System.out.printf("%.3f%n", d);
    }
    //5
    public PrintStream format2Decimal(double d) {
        return System.out.printf("%.2f%n", d);
    }
}