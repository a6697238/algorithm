package com.algorithm.analyze.leetcode.array;

/**
 * @author Lu Hou
 * @date 2017/10/6
 * @time 下午3:35
 */
public class RemoveDuplicatesfromSortedArray {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1}));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[start]) {
                start++;
                nums[start] = nums[i];
            }
        }

        return start + 1;
    }


    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=val){
                nums[start] = nums[i];
                start++;
            }

        }
        return start;
    }


}
