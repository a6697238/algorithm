package com.algorithm.analyze.leetcode.backtracking;

/**
 * @author Lu Hou
 * @date 2017/10/9
 * @time 下午8:32
 */
public class CountNumberswithUniqueDigits {


    public static void main(String[] args) {
        System.out.println(countNumbersWithUniqueDigits(2));
    }

    public static int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        if (n == 1) return 10;
        int val = 9;
        int count = 10;
        for (int i = 2; i <= n; i++) {
            val = val * (9 - i + 2);
            count = val + count;
        }
        return count;
    }
}
