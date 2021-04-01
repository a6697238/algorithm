package com.algorithm.analyze.leetcode.dp;

/**
 * AUTO-GENERATED: houlu @ 2019/1/12 上午12:26
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class MinimumPathSum {

    public int minPathSum(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = grid[i][j];
                if(isValid(m,n,i-1,j-1)){
                    dp[i][j] = Math.min(dp[i][j-1],dp[i-1][j]) + dp[i][j];
                }else if(isValid(m,n,i-1,j)){
                    dp[i][j] = dp[i-1][j] + dp[i][j];
                }else if(isValid(m,n,i,j-1)){
                    dp[i][j] = dp[i][j-1] + dp[i][j];
                }
            }
        }

        return dp[m-1][n-1];
    }


    public static boolean isValid(int m, int n, int i, int j) {
        return i < m && j < n && i >= 0 && j >= 0;
    }

}
