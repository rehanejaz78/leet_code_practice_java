package test;

import java.util.Stack;

public abstract class Learn {

    public static void palindrome(String text) {

        Stack<Character> stack = new Stack<>();
        String result = "";
        for (char c : text.toCharArray()) {
            stack.push(c);
        }


        while (!stack.isEmpty()) {

            result = result + stack.pop();
        }

        if (text.equalsIgnoreCase(result.toLowerCase())) {
            System.out.println("string is palindrome");

        } else {
            System.out.println("String is not a palindrome");
        }



        // star triangle


    }

    public static boolean palindrom(String text){

        StringBuilder string = new StringBuilder();
        return  string.reverse().equals(text);
    }


    public static void main(String[] args) {

        String text = "Civic";
        palindrome(text);


    }

}

