package com.algorithm.analyze.str;

/**
 * @author Lu Hou
 */
public class Power {
    public static void main(String[] args) {
        System.out.println(myPow(1.00001, 146));
    }

    public static double myPow(double x, int n) {
       if(n>=0) return pow(x,n);
       else return 1/pow(x,n);
    }

    public static double pow(double x, int n) {
        if (x == 0)
            return 0;
        if (n == 0)
            return 1;
        return x * myPow(x, n - 1);
    }
}
