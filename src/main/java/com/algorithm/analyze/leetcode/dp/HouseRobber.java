package com.algorithm.analyze.leetcode.dp;

/**
 * AUTO-GENERATED: houlu @ 2019/1/9 下午11:09
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class HouseRobber {

    public int rob(int[] nums) {

        if(nums.length==0){
            return 0;
        }

        if(nums.length==1){
            return nums[0];
        }

        if(nums.length==2){
            return Math.max(nums[1],nums[0]);
        }

        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        dp[1] = Math.max( nums[0], nums[1]);
        int max = dp[0];
        for(int i=2;i<nums.length;i++){
            dp[i] = Math.max(dp[i-2] + nums[i],dp[i-1]);
            if(dp[i]>max){
                max = dp[i];
            }
        }


        return max;

    }



}
