package com.algorithm.analyze.leetcode.string;

import java.util.Stack;

/**
 * @author Lu Hou
 * @date 2017/10/5
 * @time 下午2:29
 */
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("["));

    }

    /**
     * leetcode 20题
     *
     * https://leetcode.com/problems/valid-parentheses/description/
     *
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (Character character : s.toCharArray()) {
            if ('(' == character || '[' == character || '{' == character) {
                stack.push(character);
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                Character temp = stack.pop();
                if (('(' == temp && ')' == character) || ('[' == temp && ']' == character) || ('{' == temp && '}' == character)) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}
