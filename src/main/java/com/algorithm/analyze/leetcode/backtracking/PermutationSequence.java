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
        getPermutation(3,3);
    }

    public static String getPermutation(int n, int k) {
       return toAnalyze(n,k);
    }

    public static String toAnalyze(int n, int k) {
        int count = 1;
        for(int i=1;i<n;i++){
            count = count*i;
        }
        int start = k/count;
        System.out.println(start);
        return "0";
    }



    /**
     * 回溯算法
     * @param n
     * @param k
     * @return
     */
    public static String toBackTracking(int n,int k){
        char[] nums = new char[n];
        List<String> resultList = new ArrayList<String>();
        backTracking(nums,0,resultList,"");
        for(String strr:resultList){
            System.out.println(strr);
        }

        return resultList.get(k-1);
    }

    public static void backTracking(char[] nums, int start, List<String> resultList, String res) {
        if (start == nums.length) {
            resultList.add(res);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                nums[i] = 1;
                res = res + String.valueOf(i+1);
                backTracking(nums, start + 1, resultList, res);
                res = res.substring(0, res.length() - 1);
                nums[i] = 0;
            }

        }
    }

}
