package com.algorithm.analyze.leetcode.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Lu Hou
 * @date 2017/10/4
 * @time 下午10:44
 */
public class IntegerToRoman {

    public static void main(String[] args) {
        System.out.println(intToRoman(3619));
    }

    /**
     *
     * leetcode 12题，整型转罗马数字
     *
     * https://leetcode.com/problems/integer-to-roman/description/
     *
     * 贪心算法，每次去最大的做追加
     * @param num
     * @return
     */
    public static String intToRoman(int num) {
        Map<Integer, String> valueMap = new LinkedHashMap<Integer, String>();
        valueMap.put(1000, "M");
        valueMap.put(900, "CM");
        valueMap.put(500, "D");
        valueMap.put(400, "CD");
        valueMap.put(100, "C");
        valueMap.put(90, "XC");
        valueMap.put(50, "L");
        valueMap.put(40, "XL");
        valueMap.put(10, "X");
        valueMap.put(9, "IX");
        valueMap.put(5, "V");
        valueMap.put(4, "IV");
        valueMap.put(1, "I");

        String res = "";
        while (num > 0) {
            for (int key : valueMap.keySet()) {
                if (num >= key) {
                    res = res + valueMap.get(key);
                    num = num - key;
                    break;
                }
            }
        }

        return res;
    }
}
