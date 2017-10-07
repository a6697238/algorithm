package com.algorithm.analyze.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Lu Hou
 * @date 2017/10/5
 * @time 下午11:15
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] array = new int[]{2,3,4};
        System.out.println(Arrays.toString(twoSumII(array,6)));
    }

    /**
     * leetCode 第一题
     * https://leetcode.com/problems/two-sum/description/
     * <p>
     * 1.暴力解法，跳过
     * 2.hashmap解法，就是这种，时间空间都是O(n)
     * 3.先排序，然后使用双指针，时间O(nlogn)，空间就是排序的空间，外加两个指针
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> locationMap = new HashMap<Integer, Integer>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (locationMap.containsKey(target - nums[i])) {
                result[0] = locationMap.get(target - nums[i]);
                result[1] = i;
                break;
            } else {
                locationMap.put(nums[i], i);
            }
        }
        return result;
    }


    /**
     * leetCode 167题
     *
     * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
     *
     * 数列有序
     *
     * 1.双指针，最优O(n)
     * 2.根据第一个数字，求另一个，二分查找 O(nlogn)
     *
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSumII(int[] numbers, int target) {
        int[] result = new int[2];
        for(int i=0;i<numbers.length;i++){
            int toFind = target - numbers[i];
            int left = i+1;
            int right = numbers.length-1;
            while (right>=left){
                int mid = (right + left)/2;
                if(toFind==numbers[mid]){
                    result[0] = i+1;
                    result[1] = mid+1;
                    return result;
                }else if(toFind>numbers[mid]){
                    left = mid+1;
                }else {
                    right = mid-1;
                }
            }
        }
        return result;
    }
}
