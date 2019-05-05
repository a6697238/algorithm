package com.algorithm.analyze.leetcode.dp;

/**
 * AUTO-GENERATED: houlu @ 2019/1/11 下午11:26
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class UniquePathsRec2 {


    public static void main(String[] args) {
        System.out.println(uniquePaths2(3, 2));

    }

    //动态规划递归
    public static int uniquePaths2(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        } else {
            return uniquePaths2(m - 1, n) + uniquePaths2(m, n - 1);
        }
    }

}
