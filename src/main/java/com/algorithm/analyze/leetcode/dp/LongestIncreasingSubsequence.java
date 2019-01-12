package com.algorithm.analyze.leetcode.dp;

/**
 * AUTO-GENERATED: houlu @ 2019/1/10 上午12:10
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int max = 0;
        int[] dp = new int[nums.length];
        dp[0] = 1;
        for (int i = 1; i < dp.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if(nums[i]>nums[j]&&dp[i]<dp[j]+1){
                    dp[i] = dp[j]+1;
                }
            }
        }
        for(int i=0;i<dp.length;i++){
            if(dp[i]>max){
                max = dp[i];
            }
        }

        return max;
    }

}
