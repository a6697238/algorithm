package com.algorithm.analyze.leetcode.backtracking;

/**
 * AUTO-GENERATED: houlu @ 2019/1/13 下午8:24
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class LongestIncreasingPathinaMatrix {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{9, 9, 4}, {6, 6, 8}, {2, 1, 1}};
        longestIncreasingPath(matrix);
    }


    public static int longestIncreasingPath(int[][] matrix) {
        int res = Integer.MIN_VALUE;
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        int[][] dp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                dp[i][j] = 0;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                dp[i][j] = getPath(visited, matrix, dp, i, j, Integer.MIN_VALUE);
                res = Math.max(dp[i][j], res);

            }
        }

        return res;
    }


    public static int getPath(boolean[][] visited, int[][] matrix, int[][] dp, int i, int j,
            int val) {
        if (!isValid(matrix.length, matrix[0].length, i, j)) {
            return 0;
        }
        if (visited[i][j]) {
            return 0;
        }
        if (matrix[i][j] <= val) {
            return 0;
        }
        if (dp[i][j] > 0) {
            return dp[i][j];
        }

        visited[i][j] = true;
        val = matrix[i][j];
        int up = getPath(visited, matrix, dp, i - 1, j, val);
        int down = getPath(visited, matrix, dp, i + 1, j, val);
        int left = getPath(visited, matrix, dp, i, j - 1, val);
        int right = getPath(visited, matrix, dp, i, j + 1, val);

        visited[i][j] = false;

        int res = Math.max(up, down);
        res = Math.max(res, left);
        res = Math.max(res, right);
        return res + 1;

    }


    public static boolean isValid(int m, int n, int i, int j) {
        return i < m && j < n && i >= 0 && j >= 0;
    }
}
