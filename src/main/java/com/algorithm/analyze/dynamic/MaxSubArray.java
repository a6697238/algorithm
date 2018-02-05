package com.algorithm.analyze.dynamic;

/**
 * 类名称: Fibonacci <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/7/16 上午11:45
 */
public class MaxSubArray {

    public static int maxSubArray(int[] nums){
        int maxSum = -Integer.MAX_VALUE;
        int currentSum = 0;
        for(int i=0;i<nums.length;i++){
            if(currentSum<0){
                currentSum = nums[i];
            }else {
                currentSum = currentSum + nums[i];
            }
            if(maxSum<currentSum){
                maxSum = currentSum;
            }
        }
        return maxSum;
    }



    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{1, -2, 3, 10, -4, 7, 2, -5,6}));
    }
}
