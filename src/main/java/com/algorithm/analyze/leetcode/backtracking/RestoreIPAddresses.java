package com.algorithm.analyze.leetcode.backtracking;

import java.util.ArrayList;
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
        backTracking(ipStrList, 4, "", s);
        return ipStrList;
    }

    public static void backTracking(List<String> ipStrList, int k, String toFind, String remain) {
        if (k < 0) {
            return;
        }
        if (k == 0 && remain.length() > 0) {
            return;
        }
        if (k == 0 && remain.length() == 0) {
            ipStrList.add(toFind.substring(0, toFind.length() - 1));
            return;
        }
        int end = 0;
        if (remain.length() >= 3) {
            end = 3;
        } else {
            end = remain.length();
        }
        for (int i = 1; i < end+1; i++) {
            toFind = toFind + remain.substring(0, i) + ".";
            if(Integer.parseInt(remain.substring(0, i))==0&&remain.substring(0, i).length()>1){
                continue;
            }
            if(Integer.parseInt(remain.substring(0, i))!=0&&remain.substring(0, 1).equals("0")){
                continue;
            }
            if(Integer.parseInt(remain.substring(0, i))>255){
                continue;
            }
            backTracking(ipStrList, k - 1, toFind, remain.substring(i, remain.length()));
            toFind = toFind.substring(0, toFind.length() - i - 1);
        }
    }
}
