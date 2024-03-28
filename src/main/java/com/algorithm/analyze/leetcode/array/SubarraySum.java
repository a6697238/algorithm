package com.algorithm.analyze.leetcode.array;

/**
 * 功能描述：
 *
 * @Author: winghou
 * @Date: 2022/9/3 6:24 下午
 */
public class SubarraySum {

    public static void main(String[] args) {
        int[] num = new int[]{1};

        subarraySum(num,0);
    }

    public static int subarraySum(int[] nums, int k) {
        if(nums.length==0){
            return 0;
        }
        int left = 0;
        int right = 0;
        int sum = 0;
        int count = 0;
        while(right<nums.length){
            int rightVal = nums[right];
            sum = sum + rightVal;
            right++;
            while(sum>=k&&left<=right){
                if(sum==k){
                    count++;
                }
                int leftVal = nums[left];
                sum = sum - leftVal;
                left++;
            }
        }
        return count;
    }
}
