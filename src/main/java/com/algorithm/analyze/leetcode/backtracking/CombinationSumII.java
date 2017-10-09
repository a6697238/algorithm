package com.algorithm.analyze.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Lu Hou
 * @date 2017/10/8
 * @time 下午1:39
 *
 *
 *
 */
public class CombinationSumII {

    public static void main(String[] args) {

        List<List<Integer>> res = combinationSum2(new int[]{10, 1,1, 2, 7, 6, 5}, 8);
        for (List<Integer> list : res) {
            for (Integer i : list) {
                System.out.print(i);
            }
            System.out.println();
        }

    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        List<Integer> res = new ArrayList<Integer>();
        Arrays.sort(candidates);
        backTracking(target,0,resultList,res,candidates);
        return resultList;
    }

    public static void backTracking(int target, int start, List<List<Integer>> resultList, List<Integer> res, int[] candidates) {
        if (target == 0) {
            resultList.add(new ArrayList<Integer>(res));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if(i>start && candidates[i]==candidates[i-1]) continue;
            res.add(candidates[i]);
            backTracking(target-candidates[i],i+1,resultList,res,candidates);
            res.remove(res.size()-1);
        }
    }

}
