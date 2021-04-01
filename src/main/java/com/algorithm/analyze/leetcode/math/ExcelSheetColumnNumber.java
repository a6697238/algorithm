package com.algorithm.analyze.leetcode.math;

/**
 * AUTO-GENERATED: houlu @ 2019/1/12 下午12:33
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {
        int sum = 0;
        int tmp = 0;
        char[] array = s.toCharArray();
        for (int i = 0; i < s.length(); ++i) {
            tmp = array[i] - 'A' + 1;
            sum = 26 * sum + tmp;
        }
        return sum;

    }
}
