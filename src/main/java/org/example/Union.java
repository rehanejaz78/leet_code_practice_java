package org.example;

import java.util.HashMap;
import java.util.HashSet;

public class Union {

    public static void union_two_arrays(int[] arr1, int[] arr2)
    {
        //Union of two arrays

        HashSet<Integer> set = new HashSet<>();

        for (int num:arr1) {
            set.add(num);
        }
        for (int num: arr2) {
            set.add(num);
        }

        System.out.println("Size of union : " + set.size());


    }


    public static void main(String[] args) {

        int[] arr1 = {7,3,9};
        int[] arr2 = {6,3,9,2,9,4};
        union_two_arrays(arr1, arr2);


    }

}
