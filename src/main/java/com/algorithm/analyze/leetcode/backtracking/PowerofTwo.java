package com.algorithm.analyze.leetcode.backtracking;

/**
 * AUTO-GENERATED: houlu @ 2019/1/12 上午11:20
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class PowerofTwo {

    public boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%2==1){
            return false;
        }

        return isPowerOfTwo(n/2);
    }
}
