package com.algorithm.analyze.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * AUTO-GENERATED: houlu @ 2019/1/20 上午9:54
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class PalindromePartitioning {

    public static void main(String[] args) {
        partition("aab");
    }

    public static List<List<String>> partition(String s) {
        List<String> item = new ArrayList<String>();
        List<List<String>> res = new ArrayList<List<String>>();

        if(s==null||s.length()==0)
            return res;

        dfs(s,0,item,res);
        return res;
    }

    public static void dfs(String s, int start, List<String> item, List<List<String>> res){
        if (start == s.length()){
            res.add(new ArrayList<String>(item));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            String str = s.substring(start, i+1);
            if (isPalindrome(str)) {
                item.add(str);
                dfs(s, i+1, item, res);
                item.remove(item.size() - 1);
            }
        }
    }


    public static boolean isPalindrome(String s){
        int low = 0;
        int high = s.length()-1;
        while(low < high){
            if(s.charAt(low) != s.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;
    }
}
