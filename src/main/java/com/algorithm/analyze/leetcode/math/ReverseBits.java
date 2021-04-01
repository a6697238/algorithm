package com.algorithm.analyze.leetcode.math;

/**
 * AUTO-GENERATED: houlu @ 2019/1/12 上午11:35
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class ReverseBits {

    public int reverseBits(int n) {

        int res = 0;
        for (int i = 0; i < 32; ++i) {
            if ((n & 1) == 1) {
                res = (res << 1) + 1;
            } else {
                res = res << 1;
            }
            n = n >> 1;
        }
        return res;
    }
}
