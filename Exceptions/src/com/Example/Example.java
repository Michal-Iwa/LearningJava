package com.Example;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        try{
            int result = divide();
            System.out.println(result);
        }
        catch (ArithmeticException | NoSuchElementException e){
            System.out.println(e.toString());
            System.out.println("Unable to divide");
        }

    }
    public static int divide(){
        int x, y;
//        try {
        x = getInt();
        y = getInt();
        System.out.println(x + " " + y);
        return x/y;
//        }
//        catch(NoSuchElementException e){
//            throw new ArithmeticException("no suitable input!");
//        }
//        catch (ArithmeticException e) {
//            throw new ArithmeticException("dividing by 0");
//        }
    }
    public static int getInt(){
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("Enter an Integer: ");
            try{
                return s.nextInt();
            }
            catch(InputMismatchException e){
                s.nextLine();
            }
        }
    }
}
