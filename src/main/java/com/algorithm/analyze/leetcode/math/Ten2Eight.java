package com.algorithm.analyze.leetcode.math;

/**
 * AUTO-GENERATED: houlu @ 2019/1/12 下午12:51
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class Ten2Eight {

    public static void main(String[] args) {

        System.out.println(eight(8));

    }

    public static int eight(int n){
        int res = 0;
        while (n>0){
            int temp =  n/10;
            res = temp + res * 8;
            n = n/10;
        }
        return res;
    }

}
