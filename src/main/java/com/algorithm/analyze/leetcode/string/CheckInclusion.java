package com.algorithm.analyze.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述：
 *
 * @Author: winghou
 * @Date: 2022/8/26 3:03 下午
 */
public class CheckInclusion {

    public static void main(String[] args) {
        checkInclusion("ab","eidboaoo");
    }

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() == 0 || s2.length() == 0) {
            return false;
        }
        int left = 0;
        int right = 0;
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> has = new HashMap<>();
        for (Character character : s1.toCharArray()) {
            need.put(character, need.getOrDefault(character, 0) + 1);
        }
        int valid = 0;
        while (right < s2.length()) {
            Character rightVal = s2.charAt(right);
            right++;
            if (need.containsKey(rightVal)) {
                has.put(rightVal, has.getOrDefault(rightVal, 0) + 1);
                if (has.get(rightVal).equals(need.get(rightVal))) {
                    valid++;
                }
            }
            while (right - left >= s1.length()) {
                if (valid == need.size()) {
                    return true;
                }
                Character leftVal = s2.charAt(left);
                if (need.containsKey(leftVal)) {
                    if (has.get(leftVal).equals(need.get(leftVal))) {
                        valid--;
                    }
                    has.put(leftVal, has.getOrDefault(leftVal, 0) - 1);
                }
                left++;
            }
        }
        return false;
    }
}
