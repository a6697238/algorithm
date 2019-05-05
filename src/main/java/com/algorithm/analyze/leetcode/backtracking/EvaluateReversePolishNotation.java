package com.algorithm.analyze.leetcode.backtracking;

import java.util.Stack;

/**
 * AUTO-GENERATED: houlu @ 2019/1/20 上午10:44
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class EvaluateReversePolishNotation {

    public static void main(String[] args) {
        String[] str = new String[]{"1","+","2","*","3","+","4"};
        evalRPN(str);
    }

    public static int evalRPN(String[] tokens) {
        int ret = 0;
        Stack<Integer> num = new Stack<Integer>();
        for (int i = 0; i < tokens.length; i++) {
            if (isOperator(tokens[i])) {
                int b = num.pop();
                int a = num.pop();
                num.push(calc(a, b, tokens[i]));
            } else {
                num.push(Integer.valueOf(tokens[i]));
            }
        }
        ret = num.pop();
        return ret;
    }

    static boolean isOperator(String str) {
        if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/"))
            return true;
        return false;
    }

    static int calc(int a, int b, String operator) {
        char op = operator.charAt(0);
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
        }
        return 0;
    }
}
