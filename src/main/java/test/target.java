package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class target {


    public static boolean palindrome_int(int target) {
        String text = Integer.toString(target);
        System.out.println(text);
        String result = "";

        Stack<Character> stack = new Stack<>();

        for (char ch : text.toCharArray()) {
            stack.push(ch);
        }

        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result.equals(text);

    }

    public static void duplicate_string_array(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;


        for (String ch : arr) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
//        System.out.println(map);

        for (String key : map.keySet()) {
            if (map.get(key) > 1) {
                count++;
                System.out.println("Key is " + key + " Count is " + map.get(key));
            }

        }

    }

    public static void majority_elements(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>(); // create hashmap
        //check for key exist

        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            }     //check for if key does not exist
            else {
                map.put(num, 1);
            }
        }
        int count = 0;
        for (int key : map.keySet()) {
            if (map.get(key) > arr.length / 3) {
                count++;
                System.out.println(key + " count " + map.get(key));
            }

        }


    }

    public static void union_element(int[] arr,int[] arrtwo)
    {
        //union of two arrays
        HashSet <Integer> hashSet = new HashSet<>();

        for (int num:
             arr) {
            hashSet.add(num);
        }
        for (int num2:
             arrtwo) {
            hashSet.add(num2);
        }


        System.out.println(hashSet);


    }
    public static void inersection_element(int[] arr,int[] arrtwo)
    {
        //intersection of two arrays
        HashSet <Integer> hashSet = new HashSet<>();
        int count=0;

        for (int num: arr) {
            hashSet.add(num);
        }

        for (int num:arrtwo) {
            if (hashSet.contains(num)){
                count++;
                hashSet.add(num);
                hashSet.remove(num);
            }
        }
        System.out.println(count);






    }


    public static void main(String[] args) {


        int[] arr = {1,2,3,4};
        int[] arr2 = {5,6,1,3,4};


        inersection_element(arr,arr2);


    }
}
