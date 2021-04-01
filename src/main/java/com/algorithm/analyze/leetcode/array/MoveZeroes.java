package com.algorithm.analyze.leetcode.array;

/**
 * @author Lu Hou
 * @date 2017/10/6
 * @time 下午6:57
 *
 * leetCode 283题
 * https://leetcode.com/problems/move-zeroes/description/
 *
 *
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 * Credits:
 * Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.
 */
public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int start = 0;
        int temp;
        for(int i=0;i<nums.length;i++){
            if(0!=nums[i]){
                temp = nums[start];
                nums[start] = nums[i];
                nums[i] = temp;
                start++;
            }
        }
    }

}
