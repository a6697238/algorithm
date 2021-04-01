package com.algorithm.analyze.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Lu Hou
 * @date 2017/10/4
 * @time 下午10:44
 */
public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCVI"));
    }

    /**
     *  LeetCode 13题，罗马数字字符串转整型数字
     *
     *  https://leetcode.com/problems/roman-to-integer/description
     *
     *  如果小于等于前面的数字，我们先加上当前的数字，如果大于的前面的数字，我们加上当前的数字减去二倍前面的数字，这样可以把在上一个循环多加数减掉
     *
     * @param s
     * @return
     */
    public static int romanToInt(String s) {
        Map<Character,Integer> valueMap = new HashMap<Character,Integer>();
        valueMap.put('I',1);
        valueMap.put('V',5);
        valueMap.put('X',10);
        valueMap.put('L',50);
        valueMap.put('C',100);
        valueMap.put('D',500);
        valueMap.put('M',1000);

        int res = valueMap.get(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(valueMap.get(s.charAt(i))<=valueMap.get(s.charAt(i-1))){
                res = res + valueMap.get(s.charAt(i));
            }else {
                res = res + valueMap.get(s.charAt(i)) - 2*valueMap.get(s.charAt(i-1));
            }
        }
        return res;
    }
}
