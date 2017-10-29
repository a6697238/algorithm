package com.algorithm.analyze.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lu Hou
 * @date 2017/10/9
 * @time 下午9:38
 */
public class Combinations {

    public static void main(String[] args) {
        List<List<Integer>> res = combine(4,2);
        for (List<Integer> list : res) {
            for (Integer i : list) {
                System.out.print(i);
            }
            System.out.println();
        }
    }


    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> resList = new ArrayList<List<Integer>>();
        List<Integer> res = new ArrayList<Integer>();
        backTracking(n,1,k,resList,res);
        return resList;
    }

    public static void backTracking(int n,int start,int k,List<List<Integer>> resultList,List<Integer> res){
        if(k==0){
            resultList.add(new ArrayList<Integer>(res));
            return;
        }
        if(k>0){
            for(int i=start;i<=n;i++){
                res.add(i);
                backTracking(n,i+1,k-1,resultList,res);
                res.remove(res.size()-1);
            }
        }
    }
}
