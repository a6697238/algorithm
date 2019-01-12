package com.algorithm.analyze.leetcode.string;

/**
 * AUTO-GENERATED: houlu @ 2019/1/10 下午11:29
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int div = 1;
        while (x / div >= 10) div *= 10;
        while (x > 0) {
            int left = x / div;
            int right = x % 10;
            if (left != right) return false;
            x = (x % div) / 10;
            div /= 100;
        }
        return true;

    }



}
