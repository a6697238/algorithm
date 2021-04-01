package com.algorithm.analyze.dynamic;

/**
 * 类名称: Distance <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/7/17 下午9:49
 */
public class Distance {

    public static int getDistance(String str1, String str2) {

        int[][] distance = new int[str1.length()+1][str2.length()+1];
        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();

        for(int i=0;i<str1.length()+1;i++){
            distance[i][0] = i;
        }
        for(int i=0;i<str2.length()+1;i++){
            distance[0][i] = i;
        }

        for(int i=1;i<str1.length()+1;i++){
            for(int j=1;j<str2.length()+1;j++){
                int min = Math.min(distance[i][j-1]+1,distance[i-1][j]+1);
                if(str1Array[i-1]==str2Array[j-1]){
                    min =  Math.min(distance[i-1][j-1],min);
                }else {
                    min =  Math.min(distance[i-1][j-1]+1,min);
                }
                distance[i][j] = min;
            }
        }
        for(int i=0;i<str1.length()+1;i++){
            for(int j=0;j<str2.length()+1;j++){
                System.out.print(distance[i][j]);
            }
            System.out.println("");
        }

        return distance[str1.length()][str2.length()];
    }

    public static void main(String[] args) {
        String s1 = "china";
        String s2 = "chiao";
        System.out.println(getDistance(s1,s2));
    }
}
