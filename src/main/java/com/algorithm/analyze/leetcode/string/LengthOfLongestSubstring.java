package com.algorithm.analyze.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述：
 *
 * @Author: winghou
 * @Date: 2022/8/25 10:28 下午
 */
public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        lengthOfLongestSubstring(" ");
    }


    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int left = 0;
        int right = 0;
        Map<Character, Integer> map = new HashMap<>();
        int len = 0;
        while (right < s.length()) {
            Character rightVal = s.charAt(right);
            right++;
            map.put(rightVal, map.getOrDefault(rightVal, 0) + 1);
            while (map.get(rightVal) > 1) {
                Character leftVal = s.charAt(left);
                map.put(leftVal, map.getOrDefault(leftVal, 0) - 1);
                left++;
            }
            len = Math.max(len, right - left);
        }
        return len;
    }
}
