package com.perscholas.java_basics;

import java.util.ArrayList;
import java.util.Collections;

// Create interface Calculations
interface Calculation {
    int subtract(int x);

    int multiply(int x);
}

public class CalculationsCR {

    public static void main(String[] args) {
        Mathematics mathies = new Mathematics();
        System.out.println("expect 0 get " + mathies.subtract(954));
        System.out.println("expect 1 get " + mathies.subtract(10000));
        System.out.println("expect -10 get " + mathies.subtract(5555));
        System.out.println();
        System.out.println("expect 0 get " + mathies.multiply(0));
        System.out.println("expect 1 get " + mathies.multiply(111111111));
        System.out.println("expect 24 get " + mathies.multiply(1234));
    }

}

// Create class Mathematics
class Mathematics implements Calculation {
    @Override
    public int subtract(int x) {
        ArrayList<Integer> broken = breaker(x);
        int ans = broken.get(0);
        for (int i = 1; i < broken.size(); i++) {
            ans = ans - broken.get(i);
        }
        return ans;
    }

    @Override
    public int multiply(int x) {
        ArrayList<Integer> broken = breaker(x);
        int ans = broken.get(0);
        for (int i = 1; i < broken.size(); i++) {
            ans = ans * broken.get(i);
        }
        return ans;
    }

    private ArrayList<Integer> breaker(int x) {
        int y = x;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(y % 10);
        while (y >= 10) {
            y = y / 10;
            ans.add(y % 10);
        }
        Collections.reverse(ans);
        return ans;
    }
}
