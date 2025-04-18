package org.example;

import java.util.HashMap;

public class HashMap_Questions {

    public static void frequency(int[] arr)   // checking if frequency of any number is greater than n/3
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key) > n / 3)
                System.out.print(key + ",");

        }


    }


    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        int[] arr2 = {1, 2};
        frequency(arr2);


    }

}
