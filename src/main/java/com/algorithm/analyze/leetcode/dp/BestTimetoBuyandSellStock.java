package com.algorithm.analyze.leetcode.dp;

/**
 * AUTO-GENERATED: houlu @ 2019/1/13 下午2:49
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class BestTimetoBuyandSellStock {

    public int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int res = 0;
        for(int i=0;i<prices.length;i++){
            min = Math.min(min,prices[i]);
            res = Math.max(prices[i]-min,res);
        }
        return res;

    }

}
