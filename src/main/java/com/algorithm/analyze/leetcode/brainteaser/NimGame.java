package com.algorithm.analyze.leetcode.brainteaser;

/**
 * @author Lu Hou
 * @date 2017/10/5
 * @time 下午3:22
 */
public class NimGame {

    public static void main(String[] args) {


    }


    /**
     * leetCode 292题
     *
     * https://leetcode.com/problems/nim-game/description/
     *
     * f[0]必输  f[1-3]必胜
     * f[4]必输  f[5-7]必胜
     * f[base+1] 必输  f[base+1+base] 必胜
     *
     * 你先拿，只要对手可以一步达到必输状态，你就输了
     *
     * @param n
     * @return
     */
    public static boolean canWinNim(int n) {
        if(n%4==0){
            return false;
        }
        return true;
    }
}
