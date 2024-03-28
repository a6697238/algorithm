package com.algorithm.analyze.leetcode.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Lu Hou
 */
public class Permutations {

    public static void main(String[] args) {
        permute(new int[]{1, 2, 3});
        permute(new int[]{1, 1, 2});
    }

    public static List<List<Integer>> permute(int[] nums) {
        List list = new ArrayList<List<Integer>>();
        arrange(list, nums, 0);
        return list;
    }


    public static void arrange(List<List<Integer>> result, int[] nums, int start) {
        if (start == nums.length - 1) {
            List list = new ArrayList();
            for (int i = 0; i < nums.length; i++) {
                list.add(nums[i]);
            }
            result.add(list);
            System.out.println(Arrays.toString(nums));
        } else {
            for (int i = start; i < nums.length; i++) {
                swap(nums, start, i);
                arrange(result, nums, start + 1);
                swap(nums, start, i);
            }
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
