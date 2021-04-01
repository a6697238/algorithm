package com.algorithm.analyze.leetcode.math;

/**
 * AUTO-GENERATED: houlu @ 2019/1/12 下午9:11
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class StringtoInteger {

    public static void main(String[] args) {
        System.out.println(myAtoi("-91283472332"));
    }

    public static int myAtoi(String str) {
        if(str==null || str.trim().length()==0){
            return 0;
        }
        str = str.trim();
        int i = 0;
        char flag = '+';
        if(str.charAt(0)=='-'){
            flag = '-';
            i++;
        }else if(str.charAt(0)=='+'){
            flag = '+';
            i++;
        }
        long res = 0;
        while (str.length()>i&&str.charAt(i)>='0' && str.charAt(i)<='9'){
            res = res*10 + (str.charAt(i) - '0');
            i++;

            if(res>Integer.MAX_VALUE){
                break;
            }
        }

        if(flag=='-'){
            res = -res;
        }

        if(res>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }

        if(res<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }

        return (int)res;
    }

}
