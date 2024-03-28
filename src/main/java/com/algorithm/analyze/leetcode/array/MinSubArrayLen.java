package com.algorithm.analyze.leetcode.array;

/**
 * 功能描述：
 *
 * @Author: winghou
 * @Date: 2022/9/6 3:52 下午
 */
public class MinSubArrayLen {

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        minSubArrayLen(11,array);

    }

    public static int minSubArrayLen(int target, int[] nums) {
        // 步骤1：初始化变量
        // - 用左右指针l, r记录左闭右闭“窗口”[l, r]
        // - min存放满足条件的子区间元素数量
        // - sum存放子区间数据和
        int l = 0, r = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        // 步骤2：一层循环，其循环条件为左右指针不均越界
        while (r < nums.length && l < nums.length) {
            // 步骤3：更新子窗口和，由于每次循环只向右扩大1个单位，故只需累加当前窗口最右元素值
            sum += nums[r++];

            // 步骤4：二层循环，循环条件：窗口满足条件题目特征sum >= target
            while (sum >= target) {
                // 4.1 ：如果满足题目判断条件>=target，则更新子窗口尺寸
                min = Math.min(min, r - l);
                // 4.2 窗口左指针右移，并更新窗口和
                sum -= nums[l++];
            }
        }
        // 步骤5：若min仍为初始值，说明不存在，返回0；否则返回min
        return (min == Integer.MAX_VALUE) ? 0 : min;
    }

}
