package org.example;

public class table {

    public static void print_table(int num) {
        if (num <= 0) {
            System.out.println("Invalid number");
            return;
        }
        System.out.println("Table of " + num);
        for (int i = 1; i <= 10; i++) {


            System.out.println(num + " X " + i + " = " + num * i);

        }
    }


    public static void main(String[] args) {
        print_table(1);
    }

}
