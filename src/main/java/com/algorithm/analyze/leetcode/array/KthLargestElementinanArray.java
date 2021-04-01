package com.algorithm.analyze.leetcode.array;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Lu Hou
 */
public class KthLargestElementinanArray {

    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[] {2, 1}, 2));
    }

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<Integer>(2, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                if(o1>o2){
                    return 1;
                }else {
                    return -1;
                }
            }
        });
        for(int i = 0 ; i < nums.length; i++){
            p.add(nums[i]);
            if(p.size()>k) p.poll();
        }
        return p.poll();
    }

}
