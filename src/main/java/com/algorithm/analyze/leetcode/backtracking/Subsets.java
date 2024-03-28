package com.algorithm.analyze.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Lu Hou
 * @date 2017/10/9
 * @time 下午9:21
 */
public class Subsets {

    public static void main(String[] args) {

        List<List<Integer>> res = subsets(new int[]{1, 2, 3});
        for (List<Integer> list : res) {
            for (Integer i : list) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        List<Integer> res = new ArrayList<Integer>();
        backTracking(resultList, res, 0, nums);
        return resultList;
    }

    public static void backTracking(List<List<Integer>> resList, List<Integer> res, int start, int[] nums) {
        for (int i = start; i < nums.length; i++) {
            res.add(nums[i]);
            backTracking(resList, res, i + 1, nums);
            res.remove(res.size() - 1);
        }
        resList.add(new ArrayList<Integer>(res));
    }
}
