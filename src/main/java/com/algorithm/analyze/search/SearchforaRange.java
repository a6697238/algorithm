package com.algorithm.analyze.search;

import java.util.Arrays;

/**
 * @author Lu Hou
 */
public class SearchforaRange {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{1,1,1,1,2,2,2,2,3},2)));
    }

    public static int[] searchRange(int[] A, int target) {
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        if(A==null || A.length==0)
        {
            return res;
        }
        int l=0;
        int r=A.length-1;
        int m=(l+r)/2;
        while(l<=r)
        {
            m=(l+r)/2;
            if(A[m]==target)
            {
                res[0]=m;
                res[1]=m;
                break;
            }
            else if(A[m]>target)
            {
                r = m-1;
            }
            else
            {
                l = m+1;
            }
        }
        if(A[m]!=target)
            return res;
        int newL = m;
        int newR = A.length-1;
        while(newL<=newR)
        {
            int newM=(newL+newR)/2;
            if(A[newM]==target)
            {
                newL = newM+1;
            }
            else
            {
                newR = newM-1;
            }
        }
        res[1]=newR;
        newL = 0;
        newR = m;
        while(newL<=newR)
        {
            int newM=(newL+newR)/2;
            if(A[newM]==target)
            {
                newR = newM-1;
            }
            else
            {
                newL = newM+1;
            }
        }
        res[0]=newL;

        return res;
    }
}
