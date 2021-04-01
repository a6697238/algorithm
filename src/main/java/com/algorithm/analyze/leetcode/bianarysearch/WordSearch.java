package com.algorithm.analyze.leetcode.bianarysearch;

/**
 * AUTO-GENERATED: houlu @ 2019/1/12 上午12:37
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class WordSearch {

    public static void main(String[] args) {
        char[][] board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};
        System.out.println(exist(board, "ABCCED"));

//        char[][] board = new char[][]{{'a'}};
//        System.out.println(exist(board, "a"));

//        char[][] board = new char[][]{{'a'}};
//        System.out.println(exist(board, "a"));
    }

    public static boolean exist(char[][] board, String word) {
        boolean res = false;
        boolean[][] visited = new boolean[board.length][board[0].length];
        if (board.length == 0 || board[0].length == 0) {
            return false;
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfsStr(visited, board, i, j, 0, word)) {
                    return true;
                }
            }
        }
        return res;
    }

    public static boolean dfsStr(boolean[][] visited, char[][] board, int i, int j, int pos,
            String str) {
        int m = board.length;
        int n = board[0].length;
        boolean hasWord = false;

        if (pos == str.length()) {
            return true;
        }

        if (!isValid(m, n, i, j)) {
            return false;
        }

        if (visited[i][j]) {
            return false;
        }
        if (str.charAt(pos) != board[i][j]) {
            return false;
        }


        visited[i][j] = true;

        hasWord = hasWord || dfsStr(visited, board, i + 1, j, pos + 1, str)
                || dfsStr(visited, board, i , j+1, pos + 1, str)
                || dfsStr(visited, board, i-1 , j, pos + 1, str)
                || dfsStr(visited, board, i , j-1, pos + 1, str);

        visited[i][j] = false;

        return hasWord;
    }


    public static boolean isValid(int m, int n, int i, int j) {
        return i < m && j < n && i >= 0 && j >= 0;
    }


}
