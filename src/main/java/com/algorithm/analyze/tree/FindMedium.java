package com.algorithm.analyze.tree;

import java.util.PriorityQueue;

/**
 * AUTO-GENERATED: houlu @ 2019/3/10 上午12:15
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class FindMedium {

    public static double findMedium(int[] stream) {
        //共计 1W个桶子，内存大小 100W
        int bucketNum = 10000;
        int memory = 100;
        //考虑到可能 后面要读取 2个桶，所以 保证每个桶大小 为 内存 1/2
        int hash = memory / 2 * bucketNum;

        int[] bucket = new int[bucketNum];
        int sumCount = 0;

        //统计 流里面多少个数据 落到每个 桶里面
        for (int i = 0; i < stream.length; i++) {
            int index = stream[i] / hash;
            bucket[index] = bucket[index] + 1;
            sumCount++;
        }

        //根据奇偶确定中位数位置
        int mediumIndex = 0;
        boolean isEven = true;
        if (sumCount % 2 == 0) {
            mediumIndex = sumCount / 2;
            isEven = true;
        } else {
            mediumIndex = sumCount / 2 + 1;
            isEven = false;
        }

        //累加每个bucket里面的 元素个数
        int sumBucketCount = 0;
        int bucketIndex = 0;
        for (int i = 0; i < bucket.length; i++) {
            sumBucketCount += bucket[i];
            if (sumBucketCount >= mediumIndex) {
                bucketIndex = i;
                break;
            }
        }
        //bucketCount索引位置超过了中位数,实际上要找的的就是
        //即  B1 B2  ....B3[e,e,e,medium,e,e,]  B4
        //定位到  B3 为中位数 bucket，且中位数位置为 B3中的 top(medium-B1-B2)
        int leftTop = mediumIndex - (sumBucketCount - bucket[bucketIndex]);
        int start = 0;
        int end = 0;
        if (leftTop == 0) {
            if (isEven) {
                start = hash * bucketIndex;
                end = hash * (bucketIndex + 2);
                return isEven(stream, leftTop, start, end);
            } else {
                start = hash * bucketIndex;
                end = hash * (bucketIndex + 2);
                return isOdd(stream, leftTop, start, end);
            }
        } else {
            if (isEven) {
                start = hash * bucketIndex;
                end = hash * (bucketIndex + 1);
                return isEven(stream, leftTop, start, end);
            } else {
                start = hash * bucketIndex;
                end = hash * (bucketIndex + 1);
                return isOdd(stream, leftTop, start, end);
            }
        }


    }


    private static double isOdd(int[] nums, int leftTop, int start, int end) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        //遍历流
        for (int i = 0; i < nums.length; i++) {
            //在某个Bucket区间内的数据留下
            if (nums[i] >= start && nums[i] <= end) {
                if (minHeap.size() == leftTop) {
                    minHeap.remove();
                }
                minHeap.offer(nums[i]);
            }
        }
        return minHeap.peek();
    }

    private static double isEven(int[] nums, int leftTop, int start, int end) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int leftTopPre = 0;
        int leftTopAfter = 0;

        //遍历流
        for (int i = 0; i < nums.length; i++) {
            //在某个Bucket区间内的数据留下
            if (nums[i] >= start && nums[i] <= end) {
                if (minHeap.size() == leftTop) {
                    leftTopAfter = minHeap.poll();
                }
                minHeap.offer(nums[i]);
            }
        }
        leftTopPre = minHeap.poll();
        return (leftTopPre + leftTopAfter) * 1.0 / 2;
    }


    public static void main(String[] args) {

        int[] nums = new int[]{1, 2};
        System.out.println(findMedium(nums));
        System.out.println("");

        nums = new int[]{1, 2, 3};
        System.out.println(findMedium(nums));
        System.out.println("");


        nums = new int[]{1, 1, 1, 1};
        System.out.println(findMedium(nums));
        System.out.println("");

        nums = new int[500000];
        for (int i = 0; i < 500000; i++) {
            nums[i] = i;
        }
        System.out.println(findMedium(nums));
        System.out.println("");

        nums = new int[500001];
        for (int i = 0; i < 500001; i++) {
            nums[i] = i;
        }
        System.out.println(findMedium(nums));
        System.out.println("");

    }
}
