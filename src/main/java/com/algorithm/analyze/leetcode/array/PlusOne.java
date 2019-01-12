package com.algorithm.analyze.leetcode.array;

/**
 * AUTO-GENERATED: houlu @ 2019/1/12 上午8:18
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class PlusOne {

    public static void main(String[] args) {
        plusOne(new int[]{9});
    }

    public static int[] plusOne(int[] digits) {
        int[] res = new int[digits.length];
        int carry = 1;
        res[0] = 0;
        for (int j = res.length - 1; j >= 0; j--) {
            if (digits[j] == 9 && carry == 1) {
                res[j] = 0;
                carry = 1;
            } else {
                res[j] = digits[j] + carry;
                carry = 0;
            }
        }
        if (carry == 1) {
            res = new int[digits.length + 1];
            res[0] = 1;
            for (int i = 1; i < res.length; i++) {
                res[i] = 0;
            }
        }

        return res;

    }

}
