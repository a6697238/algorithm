package com.algorithm.analyze.leetcode.dp;

/**
 * AUTO-GENERATED: houlu @ 2019/1/13 下午3:40
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class BestTimetoBuyandSellStockII {

    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 0; i < prices.length - 1; ++i) {
            if (prices[i] < prices[i + 1]) {
                res += prices[i + 1] - prices[i];
            }
        }
        return res;

    }

}
