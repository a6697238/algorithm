package com.algorithm.analyze.str;

/**
 * 类名称: RotationWord <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/7/15 下午8:21
 */
public class RotationWord {

    public static String rotation(String str){
        if(null==str||str.length()<2){
            return str;
        }
        char[] charArray = str.toCharArray();
        int i = 0;
        int j = charArray.length-1;
        while (j>i){
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        String str = "I am a student";
        String reverseStr = rotation(str);
        String[] strArray = reverseStr.split(" ");
        String[] newStr = new String[strArray.length];
        for(int i=0;i<newStr.length;i++){
            newStr[i] = rotation(strArray[i]);
        }
        String out = "";
        for(String newWord : newStr){
            out = out + newWord + " ";
        }
        System.out.println(out.substring(0,out.length()-1));
    }
}
