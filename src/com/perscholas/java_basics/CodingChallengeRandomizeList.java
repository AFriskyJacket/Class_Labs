package com.perscholas.java_basics;

import java.util.Arrays;

public class CodingChallengeRandomizeList {
    public static void main(String[] args) {
        String[] names = {"Harold", "James", "John", "Andrew", "Philip", "Matthew", "Thomas", "Simon"};
        System.out.println(Arrays.toString(names));
        String[] randomNames = new String[names.length];
        boolean[] picked = new boolean[names.length];
        int iterator = 0;
        while (!allTrue(picked)) {
            int rand = (int) (Math.random() * names.length);
            //System.out.println(rand);
            if (!picked[rand]) {
                //System.out.println(names[rand]);
                randomNames[iterator] = names[rand];
                iterator++;
                picked[rand] = true;
            }
        }
        System.out.println(Arrays.toString(randomNames));
    }

    public static boolean allTrue(boolean[] checked) {
        for (boolean checker : checked) {
            if (!checker) {
                return false;
            }
        }
        return true;
    }
}
