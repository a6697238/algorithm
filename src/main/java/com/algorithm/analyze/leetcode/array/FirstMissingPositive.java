package com.algorithm.analyze.leetcode.array;

import java.util.HashSet;
import java.util.Set;

/**
 * AUTO-GENERATED: houlu @ 2019/1/14 下午10:57
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class FirstMissingPositive {

    public static void main(String[] args) {
        int[] array = new int[]{3,4,-1,1};
        firstMissingPositive(array);
    }

    public static int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=1;i<Integer.MAX_VALUE;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }

    public static void mergeSort(int[] array, int l, int h) {
        if (l < h) {
            int mid = (l + h) / 2;
            mergeSort(array, mid + 1, h);
            mergeSort(array, l, mid);
            sort(array, l, h);
        }
    }

    public static void sort(int[] array, int l, int h) {
        int mid = (l + h) / 2;
        int p1 = l;
        int p2 = mid + 1;
        int[] temp = new int[h - l + 1];
        int i = 0;
        while (p1 <= mid && p2 <= h) {
            if (array[p1] < array[p2]) {
                temp[i] = array[p1];
                p1++;
            } else {
                temp[i] = array[p2];
                p2++;
            }
            i++;
        }
        while (p1 <= mid) {
            temp[i++] = array[p1++];
        }
        while (p2 <= h) {
            temp[i++] = array[p2++];
        }
        for (int j = 0; j < temp.length; j++) {
            array[j + l] = temp[j];
        }
    }

}
