package com.algorithm.analyze.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Lu Hou
 */
public class SingleNumber {

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[] {17,12,5,-6,12,4,17,-5,2,-3,2,4,5,16,-3,-4,15,15,-4,-5,-6}));
    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        int single = 0;
        for (int i = 0; i < nums.length; i++) {
            if (null == map.get(nums[i])) {
                map.put(nums[i], 1);
            }else {
                map.put(nums[i],2);
            }
        }
        for(Integer integer : map.keySet()){
            if(map.get(integer)==1){
                single = integer;
            }
        }
        return single;
    }
}
