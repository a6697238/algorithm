package com.algorithm.analyze.leetcode.dp;

/**
 * AUTO-GENERATED: houlu @ 2019/1/10 下午10:48
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class MyPow {

    public static double myPow(double x, int n) {
        int sign=1;
        if(n<0){
            sign=-1;
            n=-n;
        }
        return sign<0? 1/pow(x,n) : pow(x,n) ;
    }


    public static double pow(double x,int n){
        if(n==0) return 1;
        if(n==1) return x;
        if(n%2==0) {
            double tmp=pow(x,n/2);
            return tmp*tmp;
        }else{
            double tmp=pow(x,n/2);
            return tmp*tmp*x;
        }
    }

    public static void main(String[] args) {
        myPow(0.00001, 2147483647);
    }


}
