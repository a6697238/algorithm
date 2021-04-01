package com.algorithm.analyze.leetcode.dp;

/**
 * AUTO-GENERATED: houlu @ 2019/1/9 下午11:42
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        if (coins.length == 0) {
            return -1;
        }
        int[] dp = new int[amount + 1];
        for (int i = 0; i <= amount; i++) {
            dp[i] = -1;
        }
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if(i-coins[j]>=0&&dp[i-coins[j]]!=-1){
                    if(dp[i]==-1 || dp[i] > dp[i-coins[j]] + 1){
                        dp[i] = dp[i-coins[j]] + 1;
                    }
                }
            }
        }

        return dp[amount];

    }


}
