package com.algorithm.analyze.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Lu Hou
 * @date 2017/10/7
 * @time 下午11:15
 * <p>
 * <p>
 * leetCode 39 题
 * https://leetcode.com/problems/combination-sum/description/
 * <p>
 * 回溯算法，深度优先搜索
 * <p>
 * root
 * 2        3         6      7
 * 2  3  6 7   3 6 7    6   7
 * 。。。。。
 * 。。。。。
 * <p>
 * 回溯一条路径
 */
public class CombinationSum {
    public static void main(String[] args) {

        List<List<Integer>> res = combinationSum(new int[]{2, 3, 6, 7}, 7);
        for (List<Integer> list : res) {
            for (Integer i : list) {
                System.out.print(i);
            }
            System.out.println();
        }


    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        List<Integer> res = new ArrayList<Integer>();
        Arrays.sort(candidates);
        backTracking(target, 0, resultList, res, candidates);
        return resultList;
    }



    public static void backTracking(int target, int start, List<List<Integer>> resultList, List<Integer> res, int[] candidates) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            resultList.add(new ArrayList<Integer>(res));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            res.add(candidates[i]);
            backTracking(target - candidates[i], i, resultList, res, candidates);
            res.remove(res.size() - 1);
        }
    }
}
