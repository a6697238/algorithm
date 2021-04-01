package com.algorithm.analyze.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Lu Hou
 * @date 2017/10/8
 * @time 下午3:20
 */
public class RestoreIPAddresses {

    public static void main(String[] args) {
        List<String> ipStrList = restoreIpAddresses("172062541");
        for (String str : ipStrList) {
            System.out.println(str);
        }

    }

    public static List<String> restoreIpAddresses(String s) {
        List<String> ipStrList = new ArrayList<String>();
//        backTracking(ipStrList, 4, "", s);
        backTracking(s, 0, "", ipStrList);
        return ipStrList;
    }


    public static void backTracking(String s, int n, String out, List<String> res) {
        if (n == 4) {
            if (s.length() == 0) {
                res.add(out);
            }
            return;
        }
        for (int k = 1; k < 4; ++k) {
            if (s.length() < k) {
                break;
            }
            int val = Integer.parseInt(s.substring(0, k));
            if (val > 255 || k != String.valueOf(val).length()) {
                continue;
            }
            backTracking(s.substring(k), n + 1, out + s.substring(0, k) + (n == 3 ? "" : "."), res);
        }
    }
}
