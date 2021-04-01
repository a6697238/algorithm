package com.algorithm.analyze.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * AUTO-GENERATED: houlu @ 2019/1/20 上午10:18
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class PalindromePartitioningII {

    public int minCut(String s) {
        int [][] dp=new int[s.length()][s.length()];
        int [] cut=new int[s.length()+1];

        for(int i=s.length()-1;i>=0;i--)
        {
            cut[i]=Integer.MAX_VALUE;
            for(int j=i;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j)&&(j-i<=1||dp[i+1][j-1]==1))
                {
                    dp[i][j]=1;
                    cut[i]=Math.min(1+cut[j+1],cut[i]);
                }
            }
        }
        return cut[0]-1;
    }



}
