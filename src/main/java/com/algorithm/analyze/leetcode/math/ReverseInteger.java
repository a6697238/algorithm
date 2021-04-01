package com.algorithm.analyze.leetcode.math;

/**
 * AUTO-GENERATED: houlu @ 2019/1/11 下午10:32
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class ReverseInteger {

    public static void main(String[] args) {
        reverse(1534236469);
    }

    public static int reverse(int x) {


        int res = 0;
        boolean isNeg = false;
        if(x<0){
            x = -x;
            isNeg = true;
        }

        while (x>0){
            if (res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE / 10 && x%10 > 7)) return 0;
            if (res < Integer.MIN_VALUE/10 || (res == Integer.MIN_VALUE / 10 && x%10 < -8)) return 0;
            res = res * 10 + x%10;
            x = x/10;
        }
        if(isNeg){
            res = -res;
        }

        return res;

    }

}
