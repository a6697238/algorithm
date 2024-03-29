package com.algorithm.analyze.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Lu Hou
 * @date 2018/1/11
 * @time 下午4:32
 */
public class GenerateParentheses {


    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        backTrace(n, n, "", res);
        return res;
    }

    public static void backTrace(int left, int right, String out, List<String> res) {
        if (left < 0 || right < 0 || left > right) {
            return;
        }
        if (left == 0 && right == 0) {
            res.add(out);
            return;
        }
        backTrace(left - 1, right, out + "(", res);
        backTrace(left, right - 1, out + ")", res);
    }


}
