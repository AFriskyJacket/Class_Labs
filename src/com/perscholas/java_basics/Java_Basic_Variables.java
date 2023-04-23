package com.perscholas.java_basics;

import org.omg.Messaging.SyncScopeHelper;

import java.math.BigDecimal;

public class Java_Basic_Variables {
    public static void main(String[] args){
        //adding ints
        int f_int = 1;
        int s_int = 2;
        int sum_int = f_int + s_int;
        System.out.println(sum_int);
        //adding doubles
        double f_double = 1.2;
        double s_double = 2.4;
        double sum_double = f_double + s_double;
        System.out.println(sum_double);
        //adding ints to doubles
        double the_sum = sum_int + sum_double;
        System.out.println(the_sum);
        //trying BigDecimal
        BigDecimal f_BigDecimal = BigDecimal.valueOf(f_double);
        BigDecimal s_BigDecimal = BigDecimal.valueOf(2.4);
        BigDecimal t_BigDecimal = f_BigDecimal.add(s_BigDecimal);
        System.out.println(t_BigDecimal.doubleValue());
        //int division
        int divided_int = s_int / f_int;
        System.out.println(divided_int);
        //int divided_wrong = s_double / f_int; error!
        //System.out.println(divided_wrong);
        double divided_right = s_double/f_int;
        System.out.println(divided_right);
        //double division and type casting
        double divided_double = s_double/f_double;
        System.out.println(divided_double);
        System.out.println((int) divided_double);
        //specified math
        int x = 5;
        int y = 6;
        double q = y/x;
        System.out.println(q);
        q = (double) y;
        System.out.println(q);
        //Constant math
        final double PI = 3.14;
        double area = PI + f_int * f_int;
        System.out.println(area);
        //cafe calculations
        BigDecimal cookie_Cost = BigDecimal.valueOf(2.99);
        BigDecimal milk_Cost = BigDecimal.valueOf(3.99);
        BigDecimal cheesecake_Cost = BigDecimal.valueOf(9.99);
        BigDecimal subTotal;
        BigDecimal totalSale;
        final BigDecimal SALES_TAX = BigDecimal.valueOf(1.00/* Deleware privilege!*/);
        //sale the first
        subTotal = SubTotal(3,cookie_Cost);
        totalSale = subTotal.multiply(SALES_TAX);
        System.out.println( totalSale.setScale(2));
        //sale the second
        subTotal = SubTotal(4, milk_Cost);
        totalSale = subTotal.multiply(SALES_TAX);
        System.out.println( totalSale.setScale(2));
        //sale the first
        subTotal = SubTotal(2, cheesecake_Cost);
        totalSale = subTotal.multiply(SALES_TAX);
        System.out.println( totalSale.setScale(2));
        }

    public static BigDecimal SubTotal(int x, BigDecimal y){
        return y.multiply(BigDecimal.valueOf(x));
    }

}
