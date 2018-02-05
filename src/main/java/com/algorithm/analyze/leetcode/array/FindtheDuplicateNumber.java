package com.algorithm.analyze.leetcode.array;

import java.util.Arrays;

/**
 * @author Lu Hou
 */
public class FindtheDuplicateNumber {

    public int findDuplicate(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int a[] = { 51, 46, 20, 18, 65, 97, 82, 30, 77, 50 };
//        mergeSort(a, 0, a.length - 1);
        fastSort(a,0,a.length-1);
        System.out.println("排序结果：" + Arrays.toString(a));
    }

    public static void merge(int[] nums,int start,int end){
        int len = end-start+1;
        int[] temp = new int[len];
        int l = start;
        int mid = (start+end)/2;
        int h = mid+1;
        int k = 0;
        while (l<=mid&&h<=end){
            if(nums[l]<nums[h]){
                temp[k++] = nums[l++];
            }else {
                temp[k++] = nums[h++];
            }
        }
        while (l<=mid){
            temp[k++] = nums[l++];
        }
        while (h<=end){
            temp[k++] = nums[h++];
        }
        for(int i=0;i<len;i++){
            nums[start+i] = temp[i];
        }
    }

    public static void mergeSort(int[] nums,int start,int end){
        if(start<end){
            int mid = (start+end)/2;
            mergeSort(nums,mid+1,end);
            mergeSort(nums,start,mid);
            merge(nums,start,end);
        }
    }


    public static void fastSort(int[] nums,int start,int end){
        if(end<start){
            return;
        }
        int l = start;
        int h = end;
        int flag = nums[l];
        while (h>l){
            while (nums[h]>flag&&h>l){
                h--;
            }
            if(h>l){
                nums[l] = nums[h];
                l++;
            }
            while (nums[l]<flag&&h>l){
                l++;
            }
            if(h>l){
                nums[h] = nums[l];
                h--;
            }
        }
        nums[l] = flag;
//        int mid = (start+end)/2;
        fastSort(nums,start,l-1);
        fastSort(nums,l+1,end);
    }
}
