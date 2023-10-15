package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        // Search for vowels in string
        String testStr = "Programming is fun";

        System.out.println("Amount of vowels in string: " + Problems.countVowels(testStr));

        // Searches for an index in an array list
        List list = new ArrayList<String>();
        list.add("Hej");
        list.add("Hejdå");

        Problems.returnIndex(list, 1);



        // Bubble sort
        int [] array = {10,5,3,1,24,12};
        System.out.println("Before sort: " + Arrays.toString(array)); // before it's sorted
        Problems.bubbleSort(array);
        System.out.println("After sort: "+Arrays.toString(array)); // after it's sorted


        // Pallindrome
        String str = "heh";

        // if true value true is returned
        if (Problems.isPalindrome(str)){
            System.out.println("This is a pallindrome");

        // if false value is returned
        } else{
            System.out.println("This is not a pallindrome");
        }

    }

}