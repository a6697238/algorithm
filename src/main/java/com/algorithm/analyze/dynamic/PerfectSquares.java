package com.algorithm.analyze.dynamic;

/**
 * AUTO-GENERATED: houlu @ 2019/1/15 下午10:53
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class PerfectSquares {

    public static void main(String[] args) {
        numSquares(12);
    }

    public static int numSquares(int n) {
        if (n<0){
            return 0;
        }
        int[] dp = new int[n+1];

        for(int i=0;i<n+1;i++){
            dp[i] = -1;
        }
        dp[0]=0;
        for(int i=1;i<n+1;i++){
            for(int j=1;j<=i;j++){
                int lastState = i-j*j;
                if(lastState>=0&&lastState<n+1){
                    if(i>=j*j && dp[lastState]!=-1){
                        if(dp[i]==-1||dp[i]>dp[lastState]+1){
                            dp[i] = dp[lastState] + 1;
                        }
                    }
                }

            }
        }
        return dp[n];
    }

}
