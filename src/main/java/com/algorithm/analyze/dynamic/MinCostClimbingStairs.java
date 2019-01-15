package com.algorithm.analyze.dynamic;

/**
 * AUTO-GENERATED: houlu @ 2019/1/15 下午11:39
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class MinCostClimbingStairs {

    public static void main(String[] args) {
        int[] cost = new int[]{10,15,20};
        minCostClimbingStairs(cost);
    }

    public static int minCostClimbingStairs(int[] cost) {
        if (cost.length==0){
            return 0;
        }

        int[] dp = new int[cost.length+1];
        dp[0] = 0;
        dp[1] = 0;
        for(int i=2;i<dp.length;i++){
            dp[i] = Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
        }
        return dp[dp.length-1];
    }

}
