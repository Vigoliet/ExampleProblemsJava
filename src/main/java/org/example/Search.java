package org.example;

public class Search {
    public static void main(String[] args) {

        int [] searchPlace = {1,2,3,4,5};

        // Linear searches through whole array, doesn't need to be sorted
        int foundIndex = Problems.LinearSearch(searchPlace, 3);
        System.out.println(foundIndex);

        // Binary search, does have to be sorted
        int foundIndex2 = Problems.BinarySearch(searchPlace, 3);
        System.out.println(foundIndex2);


    }
}
