package com.perscholas.java_basics;

public class Java_Operators_and_Numbers {
    public static void main(String[] args) {
        Java_Operators_and_Numbers i = new Java_Operators_and_Numbers();
        i.task_1(2);
        i.task_1(9);
        i.task_1(17);
        i.task_1(88);
        i.task_2(150);
        i.task_2(225);
        i.task_2(1555);
        i.task_2(32456);
        i.task_3();
        i.task_5();
        i.task_6();
        i.task_7();
    }

    /*Write a program that declares an integer a variable x, assigns the value 2 to it, and prints out the binary string version of the number
        ( Integer.toBinaryString(x) ). Now, use the left shift operator (<<) to shift by 1 and assign the result to x. Before printing the results,
        write a comment with the predicted decimal value and binary string. Now, print out x in decimal form and in binary notation.

        Perform the preceding exercise with the following values:
        9
        17
        88 */
    public void task_1(int a) {
        int x = a;
        System.out.println(Integer.toBinaryString(x));
        x = x << 1;
        //predicted value 4, 100
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
    }

    /*Write a program that declares a variable x, and assigns 150 to it, and prints out the binary string version of
    the number. Now use the right shift operator (>>) to shift by 2 and assign the result to x. Write a comment
    indicating what you anticipate the decimal and binary values to be. Now print the value of x and the binary string.
    Perform the preceding exercise with the following values:
            225
            1555
            32456*/
    public void task_2(int a) {
        int x = a;
        System.out.println(Integer.toBinaryString(x));
        x = x << 1;
        //predicted value  100101100 (4+8+32+256= 300)
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
    }

    /*Write a program that declares three int variables: x, y, and z. Assign 7 to x and 17 to y. Write a comment that
    indicates what you predict will be the result of the bitwise and operation on x and y. Now use the bitwise and
    operator to derive the decimal and binary values, and assign the result to z.
     */
    public void task_3() {
        int x = 7;
        int y = 17;
        int z;
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(y));
        //Prediction: 1, 1
        z = x & y;
        System.out.println(z);
        System.out.println(Integer.toBinaryString(z));
        /*Now, with the preceding values, use the bitwise and operator to calculate the “or” value between x and y.
        As before, write a comment that indicates what you predict the values to be before printing them out.*/
        //Prediction: 10111, (1+2+4+16=23)
        z = x | y;
        System.out.println(z);
        System.out.println(Integer.toBinaryString(z));
    }

    /*Write a program that declares an integer variable, assigns a number, and uses a postfix increment operator to
    increase the value. Print the value before and after the increment operator.*/
    public void task_5() {
        int x = 12;//my lucky number
        System.out.println(x);
        x++;
        System.out.println(x);
    }

    /*Write a program that demonstrates at least three ways to increment a variable by 1 and does this multiple times.
    Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1, and then print it again.*/
    public void task_6() {
        int x = 12;
        System.out.println(x);
        x = x | 1;//works cause even number XD
        System.out.println(x);
        x++;
        System.out.println(x);
        x = x + 1;
        System.out.println(x);
    }

    /*Write a program that declares two integer variables: x, and y, and then assigns 5 to x and 8 to y. Create another
     variable sum and assign the value of ++x added to y, and print the result. Notice the value of the sum (should
     be 14). Now change the increment operator to postfix (x++) and re-run the program. Notice what the value of the
     sum is. The first configuration incremented x, and then calculated the sum, while the second configuration
     calculated the sum, and then incremented x.
     */
    public void task_7() {
        int x = 5;
        int y = 8;
        int z;
        z = ++x + y;
        System.out.println(z);
        z = (x++) + y;
        System.out.println(z);
    }
}
