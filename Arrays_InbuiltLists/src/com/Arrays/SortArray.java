package com.Arrays;

import java.util.Scanner;

public class SortArray {
    public static void main (String [] args){
        int [] intArray = getIntegers(5);
        intArray = sortIntegers(intArray);
        printArray(intArray);
    }
    public static int [] getIntegers(int amount){
        Scanner scanner = new Scanner (System.in);
        int[] intArray = new int [amount];
        for(int i =0; i < amount; i++){
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }
    public static void printArray (int [] intArray){
        for (int i = 0; i < intArray.length; i++){
            System.out.println("Element "+ i + " contents " + intArray[i]);
        }
    }
    public static int [] sortIntegers (int [] intArray){
        int temp;
        for(int i = 0; i < intArray.length; i++){
            for(int j = 1; j < intArray.length; j++){
                if (intArray[j-1] < intArray[j]){
                    temp = intArray[j-1];
                    intArray[j-1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        return intArray;
    }
}
