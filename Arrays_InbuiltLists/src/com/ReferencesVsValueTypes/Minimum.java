package com.ReferencesVsValueTypes;

import java.util.Scanner;

public class Minimum {

    public static void main (String [] args){
        int count = readInteger();
        int [] intArray = readElements(count);
        System.out.println(findMin(intArray));
    }
    private static int readInteger(){
        Scanner scanner = new Scanner (System.in);
        return scanner.nextInt();
    }
    private static int [] readElements(int count){
        Scanner scanner = new Scanner (System.in);
        int[] intArray = new int [count];
        for(int i =0; i < count; i++){
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }
    private static int findMin(int [] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++)
            if(min > array[i]) min = array[i];
        return min;
    }
}
