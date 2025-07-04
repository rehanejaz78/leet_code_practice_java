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

    public static String longestCommonPrefix_subString(String []strs)
    {
        Arrays.sort(strs);
        int index =0;
        String str1 = strs[0];
        String str2 = strs[strs.length-1];

        while (index < str1.length()){
            if (str1.charAt(index) == str2.charAt(index)){
                index++;
            }
            else
                break;

        }

    return index ==0? "": str1.substring(0,index);
    }

    public static void main(String[] args) {

        String[] strs = {"dog","docecar","dor"};
        System.out.println(longestCommonPrefix(strs));
        System.out.println(longestCommonPrefix_subString(strs));


    }
}
