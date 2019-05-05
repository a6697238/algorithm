package com.algorithm.analyze.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * AUTO-GENERATED: houlu @ 2019/1/19 上午9:42
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class RemoveDuplicatesfromSortedArrayII {

    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> resMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            Integer temp = resMap.get(nums[i]);
            if (null == temp) {
                resMap.put(nums[i], 1);
            } else if (1 == temp) {
                resMap.put(nums[i], 2);
            }
        }
        int res = 0;
        for (Integer key : resMap.keySet()) {
            res = res + resMap.get(key);
        }

        return res;
    }
}
