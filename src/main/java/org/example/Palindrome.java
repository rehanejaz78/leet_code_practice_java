package org.example;


import java.util.Arrays;
import java.util.Stack;

public class Palindrome {
    public static void verify_palindrome(String text) {

        Stack<Character> stack = new Stack<>();
        StringBuilder rev = new StringBuilder();
        for (char c : text.toCharArray()) {
            stack.push(c);

        }

        while (!stack.isEmpty()) {
            rev.append(stack.pop());
        }
        if (rev.toString().equalsIgnoreCase(text.toLowerCase())) {
            System.out.println("String is a palindrome");
        } else
            System.out.println("Not a palindrome");


    }

    public static void reverseString(char[] s) {

        int left = 0, right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }

        char[] ch = {'c', 'i', 'v', 'i', 'c'};
        System.out.println(Arrays.equals(s, ch));


    }

    public static void reverse_recursion(int[] arr, int start, int end) {

        if (start >= end) {
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverse_recursion(arr, start + 1, end - 1);


    }


    public static void main(String[] args) {

//        String text = "a Civic a";
//        verify_palindrome(text);
        char[] s = {'c', 'i', 'v', 'i', 'c'};
        int[] arr = {1, 3, 5, 6, 7};
//        reverseString(s);


        reverse_recursion(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.println(num);

        }


    }

}