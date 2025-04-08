package org.example;

import java.util.Arrays;

public class LCP {

    // longest common prefix

    public static String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        StringBuilder res = new StringBuilder();
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        for (int i = 0; i < first.length; i++) {
            if (first[i] != last[i])
                break;

            else
                res.append(first[i]);
        }
        return res.toString();

    }


    public static void main(String[] args) {

        String[] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));


    }
}
