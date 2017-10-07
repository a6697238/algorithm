package com.algorithm.analyze.leetcode.array;

/**
 * @author Lu Hou
 * @date 2017/10/6
 * @time 下午6:04
 */
public class RotateArray {

    public static void main(String[] args) {
        rotate(new int[]{1,2,3},1);
    }

    /**
     * leetCode 189题，左旋数组
     * https://leetcode.com/problems/rotate-array/description/
     *
     * 1.时间复杂度O(n)，空间复杂度O(n),开辟一个空间为n的数组，按照 i = (i+k)%n 的方式位移赋值
     * 2.反转左边，翻转右边，全部翻转，同字符串那个题
     *
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {
        int[] array = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            array[(i+k)%nums.length] = nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = array[i];
        }
    }
}
