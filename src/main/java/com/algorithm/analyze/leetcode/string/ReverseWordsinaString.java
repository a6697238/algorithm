package com.algorithm.analyze.leetcode.string;

/**
 * AUTO-GENERATED: houlu @ 2019/1/13 下午9:18
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class ReverseWordsinaString {

    public static void main(String[] args) {
        System.out.println(reverseWords("   a   b "));

    }

    public static String reverseWords(String s) {
        if (s == null || s.trim().length() == 0) {
            return "";
        }
        String[] strArray = s.trim().split(" ");
        int start = 0;
        int end = strArray.length - 1;
        while (end > start) {
            String temp = strArray[start];
            strArray[start] = strArray[end];
            strArray[end] = temp;
            end--;
            start++;
        }
        String res = "";
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].trim().length() > 0) {
                res = res + strArray[i].trim() + " ";
            }
        }
        return res.substring(0, res.length() - 1);
    }

}
