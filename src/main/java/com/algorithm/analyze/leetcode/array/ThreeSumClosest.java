package com.algorithm.analyze.leetcode.array;

import java.util.Arrays;

/**
 * 功能描述：
 *
 * @Author: winghou
 * @Date: 2022/8/31 11:43 下午
 */
public class ThreeSumClosest {

    public static void main(String[] args) {
        int[] nums = new int[]{-1,2,1,1};
        threeSumClosest(nums,1);
    }

    public static int threeSumClosest(int[] nums, int target) {

        int sum = 0;
        if (nums.length <= 3) {
            for (int i = 0; i < nums.length; i++) {
                sum = sum + i;
            }
        }
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length-1;
            while (left < right) {
                int total = nums[i] + nums[left] + nums[right];
                int diff = 0;
                if (total == target) {
                    return target;
                } else if (total < target) {
                    left++;
                } else if (total > target) {
                    right--;
                }
                diff = Math.abs(target - total);
                if (diff < minDiff) {
                    minDiff = diff;
                    sum = total;
                }
            }
        }
        return sum;
    }

}
