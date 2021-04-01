package com.algorithm.analyze.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lu Hou
 * @date 2017/10/6
 * @time 下午1:18
 */
public class MajorityElement {

    public static void main(String[] args) {
        System.out.println(majorityElementII(new int[]{1, 2}));

    }

    /**
     * leetCode 169题，统计超过半数元素
     * 共 7 种 解法
     * <p>
     * 1.第一种是Brute force solution，时间复杂度为O(n2)，顾名思义，遍历数组，依次判断每个元素是否为多数元素
     * 2.第二种是Hash table，时间复杂度为O(n)，空间复杂度也为(n)，对数组中的每个元素计数，大于⌊n/2⌋时即为所求结果
     * 3.第三种是Sorting，时间复杂度为O(nlogn)，找到第n/2个元素即可
     * 4.第四种是Randomization，平均时间复杂度为O(n)，最坏情况为无穷大。随机选一个元素，判断其是否为多数元素。(没看懂)
     * 5.第五种是Divide and conquer，时间复杂度为O(nlogn)，将数组分成两半，分别递归查找这两部分的多数元素，若两者相同，则为多数元素，若不同，则其中之一必为多数元素，判断其一即可（没看懂）
     * 6.第六种是Moore voting algorithm，时间复杂度为O(n)，这个算法可能是最为巧妙的一种方法了吧。
     * 维护一个candidate和一个counter，counter初始化为0，之后遍历整个数组，如果counter为0，则 candidate 设置为当前元素，
     * 并且 counter 设置为 1，如果 counter 不为 0，根据当前元素是否为 candidate 来递增或递减 counter。
     * 若数组非空，实际中，也可以直接把 candidate 赋值为数组的第一个元素。
     * 参考Majority Element II，把 candidate 设置为任意值，并且 counter 设为 0 是最自然的一种思路了
     * <p>
     * 7.第七种是Bit manipulation，时间复杂度为O(n)，需要32个计数器，每个计数器记录所有数组某一位的 1 的数目，由于多数元素一定存在，那么 1 的数目和 0 的数目必然不同，多者即为多数元素那一位的取值
     *
     * @param nums
     * @return
     */
    public static int majorityElement(int[] nums) {
        int pos = nums[0];
        int count = 1;
        for (int val : nums) {
            if (pos == val) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                count = 1;
                pos = val;
            }
        }
        return pos;
    }

    /**
     * leetCode 229题
     *
     *
     * 1,   超过n/3的元素个数最多两个
     * 2,   数组中连续3个数据为一组的话,一共n/3组,那么如果存在符合条件的元素,这个元素一定出现在某一个组内两次
     * 3,   知道了以上两个条件后,用所谓的摩尔投票法,共两轮,
     *
     *       第一轮:找出出现次数最多的两个元素,每次存储两个元素n1和n2,如果第三个元素与其中一个相同,则增加计数cn1或cn2,
     *       否则,清除n1和n2,从下一个数据开始重新统计.
     *       根据第二条,数目较多的元素一定可以被查到,当然查到的不一定是大于n/3的.
     *       因为消掉的三元组每个数字都不同，所以如果有大于 n/3的 众数，一定在该三元组里面
     *
     *       第二轮:验证这两个元素是否满足条件,即出现的次数是否大于n/3;
     * @param nums
     * @return
     */
    public static List<Integer> majorityElementII(int[] nums) {

        List<Integer> list = new ArrayList<Integer>();


        int count_1 = 0;
        int count_2 = 0;
        int pos_1 = 0;
        int pos_2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == pos_1) {
                count_1++;
            } else if (nums[i] == pos_2) {
                count_2++;
            } else if (count_1 == 0) {
                pos_1 = nums[i];
                count_1 = 1;
            } else if (count_2 == 0) {
                pos_2 = nums[i];
                count_2 = 1;
            } else {
                count_1--;
                count_2--;
            }
        }
        count_1=0;
        count_2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pos_1) count_1++;
            else if(nums[i]==pos_2) count_2++;
        }
        if(count_1>nums.length/3) list.add(pos_1);
        if(count_2>nums.length/3) list.add(pos_2);

        return list;
    }
}
