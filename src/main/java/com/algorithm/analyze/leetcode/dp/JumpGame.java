package com.algorithm.analyze.leetcode.dp;

/**
 * AUTO-GENERATED: houlu @ 2019/1/12 上午12:23
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class JumpGame {

    public boolean canJump(int[] nums) {
        if(nums.length==0){
            return false;
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            dp[i] = Math.max(dp[i-1],nums[i-1]) - 1;
            if(dp[i]<0){
                return false;
            }
        }
        return true;

    }


}
