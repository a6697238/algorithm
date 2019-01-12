package com.algorithm.analyze.leetcode.dp;

/**
 * AUTO-GENERATED: houlu @ 2019/1/12 上午11:07
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class ClimbingStairs {

    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        if(n==0){
            return 0;
        }
        for(int i=2;i<n+1;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];

    }

}
