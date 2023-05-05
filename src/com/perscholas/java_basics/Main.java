package com.perscholas.java_basics;
import java.util.*;
public class Main {

    public static void main(String[] args) {

    }


    //1
    public static ArrayList<String> removeArrayListValue(ArrayList<String> list, String str) {
        for (int i=0; i< list.size();i++){
            if (list.get(i).equals(str)){
                list.remove(i);
            }
        }
        return list;
    }
    public static ArrayList<String> replaceArrayListValue(ArrayList<String> list, int index, String s) {
        list.set(index, s);
        return list;
    }
    public static void divide(){
        Scanner scan = new Scanner(System.in);
        try{
            int x = scan.nextInt();
            int y = scan.nextInt();
            x = x/y;
        }catch (ArithmeticException e) {System.out.println("Please do not use zero");}
        catch(InputMismatchException e) {System.out.println("Please only use integers");}
    }
}
class MyException extends Exception{
    public MyException(String message) {
        super(message);
    }
}
class TypingPractice{
    public static void typeABC(){
        Scanner scan = new Scanner(System.in);
        try {
            String abc = scan.nextLine();
            if (!abc.equals("abc")){
                throw new MyException("incorrect input");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}