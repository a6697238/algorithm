package com.algorithm.analyze.dynamic;

/**
 * 类名称: Fibonacci <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/7/16 上午11:45
 */
public class Fibonacci {

    public static int getNumRec(int i){
        if (i==1||i==0){
            return 1;
        }

        return getNumRec(i-1)+getNumRec(i-2);
    }


    public static int getNum(int i){
        if(i==0) return 1;

        int[] num = new int[i+1];
        for(int start = 0;start<i+1;start++){
            if(start==0||start==1) num[start] = 1;
            else {
                num[start] = num[start-1]+num[start-2];
            }
        }
        return num[i];
    }

    public static void main(String[] args) {
//        for(int i=0;i<100;i++){
//            System.out.print("递归:" + getNumRec(i));
//            System.out.print("  非递归:" + getNum(i));
//            System.out.println();
//        }
        System.out.println("ab".charAt(1));
    }
}
