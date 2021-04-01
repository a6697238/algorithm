package com.algorithm.analyze.leetcode.math;

/**
 * AUTO-GENERATED: houlu @ 2019/1/12 下午1:03
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class FactorialTrailingZeroes {

    public static void main(String[] args) {
        System.out.println(trailingZeroes(13));
    }

    public static int trailingZeroes(int n) {
        int count=0;
        while (n>0) {     //count the number of factor 5;
            count+=n/5;
            n/=5;
        }

        return count;
    }


}
