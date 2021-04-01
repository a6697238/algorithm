package com.algorithm.analyze.sort;

import java.util.Arrays;

/**
 * 类名称: FastSort <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/7/9 下午2:26
 */
public class HeapSort {

    public static void sort(int[] array) {
        int len = array.length - 1;
        for (int i = len / 2 - 1; i >= 0; i--) {
            adjustify(array, i, len);
        }
        for (int i = array.length - 1; i >= 0; i--) {
            swap(array, 0, i);
            adjustify(array, 0, i - 1);
        }
    }

    public static void adjustify(int[] arr, int i, int len) {
        int left, right, j;
        while ((left = 2 * i + 1) <= len) {
            //判断当前父节点有无左节点（即有无孩子节点，left为左节点）
            right = left + 1;
            //右节点
            j = left;
            //j"指针指向左节点"
            if (j < len && arr[left] < arr[right])
            //右节点大于左节点
            {
                j++;     //当前把"指针"指向右节点
            }
            if (arr[i] < arr[j])
            //将父节点与孩子节点交换（如果上面if为真，则arr[j]为右节点，如果为假arr[j]则为左节点）
            {
                swap(arr, i, j);
            } else         //说明比孩子节点都大，直接跳出循环语句
            {
                break;
            }
            i = j;
        }
    }


    public static void swap(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }

    public static void main(String[] args) {
        int[] test = new int[]{5, 4, 1, 2, 3, 1, 7};
        sort(test);
        System.out.println(Arrays.toString(test));
    }
}
