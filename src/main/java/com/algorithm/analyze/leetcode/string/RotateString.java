package com.algorithm.analyze.leetcode.string;

/**
 * 功能描述：
 *
 * @Author: winghou
 * @Date: 2022/9/4 11:12 上午
 */
public class RotateString {

    public static void main(String[] args) {
        rotateString("abcde","cdeab");
    }

    public static boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        if(s==goal) return true;
        for(int i=0;i<s.length();i++){
            s = s.substring(1) + s.charAt(0);
            if(s==goal) return true;
        }
        return false;
    }

}
