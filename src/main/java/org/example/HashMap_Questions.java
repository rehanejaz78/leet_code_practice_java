
package org.example;

import java.util.HashMap;

public class HashMap_Questions {

    public static void frequency(int[] num)   // checking if frequency of any number is greater than n/3
    {
        // create hashmap to store frequency counts
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = num.length;
        // check if key exist and not
        for (int i = 0; i < n; i++) {

            if (map.containsKey(num[i]))
            {
                map.put(num[i],map.get(num[i])+1);
            }
            else
            {
                map.put(num[i],1);
            }
        }
//        System.out.println(map); // we have frequencies till here

        for (int key: map.keySet()){
            if (map.get(key) > n/3 ) {
                System.out.println(key);
            }

        }



    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 5, 1, 3, 1, 5, 1,2,2,2,2};
        int[] arr2 = {1, 2};
//        frequency(arr);
        frequency(arr2);

    }

}
