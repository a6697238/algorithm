package com.algorithm.analyze.leetcode.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能描述：
 *
 * @Author: winghou
 * @Date: 2022/8/25 10:46 下午
 */
public class FindAnagrams {

    public static void main(String[] args) {
        findAnagrams("baa", "aa");
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int left = 0;
        int right = 0;
        if (s.length() < p.length()) {
            return res;
        }
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> has = new HashMap<>();
        for (Character c : p.toCharArray()) {
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
            while (right - left >= p.length()) {
                if (valid == need.size()) {
                    res.add(left);
                }
                Character leftVal = s.charAt(left);
                left++;
                if (need.containsKey(leftVal)) {
                    if (has.get(leftVal).equals(need.get(leftVal))) {
                        valid--;
                    }
                    has.put(leftVal, has.getOrDefault(leftVal, 0) - 1);
                }
            }
        }
        return res;
    }
}
