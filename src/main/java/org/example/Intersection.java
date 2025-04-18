package org.example;

import java.util.HashSet;

public class Intersection {

    public static void intersection_two_arrays(int[] arr1, int[] arr2)
    {
        //Intersection of two arrays

        HashSet<Integer> hashSet = new HashSet<>();
        for (int num:arr1) {
            hashSet.add(num);

        }
        int count =0;

        for (int j : arr2) {
            if (hashSet.contains(j)) {
                count++;
                hashSet.remove(j);
            }
        }
        System.out.println(count);


    }


    public static void main(String[] args) {

        int[] arr1 = {7,3,9};
        int[] arr2 = {6,3,9,2,9,4};
        intersection_two_arrays(arr1, arr2);


    }

}
