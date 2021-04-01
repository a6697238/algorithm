package com.algorithm.analyze.leetcode.math;

/**
 * AUTO-GENERATED: houlu @ 2019/1/12 下午12:20
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class ExcelSheetColumnTitle {

    public String convertToTitle(int n) {
        String ret = "";
        while(n>0)
        {
            ret = (char)((n-1)%26+'A') + ret;
            n = (n-1)/26;
        }
        return ret;
    }

}
