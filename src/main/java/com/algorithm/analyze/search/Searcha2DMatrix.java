package com.algorithm.analyze.search;

/**
 * AUTO-GENERATED: houlu @ 2019/1/12 下午10:48
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class Searcha2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if(m == 0) return false;
        int n = matrix[0].length;
        int min = 0, max = m * n - 1;
        while(min <= max){
            int mid = min + (max - min) / 2;
            int row = mid / n;
            int col = mid % n;
            if(matrix[row][col] == target){
                return true;
            } else if (matrix[row][col] < target){
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return false;

    }

}
