package com.perscholas.java_basics;

import java.math.BigDecimal;
import java.util.Scanner;

public class LoopsPA {
    public static void main(String[] args) {
        LoopsPA practice = new LoopsPA();
        practice.task_1();
        practice.task_2();
        practice.task_3();
    }
    private void task_1(){
        for (int x =1; x<13; x++ ){
            for (int y = 1; y <13; y++){
                System.out.print("    " + (x*y));
            }
            System.out.println();
        }
    }
    private void task_2(){
        Scanner scan = new Scanner(System.in);
        int x;
        int y;
        try{
            System.out.println("Enter first number");
            x = scan.nextInt();
            System.out.println(("Enter second number"));
            y = scan.nextInt();
            System.out.println("Your GCD is: "+ findGCD(x,y));
        } catch (Exception e){
            System.out.println("whole numbers only");
        }
    }
    private void task_3(){
        int ct = 10000;
        BigDecimal ft = new BigDecimal(ct);
        int year = 0;
        BigDecimal interest = new BigDecimal(1.07);
        boolean done = false;
        while (!done){
            if(ft.intValue()>=(ct*2)){
                System.out.println("Tuition will double to " + ft.intValue() + " in " + year + " years.");
                done = true;
            } else {
                ft = ft.multiply(interest);
                year++;
                System.out.println(ft.intValue() + " year "+ year);
            }
        }
    }
    private int findGCD(int x, int y){
        int n1 = 0;
        int n2 = 0;
        if(x>y){
            n2 = x;
            n1 = y;
        } else if (x<=y) {
            n1 = x;
            n2 = y;
        }
        for(int gcd = n1; gcd>0; gcd--){
            if(n1%gcd ==0 && n2%gcd ==0){
                //System.out.println(n1/gcd);
                return gcd;
            }
        }
        return 1;
    }
}
