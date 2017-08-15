package com.algorithm.analyze.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 类名称: FastSort <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/7/9 下午2:26
 */
public class FastSort {

    public static void sort(int[]array,int low,int high){
        int i=low;
        int j=high;
        if(low>=high){
            return;
        }
        int flag = array[i];
        while(i<j){
            while(i<j&&array[j]>flag){
                j--;
            }
            if(i<j){
                array[i] = array[j];
                i++;
            }
            while (i<j && array[i]<flag){
                i++;
            }
            if(i<j){
                array[j] = array[i];
                j--;
            }
        }
        array[i] = flag;
        System.out.println(Arrays.toString(array));

        sort(array,low,i-1);
        sort(array,i+1,high);
    }

    public static void main(String[] args) {
        int[] test = new int[]{5,4,1,2,3,1,7};
        sort(test,0,test.length-1);
        System.out.println(Arrays.toString(test));
    }
}
