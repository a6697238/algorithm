package com.algorithm.analyze.search;

/**
 * 类名称: BianarySearch <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/7/10 下午11:14
 */
public class BianarySearch {

    public static int search(int[] array,int data,int begin,int end){
        int index = 0;
        int mid = (begin+end)/2;
        if(data<array[begin]||data>array[end]||begin>end){
            return -1;
        }
        if(data>array[mid]){
            return search(array,data,mid+1,end);
        }
        else if(data<array[mid]){
            return search(array,data,begin,mid-1);
        }else{
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,6,7,8,9};
        System.out.println(search(array,1,0,array.length-1));
    }
}
