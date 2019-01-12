package com.algorithm.analyze.leetcode.dp;

/**
 * AUTO-GENERATED: houlu @ 2019/1/11 下午11:26
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class UniquePaths2 {


    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid.length == 0 || obstacleGrid[0].length == 0) {
            return 0;
        }
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];

        if(obstacleGrid[0][0] == 1){
            return 0;
        }
        dp[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isValid(m, n, i - 1, j) && isValid(m, n, i, j - 1)) {
                    if (obstacleGrid[i][j] == 0) {
                        dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                    } else {
                        dp[i][j] = 0;
                    }
                } else if (isValid(m, n, i, j - 1)) {
                    if (obstacleGrid[i][j] == 0) {
                        dp[i][j] = dp[i][j - 1];
                    } else {
                        dp[i][j] = 0;
                    }

                } else if (isValid(m, n, i - 1, j)) {
                    if (obstacleGrid[i][j] == 0) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = 0;
                    }
                }
            }
        }

        return dp[m - 1][n - 1];

    }

    public static boolean isValid(int m, int n, int i, int j) {
        return i < m && j < n && i >= 0 && j >= 0;
    }

}
