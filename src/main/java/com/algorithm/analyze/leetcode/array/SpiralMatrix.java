package com.algorithm.analyze.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * AUTO-GENERATED: houlu @ 2019/1/11 下午10:48
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class SpiralMatrix {


    public static void main(String[] args) {
//        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix = new int[][]{{6,9,7}};

        spiralOrder(matrix);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        if (matrix.length == 0 || matrix[0].length == 0) {
            return list;
        }

        int a = 0;
        int b = 0;
        int c = matrix.length - 1;
        int d = matrix[0].length - 1;

        while (isValid(a, b, c, d)) {
            printArray(list, matrix, a, b, c, d);
            a++;
            b++;
            c--;
            d--;
        }

        return list;

    }

    public static void printArray(List<Integer> result, int[][] matrix, int a, int b, int c,
            int d) {
        int i = a;
        int j = b;

        if (a == c && b == d) {
            result.add(matrix[a][b]);
            return;
        }
        while (j < d) {
            result.add(matrix[i][j]);
            j++;
        }
        while (i < c) {
            result.add(matrix[i][j]);
            i++;
        }
        while (j > b) {
            result.add(matrix[i][j]);
            j--;
        }
        while (i > a) {
            result.add(matrix[i][j]);
            i--;
        }
    }

    public static boolean isValid(int a, int b, int c, int d) {
        return (c >= a && d >= b) && (a >= 0 && b >= 0 && c >= 0 && d >= 0);
    }

}
