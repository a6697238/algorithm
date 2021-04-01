package com.algorithm.analyze.str;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Lu Hou
 */
public class FullArrange {

        public static void arrange(char[] array, int start){
        if (start == array.length-1) {
            System.out.println(Arrays.toString(array));
        } else {
            for (int i = start; i < array.length; i++) {
                swap(array, start, i);
                arrange(array, start + 1);
                swap(array, start, i); // 用于对之前交换过的数据进行还原
            }
        }
    }


    public static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        String str = "abc";
        arrange(str.toCharArray(), 0);
    }
}
