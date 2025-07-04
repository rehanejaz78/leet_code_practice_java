package org.example;

import java.util.HashMap;
import java.util.HashSet;

public class Union {

    public static int union_two_arrays(int arr1[], int arr2 [])
    {
        //Union of two arrays

        HashSet<Integer> set = new HashSet<>();
        for (int number :arr1) {
            set.add(number);

        }
        for (int number :arr2) {
            set.add(number);

        }


        return set.size();

    }


    public static void main(String[] args) {

        int[] arr1 = {7,3,9};
        int[] arr2 = {6,3,9,2,9,4};
        System.out.println(union_two_arrays(arr1,arr2));



    }

}
