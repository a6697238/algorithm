package com.algorithm.analyze.dynamic;

/**
 * 类名称: LCS <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/7/16 上午11:23
 */
public class LCSequence {

    public static String getLcs(String str1, String str2) {
        int[][] state = new int[str1.length()][str2.length()];
        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();

        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1Array[i] == str2Array[j]) {
                    if (i == 0) {
                        state[i][j] = 1;
                    } else if (j == 0) {
                        state[i][j] = 1;
                    } else {
                        state[i][j] = state[i-1][j-1]+1;
                    }
                }else {
                    if(i==0){
                        state[i][j] = state[0][j];
                    }else if(j==0){
                        state[i][j] = state[i][0];
                    }else {
                        state[i][j] = Math.max(state[i-1][j],state[i][j-1]);
                    }
                }
                System.out.print(state[i][j]);
            }
            System.out.println("");
        }
        return null;
    }

    public static void main(String[] args) {
        String str1 = "abauyiuasd";
        String str2 = "cab11au13";
        System.out.println(getLcs(str1, str2));
    }
}
