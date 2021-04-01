package com.algorithm.analyze.leetcode.bianarysearch;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Lu Hou
 */
public class SearchinRotatedSortedArray {

    public static void main(String[] args) {
        int[] array = new int[]{6,7,8,9,1,2,3};
        System.out.println(search(array,8));
    }

    public static int search(int[] nums, int target) {
        int h = nums.length-1;
        int l = 0;
        while (l<=h){
            int mid = (h+l)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<nums[h]){
                if(target>nums[mid]&&target<=nums[h]){
                    l = mid+1;
                }else {
                    h = mid-1;
                }
            }else {
                if(target<nums[mid]&&target>=nums[l]){
                    h = mid-1;
                }else {
                    l = mid + 1;
                }
            }
        }
        return -1;
    }




}
