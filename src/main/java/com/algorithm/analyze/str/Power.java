package com.algorithm.analyze.str;

/**
 * @author Lu Hou
 */
public class Power {
    public static void main(String[] args) {
        System.out.println(myPow(1.00001, 146));
//        System.out.println(myPow(2, 2));

    }

    public static double myPow(double x, int n) {
       if(n>=0) return pow(x,n);
       else return 1/pow(x,n);
    }

    public static double pow(double x, int n) {
//        if (x == 0)
//            return 0;
//        if (n == 0)
//            return 1;
//        return x * myPow(x, n - 1);

        double[] dp = new double[n+1];
        int i = 1;
        dp[0] = 1;
        while (i<n+1){
            dp[i] = dp[i-1] * x;
            i++;
        }
        return dp[n];
    }

}
