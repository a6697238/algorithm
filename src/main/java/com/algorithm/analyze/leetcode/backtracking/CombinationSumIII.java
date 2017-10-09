package com.algorithm.analyze.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Lu Hou
 * @date 2017/10/8
 * @time 下午1:39
 */
public class CombinationSumIII {

    public static void main(String[] args) {

        List<List<Integer>> res = combinationSum3(2,18);
        for (List<Integer> list : res) {
            for (Integer i : list) {
                System.out.print(i);
            }
            System.out.println();
        }

    }

    public static List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        List<Integer> res = new ArrayList<Integer>();
        backTracking(n,1,k,resultList,res);
        return resultList;
    }

    public static void backTracking(int target, int start, int k, List<List<Integer>> resultList, List<Integer> res) {
        if (k < 0) {
            return;
        }
        if(k>0&&target<0){
            return;
        }

        if (k == 0 && target == 0) {
            resultList.add(new ArrayList<Integer>(res));
            return;
        }
        if(k>0&&target>0){
            for(int i=start;i<=9;i++){
                res.add(i);
                backTracking(target-i,i+1,k-1,resultList,res);
                res.remove(res.size()-1);
            }
        }
    }

}
