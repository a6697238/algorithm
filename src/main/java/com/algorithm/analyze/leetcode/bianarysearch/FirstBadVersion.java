package com.algorithm.analyze.leetcode.bianarysearch;

/**
 * @author Lu Hou
 * @date 2017/10/6
 * @time 下午9:03
 */
public class FirstBadVersion {

    public static void main(String[] args) {
        System.out.println(firstBadVersion(2126753390));
    }

    public static int firstBadVersion(int n) {
        int start = 0;
        int end = n;
        int flag = 0;
        while (end >= start) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                end = mid - 1;
                flag = mid;
            } else {
                start = mid + 1;
            }
        }
        return flag;
    }

    public static boolean isBadVersion(int version) {
        if (version >= 1) {
            return true;
        }
        return false;
    }
}


