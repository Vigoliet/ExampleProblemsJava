package org.example;

import java.util.Arrays;

public class SortTest {

    public static void main(String[] args) {
        // Create unsorted array of numbers
        int[] unsorted = {5,3,8,1,2};

        // Uses manual sort
        int [] sorted = Problems.SortIntegers_Manual(unsorted);
        String output = Arrays.toString(sorted);
        System.out.println(output);


        // Sort array with built-in function
        //int[] sortedBuiltIn = Problems.SortIntegers_BuiltIn(unsorted); // var --> int []

        /*
        // Create String of number from array
        String output = Arrays.toString(sortedBuiltIn);
        System.out.println(output);*/

        /*Problems.SortIntegers_Manual(unsorted);
        System.out.println(Arrays.toString(unsorted)); */


    }
}
