package com.algorithm.analyze.leetcode.string;

/**
 * @author Lu Hou
 */
public class ImplementStrStr {

    public static void main(String[] args) {
        String haystack = "";
        String needle = "";
        System.out.println(strStr(haystack, needle));


    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }
        if("".equals(needle)){
            return 0;
        }
        char[] haystackArray = haystack.toCharArray();
        char[] needleArray = needle.toCharArray();
        for (int i = 0; i < haystack.length(); i++) {
            if (needleArray.length>0&&haystackArray[i] == needleArray[0]) {
                if(needle.length()<=haystack.length()-i){
                    int ne = 0;
                    for (int k = 0; k < needle.length(); k++) {
                        if (haystackArray[i + k] != needleArray[k]) {
                            ne++;
                        }
                    }
                    if (ne == 0) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

}
