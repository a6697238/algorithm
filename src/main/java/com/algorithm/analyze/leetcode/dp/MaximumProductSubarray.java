package com.algorithm.analyze.leetcode.dp;

/**
 * AUTO-GENERATED: houlu @ 2019/1/13 下午9:12
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class MaximumProductSubarray {

    public int maxProduct(int[] nums) {
        int max = nums[0];
        int length = nums.length;
        int[] dp_min = new int[length];
        int[] dp_max = new int[length];
        dp_min[0] = dp_max[0] = nums[0];
        for (int i = 1; i < length; ++i) {
            dp_min[i] = Math.min(
                    Math.min(dp_max[i - 1] * nums[i], dp_min[i - 1] * nums[i]), nums[i]);
            dp_max[i] = Math.max(
                    Math.max(dp_max[i - 1] * nums[i], dp_min[i - 1] * nums[i]), nums[i]);
            max = Math.max(dp_max[i], max);
        }
        return max;

    }
}
