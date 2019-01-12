package com.algorithm.analyze.leetcode.string;

/**
 * AUTO-GENERATED: houlu @ 2019/1/11 下午11:22
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class LengthofLastWord {

    public int lengthOfLastWord(String s) {
        if(s.length()==0){
            return 0;
        }
        String[] array = s.split(" ");
        if(array.length==0){
            return 0;
        }
        return array[array.length-1].length();

    }

}
