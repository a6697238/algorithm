package com.algorithm.analyze.leetcode.string;

/**
 * @author Lu Hou
 * @date 2017/10/17
 * @time 下午8:58
 */
public class StringtoInteger {

    public static void main(String[] args) {
        System.out.println(myAtoi("1230"));
    }

    public static int myAtoi(String str) {
        char[] charArray = str.toCharArray();
        int num = 0;
        for (int i = 0; i < charArray.length; i++) {
            if ((charArray[i] - '0' >= 0) && (charArray[i] - '0' <= 9)) {
                num = num * 10 + charArray[i] - '0';
            }
        }
        return num;
    }


}
