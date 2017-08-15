package com.algorithm.analyze.dynamic;

/**
 * 类名称: LongEcho <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/7/15 下午11:56
 */
public class LongEcho {

    public static int maxEcho(String str){
        char[] charArray = str.toCharArray();
        boolean[][] state = new boolean[charArray.length][charArray.length];
        int start = 0;
        int maxLength = 0;
        int length = charArray.length;


        for(int i=0;i<charArray.length;i++){
            state[i][i] = true;
            if(i<charArray.length-1&&charArray[i]==charArray[i+1]){
                state[i][i+1] = true;
                start=i;
                maxLength=2;
            }
        }

        for(int len=3;len<=length;len++)//子串长度
            for(int i=0;i<=length-len;i++)//子串起始地址
            {
                int j=i+len-1;//子串结束地址
                if(state[i+1][j-1]&&charArray[i]==charArray[j])
                {
                    state[i][j]=true;
                    maxLength=len;
                    start=i;
                }
            }
        System.out.println(str.substring(start,start+maxLength));
        return 0;
    }

    public static void main(String[] args) {
        String str = "deabbafa";
        maxEcho(str);
    }
}
