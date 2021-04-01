package com.algorithm.analyze.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lu Hou
 * @date 2017/10/9
 * @time 下午9:54
 */
public class PermutationSequence {

    public static void main(String[] args) {
        getPermutation(4,9);
    }

    public static String getPermutation(int n, int k) {
        return getArrange(n).get(k-1);
    }

    public static List<String> getArrange(int n) {
        List<String> res = new ArrayList<String>();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        helper(res, 0, array);
        return res;
    }

    public static void helper(List<String> res, int start, int[] array) {
        if (start == array.length) {
            String str = "";
            for (int i = 0; i < array.length; i++) {
                str = str + array[i];
            }
            res.add(str);
        } else {
            for (int i = start; i < array.length; i++) {
                swap(i, start, array);
                helper(res, start + 1, array);
                swap(i, start, array);
            }
        }
    }

    public static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
