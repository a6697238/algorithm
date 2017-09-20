package com.algorithm.analyze.dynamic;

/**
 * 类名称: Fibonacci <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/7/16 上午11:45
 */
public class MaxSubArray {

    public static String maxSubArray(int[] array){
        int maxSum = 0;
        int currentSum = 0;
        int start = 0;
        int length = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]+currentSum>array[i]){
                currentSum = currentSum + array[i];
                length ++;
            }else {
                currentSum = array[i];
                start = i;
                length = 0;
            }
            if(currentSum>maxSum){
                maxSum = currentSum;
            }
        }
        for(int i=start;i<start+length;i++){
            System.out.print(array[i]+",");
        }
        return "";
    }


    public static void main(String[] args) {
        maxSubArray(new int[]{1, -2, 3, 10, -4, 7, 2, -5});
    }
}
