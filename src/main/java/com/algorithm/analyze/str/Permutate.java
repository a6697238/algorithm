package com.algorithm.analyze.str;

/**
 * 类名称: Permutate <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/7/26 下午10:15
 */
public class Permutate {

    private static int total =0;

    public static void swap(String[] str, int i, int j)
    {
        String temp = new String();
        temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    public static void arrange(String[] str,int pos,int length){
        if(pos==length-1){
            for(int i=0;i<str.length;i++){
                System.out.print(str[i]);
            }
            System.out.println("");
        }else {
            for(int i=pos;i<str.length;i++){
                swap(str,pos,i);
                arrange(str,pos+1,str.length);
                swap(str,pos,i);
            }
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str[] = {"a","b","c"};
        arrange(str, 0, str.length);
        System.out.println(total);
    }
}
