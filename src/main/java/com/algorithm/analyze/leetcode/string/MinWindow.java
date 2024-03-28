package com.algorithm.analyze.leetcode.string;


import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述：
 *
 * @Author: winghou
 * @Date: 2022/8/26 3:25 下午
 */
public class MinWindow {

    public static void main(String[] args) {
        minWindow("ADOBECODEBANC", "ABC");
    }

    public static String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return "";
        }
        int left = 0;
        int right = 0;
        int len = Integer.MAX_VALUE;
        int start = 0;
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> has = new HashMap<>();
        for (Character c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        int valid = 0;
        while (right < s.length()) {
            Character rightVal = s.charAt(right);
            right++;
            if (need.containsKey(rightVal)) {
                has.put(rightVal, has.getOrDefault(rightVal, 0) + 1);
                if (has.get(rightVal).equals(need.get(rightVal))) {
                    valid++;
                }
            }
            while (valid == need.size()) {
                if (right - left < len) {
                    start = left;
                    len = right - left;
                }
                Character leftVal = s.charAt(left);
                if (need.containsKey(leftVal)) {
                    if (has.get(leftVal).equals(need.get(leftVal))) {
                        valid--;
                    }
                    has.put(leftVal, has.getOrDefault(leftVal, 0) - 1);
                }
                left++;
            }
        }
        if (len == Integer.MAX_VALUE) {
            return "";
        } else {
            return s.substring(start, start + len);
        }
    }
}
