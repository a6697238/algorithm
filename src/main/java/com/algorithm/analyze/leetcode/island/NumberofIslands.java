package com.algorithm.analyze.leetcode.island;

/**
 * AUTO-GENERATED: houlu @ 2019/1/7 下午11:43
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class NumberofIslands {

    public static void main(String[] args) {
//        String[][] test = {{"1", "1", "1", "1", "0"}, {"1", "1", "0", "1", "0"},
//                {"1", "1", "0", "0", "0"}, {"0", "0", "0", "0", "0"}};

        String[][] test = {{"1", "1", "0", "0", "0"}, {"1", "1", "0", "0", "0"}, {
                "0", "0", "1", "0", "0"}, {"0", "0", "0", "1", "1"}};

        char[][] arrays = new char[test.length][test[0].length];
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[0].length; j++) {
                String str = test[i][j];
                arrays[i][j] = str.toCharArray()[0];
            }
        }
        numIslands(arrays);
    }


    public static int numIslands(char[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    res++;
                    dfs(i, j, grid);
                }
            }
        }
        return res;
    }


    public static void dfs(int i, int j, char[][] array) {
        if (!isValid(i, j, array) || array[i][j] == '0') {
            return;
        } else {
            array[i][j] = '0';
            dfs(i + 1, j, array);
            dfs(i - 1, j, array);
            dfs(i, j + 1, array);
            dfs(i, j - 1, array);
            print(array);
            System.out.println("---------------------");
        }
    }

    public static boolean isValid(int i, int j, char[][] array) {
        return i < array.length && i >= 0 && j < array[0].length && j >= 0;
    }

    public static void print(char[][] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
//                String uniCodeTemp = Integer.toHexString(array[i][j]);
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

}
