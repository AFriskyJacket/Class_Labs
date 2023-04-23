package com.perscholas.java_basics;

public class CodingChallange {
    public static void main(String[] args) {
        String[] names = {"Jason", "James", "Greg", "Mary", "Lisa"};
        boolean[] picked = new boolean[names.length];
        while (!allTrue(picked)) {
            int rand = (int) (Math.random() * 5);
            System.out.println(rand);
            if (!picked[rand]) {
                System.out.println(names[rand]);
                picked[rand] = true;
            }
        }
    }
    public  static boolean allTrue(boolean[] checked) {
        for (boolean checker : checked) {
            if (!checker) {
                return false;
            }
        }
        return true;
    }
}
