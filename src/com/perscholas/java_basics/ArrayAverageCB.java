package com.perscholas.java_basics;

public class ArrayAverageCB {

    public static void main(String[] args) {
        System.out.println("avg of 1 2 3 4 5 = " + arrayAvg(new int[] {1, 2, 3, 4, 5}));
        System.out.println("avg of 0 0 0 0 = " + arrayAvg(new  int[]{0,0,0,0}));
        System.out.println("avg of 50 0 21 1 = " + arrayAvg(new  int[]{50,0,21,1}));
        System.out.println("avg of 1 2 3 4 5 6 7 8 9 = " + arrayAvg(new  int[]{1,2,3,4,5,6,7,8,9}));
        System.out.println("avg of 7 10 20 = " + arrayAvg(new  int[]{7,10,20}));
    }

    public static String arrayAvg(int[] nums) {
        if (nums.length ==0){
            return "0.00";
        }
        int numbers = 0;
        double ans = 0.00;
        for (int  x : nums) {
            ans +=x;
            numbers++;
        }
            ans = ans / numbers;
        return String.format("%.2f",ans);
    }
}
