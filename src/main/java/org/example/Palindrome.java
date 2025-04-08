package org.example;


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

        int left = 0, right = s.length -1;

        while (left< right)
        {
            char temp = s [left];
            s[left] = s[right];
            s[right] = temp;

            left ++;
            right --;
        }


    }


    public static void main(String[] args) {

//        String text = "a Civic a";
//        verify_palindrome(text);
        char [] s  =   {'h','e','l','l','o'};
        reverseString(s);


    }

}