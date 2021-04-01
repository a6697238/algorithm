package com.algorithm.analyze.leetcode.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * AUTO-GENERATED: houlu @ 2019/1/20 上午11:33
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class WordBreak {

    public static void main(String[] args) {
        String str = "leetcode";
        List<String> array = new ArrayList<String>();
        array.add("leet");
        array.add("code");
        wordBreak(str,array);
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        Set<String> word = new HashSet<String>(wordDict);
        dp[0] = true;
        for(int i=1;i<s.length()+1;i++){
            for(int j=0;j<i;j++){
                String str = s.substring(j,i);
                if(dp[j] && word.contains(str)){
                    dp[i] = true;
                }
            }
        }
        return dp[s.length()];
    }

}
