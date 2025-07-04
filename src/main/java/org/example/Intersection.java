package org.example;

import java.util.HashSet;

public class Intersection {

    public static void intersection_two_arrays(int[] arr1, int[] arr2)
    {
        //Intersection of two arrays
        int count=0;

        HashSet<Integer> set = new HashSet<>();
        for (int num: arr1) {
            set.add(num);
        }

        for (int num: arr2) {

            if (set.contains(num))
            {
                count++;
                set.remove(num);
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
