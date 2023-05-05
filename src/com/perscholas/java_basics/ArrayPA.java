package com.perscholas.java_basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPA {
    public static void main(String[] args) {
        ArrayPA practice = new ArrayPA();
        practice.task_1();
        practice.task_2();
        practice.task_3();
        practice.task_4();
        practice.task_5();
        practice.task_6();
        practice.task_7();
        practice.task_8();
        practice.task_9();
        practice.task_10();
        practice.task_11();
    }

    private void task_1() {
        int[] numbers = {1, 2, 3};
        for (int x : numbers) {
            System.out.println(x + " ");
        }
    }

    private void task_2() {
        int[] numbers = {13, 5, 7, 68, 2};
        System.out.println(getMiddleElement(numbers));
    }

    private void task_3() {
        String[] colors = {"red", "green", "blue", "yellow"};
        System.out.println(colors.length);
        String[] colorsClone = colors.clone();
        System.out.println(Arrays.toString(colorsClone));
    }

    private void task_4() {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers[0] + " " + numbers[numbers.length - 1]);
        try {
            System.out.println(numbers[numbers.length]);
            numbers[5] = 6;
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            numbers[5] = 6;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void task_5() {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        System.out.println(Arrays.toString(numbers));
    }

    private void task_6() {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
        }
        System.out.println(Arrays.toString(numbers));
    }

    private void task_7() {
        String[] lyrics = {"hey, now", "hey, now", "here's", "what chu", "say, now"};
        for (int i = 0; i < lyrics.length; i++) {
            if (!(i == lyrics.length / 2)) {
                System.out.println(lyrics[i]);
            }
        }
    }

    private void task_8() {
        String[] stuff = {"Go", "run", "the", "long", "mile"};
        System.out.println(Arrays.toString(stuff));
        /* String swapper = stuff[0];
        stuff[0] = stuff[stuff.length/2];
        stuff[stuff.length/2] = swapper;*/
        posSwap(stuff, 0, stuff.length / 2);
        System.out.println(Arrays.toString(stuff));
    }

    private void task_9() {
        int[] numbers = {4, 2, 9, 13, 1, 0};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Array in ascending order: " + Arrays.toString(numbers));
        System.out.println("The smallest number is: " + numbers[0]);
        System.out.println("The biggest number is: " + numbers[numbers.length - 1]);
    }

    private void task_10() {
        Object[] stuff = {1, "does", "not", "equal", (double) 1};
        System.out.println(Arrays.toString(stuff));
    }

    private void task_11() {
        Scanner scan = new Scanner(System.in);
        System.out.println("how many favorite things do you have?");
        try {
            int x = scan.nextInt();
            scan.nextLine();
            String[] fThings = new String[x];
            System.out.println("enter your favorite things");
            /*for (String input: fThings){
                input = scan.nextLine();
            }*/
            //didnt work for some reason
            for (int i = 0; i < fThings.length; i++) {
                fThings[i] = scan.nextLine();
                System.out.println("and?");
            }
            System.out.println("your favorite things are:");
            for (String output : fThings) {
                System.out.print(" " + output);
            }
        } catch (Exception e) {
            System.out.println("ya done messed up");
        }
    }

    private int getMiddleElement(int[] input) {
        int medianE = 0;
        if (input.length % 2 == 0) {
            System.out.println("even length array error");
        } else {
            medianE = input.length / 2;
        }
        return input[medianE];
    }

    private void posSwap(Object[] swap, int index1, int index2) {
        Object swapper = swap[index1];
        swap[index1] = swap[index2];
        swap[index2] = swapper;
    }
}
