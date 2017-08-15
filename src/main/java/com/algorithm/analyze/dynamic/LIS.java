package com.algorithm.analyze.dynamic;

/**
 * 类名称: LIS <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/7/12 下午11:42
 */
public class LIS {

    public static int getLisNum(int[] array){
        int[] lengthArray = new int[array.length];
        lengthArray[0] = 1;
        int max = 0;
        for(int i=0;i<array.length;i++){
            lengthArray[i] = 1;
            for(int j=0;j<i;j++){
                if(array[i]>array[j]&&lengthArray[j]+1>lengthArray[i]){
                    lengthArray[i] = lengthArray[j]+1;
                }
            }
            if(max<lengthArray[i]){
                max = lengthArray[i];
            }
        }

        return max;

    }

    public static void main(String[] args) {
        int[] array = new int[]{1,4,5,7,2,1,3,2,1};
        System.out.println(getLisNum(array));
    }


}
