package com.algorithm.analyze.leetcode.array;

/**
 * @author Lu Hou
 * @date 2017/10/6
 * @time 下午8:06
 *
 * leetCode 35题
 * https://leetcode.com/problems/search-insert-position/description/
 *
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
 * Here are few examples
 * [1,3,5,6], 5 → 2
 * [1,3,5,6], 2 → 1
 * [1,3,5,6], 7 → 4
 * [1,3,5,6], 0 → 0
 *
 *
 * 解法二分查找
 */
public class SearchInsertPosition {

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6},7));
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int flag = 0;
        while (end>=start){
            int mid = (start+end)/2;
            if(target<nums[mid]){
                end = mid-1;
                flag = mid;
            }else if(target>nums[mid]){
                start = mid+1;
                flag = start;
            }else {
                flag = mid;
                break;
            }
        }
       return flag;
    }

}
