package com.algorithm.analyze.leetcode.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Lu Hou
 * @date 2018/1/10
 * @time 下午7:48
 */
public class LetterCombinationsofaPhoneNumber {

    public static void main(String[] args) {

    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();

        if (digits == null || digits.equals("")) {
            return result;
        }

        Map<Character, char[]> map = new HashMap<Character, char[]>();
        map.put('0', new char[] {});
        map.put('1', new char[] {});
        map.put('2', new char[] { 'a', 'b', 'c' });
        map.put('3', new char[] { 'd', 'e', 'f' });
        map.put('4', new char[] { 'g', 'h', 'i' });
        map.put('5', new char[] { 'j', 'k', 'l' });
        map.put('6', new char[] { 'm', 'n', 'o' });
        map.put('7', new char[] { 'p', 'q', 'r', 's' });
        map.put('8', new char[] { 't', 'u', 'v'});
        map.put('9', new char[] { 'w', 'x', 'y', 'z' });

        StringBuilder sb = new StringBuilder();
        helper(map, digits, sb, result);

        return result;
    }

    public static void helper(Map<Character,char[]> map,String digits,StringBuilder sb,List<String> list){
        if(digits.length()==sb.length()){
            list.add(sb.toString());
            return;
        }
        for(Character value:map.get(digits.charAt(sb.length()))){
            sb.append(value);
            helper(map,digits,sb,list);
            sb.deleteCharAt(sb.length() - 1);
        }
    }




}
