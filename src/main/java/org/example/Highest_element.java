package org.example;

public class Highest_element {

    public static void nth_highest_element_array(int[] arr, int nth) {
        //nth highest element in array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

        }

        System.out.println(nth + "th highest element is : " + arr[nth - 1]);

    }


    public static void main(String[] args) {

        int[] arr2 = {6, 3, 10, 2, 9, 4};
        nth_highest_element_array(arr2, 1);


    }

}
