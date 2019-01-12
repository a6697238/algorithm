package com.algorithm.analyze.leetcode.string;

/**
 * AUTO-GENERATED: houlu @ 2019/1/12 上午11:27
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class ValidPalindrome {

    public static  boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1 ;
        char[] array = s.toCharArray();
        while (left < right) {
            if (!isAlphaNum(array[left])) ++left;
            else if (!isAlphaNum(array[right])) --right;
            else if ((array[left] + 32 - 'a') %32 != (array[right] + 32 - 'a') % 32) return false;
            else {
                ++left; --right;
            }
        }
        return true;
    }
    public static   boolean isAlphaNum(char ch) {
        if (ch >= 'a' && ch <= 'z') return true;
        if (ch >= 'A' && ch <= 'Z') return true;
        if (ch >= '0' && ch <= '9') return true;
        return false;
    }

}
