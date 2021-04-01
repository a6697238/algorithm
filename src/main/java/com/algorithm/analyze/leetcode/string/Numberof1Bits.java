package com.algorithm.analyze.leetcode.string;

/**
 * AUTO-GENERATED: houlu @ 2019/1/12 下午11:40
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class Numberof1Bits {

    public int hammingWeight(int n) {
        int res = 0;
        for (int i=0;i<32;i++){
            if((n&1)==1) {
                res++;
            }
            n = n >> 1;
        }
        return res;
    }

}
