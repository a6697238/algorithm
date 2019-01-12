package com.algorithm.analyze.leetcode.dp;

/**
 * AUTO-GENERATED: houlu @ 2019/1/11 下午11:26
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class UniquePaths {

    public static void main(String[] args) {
        uniquePaths(3, 2);
    }

    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        if (m == 0 || n == 0) {
            return 0;
        }
        dp[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isValid(m, n, i - 1, j) && isValid(m, n, i, j - 1)) {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                } else if (isValid(m, n, i, j - 1)) {
                    dp[i][j] = dp[i][j - 1];
                } else if (isValid(m, n, i - 1, j)) {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[m - 1][n - 1];

    }

    public static boolean isValid(int m, int n, int i, int j) {
        return i < m && j < n && i >= 0 && j >= 0;
    }

}
