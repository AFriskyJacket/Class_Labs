package com.perscholas.java_basics;

import java.util.Scanner;

public class ControlFlowPA {
    public static void main(String[] args) {
        ControlFlowPA practice = new ControlFlowPA();
        practice.task_1();
        practice.task_2();
        practice.task_3();
        practice.task_4();
        practice.task_5();
        practice.task_6();
        practice.task_7();
    }

    private void task_1() {
        int x = 7;
        isLessThanTen(x);
        x = 15;
        isLessThanTen(x);
    }

    private void task_2() {
        int x = 7;
        if (isLessThanTen(x)) {
        } else if (isGreaterThanTen(x)) {
        }
        x = 15;
        if (isLessThanTen(x)) {
        } else if (isGreaterThanTen(x)) {
        }
    }

    private void task_3() {
        int x = 15;
        if (isLessThanTen(x)) {

        } else if (isGreaterThanOrEqualToTwenty(x)) {

        } else if (isBetweenTenAndTwenty(x)) {

        }
        x = 50;
        if (isGreaterThanOrEqualToTwenty(x)) {

        } else if (isLessThanTen(x)) {

        } else if (isBetweenTenAndTwenty(x)) {

        }
    }

    private void task_4() {
        int x = 15;
        if (isInRange(x)) {
        } else if (isOutOfRange(x)) {
        }
        x = 5;
        if (isInRange(x)) {
        } else if (isOutOfRange(x)) {
        }
    }

    private void task_5() {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        try {
            x = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Whole numbers please");
        }
        System.out.println(getGrade(x));
    }

    private void task_6() {
        Scanner scan = new Scanner(System.in);
        int x = -1;
        try {
            x = scan.nextInt();
        } catch (Exception e) {
            System.out.println("whole numbers please");
        }
        System.out.println(getWeekday(x));
    }

    private void task_7() {
        Scanner scan = new Scanner(System.in);
        String fStatus = new String();
        int income = 0;
        try {
            System.out.println("Enter filing status");
            fStatus = scan.nextLine();
            System.out.println("Enter Income to nearest dollar");
            income = scan.nextInt();
            int status = parseStatus(fStatus);
            displayTax(income, status);
        } catch (Exception e) {
            System.out.println("Ya messed up");
        }
    }

    private boolean isLessThanTen(int x) {
        if (x < 10) {
            System.out.println("Less than 10");
            return true;
        }
        return false;
    }

    private boolean isGreaterThanTen(int x) {
        if (x > 10) {
            System.out.println("Greater than 10");
            return true;
        }
        return false;
    }

    private boolean isBetweenTenAndTwenty(int x) {
        if (10 < x && x < 20) {
            System.out.println("Between 10 and 20");
            return true;
        }
        return false;
    }

    private boolean isGreaterThanOrEqualToTwenty(int x) {
        if (x >= 20) {
            System.out.println("Greater than or equal to 20");
            return true;
        }
        return false;
    }

    private boolean isOutOfRange(int x) {
        if (x > 20 || x < 10) {
            System.out.println("out of range");
            return true;
        }
        return false;
    }

    private boolean isInRange(int x) {
        if (x <= 20 && x >= 10) {
            System.out.println("in range");
            return true;
        }
        return false;
    }

    private String getGrade(int x) {
        if (x > 100 || x < 0) {
            return "Score out of range";
        } else if (x < 60) {
            return "F";
        } else if (x < 70) {
            return "D";
        } else if (x < 80) {
            return "C";
        } else if (x < 90) {
            return "B";
        } else if (x <= 100) {
            return "A";
        }
        return "Wait, what?";
    }

    private String getWeekday(int x) {
        String day;
        switch (x) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday;";
                break;
            case 5:
                day = "Thurday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Out of range";
        }
        return day;
    }

    private int parseStatus(String status) {
        status.trim();
        status.toLowerCase();
        if (status.equals("single")) {
            return 1;
        } else if (status.equals("married filing jointly")) {
            return 2;
        } else if (status.equals("married filing separately")) {
            return 3;
        } else if (status.equals("head of household")) {
            return 4;
        } else {
            System.out.println("filing status misspelled, try again");
        }
        return 0;
    }

    private void displayTax(int income, int status) {
        int tax = 0;
        switch (status) {
            case 1:
                if (income < 0) {
                    System.out.println("invalid income");
                } else if (income < 8351) {
                    tax = 10;
                } else if (income < 33951) {
                    tax = 15;
                } else if (income < 82251) {
                    tax = 25;
                } else if (income < 171551) {
                    tax = 28;
                } else if (income < 372951) {
                    tax = 33;
                } else {
                    tax = 35;
                }
                break;
            case 2:
                if (income < 0) {
                    System.out.println("invalid income");
                } else if (income < 16701) {
                    tax = 10;
                } else if (income < 67901) {
                    tax = 15;
                } else if (income < 137051) {
                    tax = 25;
                } else if (income < 208851) {
                    tax = 28;
                } else if (income < 372951) {
                    tax = 33;
                } else {
                    tax = 35;
                }
                break;
            case 3:
                if (income < 0) {
                    System.out.println("invalid income");
                } else if (income < 8351) {
                    tax = 10;
                } else if (income < 33951) {
                    tax = 15;
                } else if (income < 68526) {
                    tax = 25;
                } else if (income < 104426) {
                    tax = 28;
                } else if (income < 186476) {
                    tax = 33;
                } else {
                    tax = 35;
                }
                break;
            case 4:
                if (income < 0) {
                    System.out.println("invalid income");
                } else if (income < 11951) {
                    tax = 10;
                } else if (income < 45501) {
                    tax = 15;
                } else if (income < 117451) {
                    tax = 25;
                } else if (income < 190201) {
                    tax = 28;
                } else if (income < 372951) {
                    tax = 33;
                } else {
                    tax = 35;
                }
                break;
        }
        System.out.println("your tax bracket is " + tax + "%");
    }
}

