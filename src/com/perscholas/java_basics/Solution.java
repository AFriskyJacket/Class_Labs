package com.perscholas.java_basics;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        ArrayList<Pair> intPairs = new ArrayList<>();
        MyCalculator calc = new MyCalculator();
        while (scan.hasNext()) {
            intPairs.add(new Pair(scan.nextInt(), scan.nextInt()));
        }
        for (Pair p : intPairs) {
            try {
                System.out.println(calc.power(p.getL(), p.getR()));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyCalculator {
    long power(int n, int p) throws Exception {
        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        } else if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        } else {
            return (long) Math.pow(n, p);
        }
    }
}

class Pair {
    private int l;
    private int r;

    public Pair(int l, int r) {
        this.l = l;
        this.r = r;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}