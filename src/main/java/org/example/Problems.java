package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problems {

    public static int countVowels(String input){
        int count = 0;

        String vowels = "aoueåeiöyäAOUÅEIÖYÄ";

        // input: "Hej!" --> ["H", "e", "j", "!"]
        for (char c : input.toCharArray()){
            int index = vowels.indexOf(c);

            if (index != -1){
                count ++;
            }
        }
        return count;
    }

    // given index is for the given list
    public static int returnIndex(List<String> listname , int i){

        // if statement to check if i is more than listlength or less than 0
        if (i > listname.size()-1 || i<0){
            System.out.println("Invalid index");
            return -1;
        }

        // else statement if correct index is given
        else {
            String output = listname.get(i);
            System.out.println(output); // is the content of the given index
            return i;
        }

    }

    //method for sorting
    public static void bubbleSort(int[] arr){
            int n = arr.length;
            int temp = 0;
            for(int i=0; i < n; i++){
                for(int j=1; j < (n-i); j++){
                    if(arr[j-1] > arr[j]){
                        //swap elements
                        temp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

        }


    // method do check if given String is a pallindrome
    public static boolean isPalindrome(String text) {
        String cleanedText = text.toLowerCase();
        cleanedText = cleanedText.replace(" ",""); // Removes all spaces
        cleanedText = cleanedText.replaceAll("[^a-zA-Z0-9_-]", ""); // Removes all special characters

        int left = 0, right = cleanedText.length() - 1;

        while (left < right) {
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public long calculateFactorial(int number){

        if (number<0) {
            throw new IllegalArgumentException();
        }

        long product = 1;

        for (int i = number; i > 0; i--) {
            product*=i;
        }
        return product;
    }


    public static int[] SortIntegers_BuiltIn(int [] input){
        Arrays.sort(input); // built in sort method

        return input;
    }

    public static int[] SortIntegers_Manual(int[] input){

        // Create a new array of same size as input
        int[] sorted = new int[input.length];

        for (int i = 0; i < input.length; i++) {

            //  0  1  2  3
            // [x, x, x, x] <-- input
            // minsta = 4 & minsta index = 0
            // [1, 2, 3, 4] <-- sorted

            /* Find smallest value in array */
            int smallest = Integer.MAX_VALUE; // Use Integer.MAX_VALUE to represent unset value
            int smallestIndex = -1;

            for (int j = 0; j < input.length; j++) { // For every int in array

                //  0  1  2  3
                // [2, x, 1, 4]
                // minsta = 1
                // minsta index = 2

                int current = input[j];
                // Check if current is lower than smallest
                if(current < smallest){
                    // Save current (new smallest) to smallest
                    smallest = current;
                    smallestIndex = j;
                }
            }
            /* /Find smallest value in array */

            // smallest = minsta numret

            // Spara smallest & stryka det ur arrayen
            sorted[i] = smallest; // Save smallest value
            input[smallestIndex] = Integer.MAX_VALUE; // Delete smallest value in input

        }

        // Skicka tillbaka nya sorterade arrayen
        return sorted;
    }

    public static int LinearSearch(int[] arrayToSearch, int numberToSearchFor){

        // Loop over each number in array
        for (int i = 0; i < arrayToSearch.length; i ++){

            // Save current number to a new int
            int current = arrayToSearch[i];

            // Check if current is what we are searching for
            if (current == numberToSearchFor){

                // if so, return it
                return i;
            }
        }

        return -1; // if the searched number does not exit
    }

    public static int BinarySearch(int[] array, int target){
        int left = 0;
        int right = array.length - 1;

        while (left <= right){
            int mid = left + (right - left) / 2;
            if (array[mid] == target){
                return mid;
            }
            if (array[mid] < target){
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        return -1;
    }


    public static int FibonacciSeries(long number){
        long firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + number + " terms:");

        for (int i = 1; i <= number; ++i) {
            System.out.print(firstTerm + ", ");

            // compute the next term
            long nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        return 1;
    }

}
