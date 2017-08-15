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

    public static int getNum(int i){
        if (i==1||i==0){
            return 1;
        }

        return getNum(i-1)+getNum(i-2);
    }

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println(getNum(i));
        }
    }
}
