package com.algorithm.analyze.leetcode.bianarysearch;

/**
 * 功能描述：
 *
 * @Author: winghou
 * @Date: 2022/9/4 11:38 上午
 */
public class SearchInsert {

    public static void main(String[] args) {
        int[] array = new int[]{1,3};
        searchInsert(array,2);
    }

    public static int searchInsert(int[] nums, int target) {
        int l  =0;
        int r = nums.length-1;
        int res = 0;


        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid]==target){
                res = mid;
                break;
            }else if(nums[mid]>target){
                r = mid-1;
                res = mid-1;
            }else if(nums[mid]<target){
                l = mid+1;
                res = mid + 1;
            }
        }
        if(res==-1){
            res = 0;
        }
        return res;

    }
}
