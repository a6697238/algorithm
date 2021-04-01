package com.algorithm.analyze.dynamic;

/**
 * 类名称: LCS <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/7/16 上午11:23
 */
public class LCS {

    public static String getLcs(String str1,String str2){
        int length = Math.max(str1.length(),str2.length());
        int[][] state = new int[length][length];
        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();

        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                if(str1Array[i]==str2Array[j]){
                    if(i==0||j==0){
                        state[i][j] = 1;
                    }else {



                        state[i][j] = state[i-1][j-1]+1;
                    }
                }
            }
        }
        int maxLength = 0;
        int end = 0;
        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                if(state[i][j]>maxLength){
                    maxLength = state[i][j];
                    end = i;
                }
            }
        }


        return str1.substring(end-maxLength+1,maxLength);
    }

    public static void main(String[] args) {
        String str1 = "abauyiuasd";
        String str2 = "caba12313";
        System.out.println(getLcs(str1,str2));
    }
}
