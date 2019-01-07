package com.algorithm.analyze.sort;

import java.util.Arrays;

/**
 * 类名称: MergeSort <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/7/9 下午7:45
 */
public class MergeSort {

    public static void merge(int[] array,int low,int mid,int high){
        int[] temp = new int[high-low+1];
        int i = low;// 左指针
        int j = mid + 1;// 右指针
        int k = 0;
        while (i<=mid && j <=high){
            if(array[i]<array[j]){
                temp[k++] = array[i++];
            }else {
                temp[k++] = array[j++];
            }
        }
        while (i <=mid){
            temp[k++] = array[i++];
        }
        while (j<=high) {
            temp[k++] = array[j++];
        }

        // 把新数组中的数覆盖nums数组
        for (int k2 = 0; k2 < temp.length; k2++) {
            array[k2 + low] = temp[k2];
        }
    }

    public static void mergeSort(int[] a, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            // 左边
            mergeSort(a, low, mid);
            // 右边
            mergeSort(a, mid + 1, high);
            // 左右归并
            merge(a, low, mid, high);
            System.out.println(Arrays.toString(a));
        }

    }


    public static void main(String[] args) {
        int a[] = { 51, 46, 20, 18, 65, 97, 82, 30, 77, 50 };
        mergeSort(a, 0, a.length - 1);
        System.out.println("排序结果：" + Arrays.toString(a));
    }

}
