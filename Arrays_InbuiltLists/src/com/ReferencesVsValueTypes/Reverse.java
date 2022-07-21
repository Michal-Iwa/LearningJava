package com.ReferencesVsValueTypes;

import java.util.Arrays;

public class Reverse {
    public static void main (String [] args){
        int [] array = {2,4,2,4,5,6,7,4,3};
        reverse(array);
    }
    private static void reverse (int [] array){
        int temp = 0;
        System.out.println("Array = " + Arrays.toString(array));
        for(int i = 0; i< array.length/2; i++){
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
