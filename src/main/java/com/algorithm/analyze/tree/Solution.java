//package com.algorithm.analyze.tree;
//
//import java.util.PriorityQueue;
//
//public class Solution {
//    static int BUCKET_SIZE = 10000;
//
//    public static  class Median {
//
//        private int left = 0;
//        private int right = Integer.MAX_VALUE;
//
//        // 流这里用int[] 代替
//        public double findMedian(int[] nums) {
//            // 第一遍读取stream 将问题复杂度转化为内存可接受的量级.
//            int[] bucket = new int[BUCKET_SIZE];
//            int step = (right - left) / BUCKET_SIZE;
//            boolean even = true;
//            int sumCount = 0;
//            for (int i = 0; i < nums.length; i++) {
//                int index = nums[i] / step;
//                bucket[index] = bucket[index] + 1;
//                sumCount++;
//                even = !even;
//            }
//
//            int topK = even ? sumCount / 2 : sumCount / 2 + 1;
//
//            int index = 0;
//            int indexBucketCount = 0;
//            for (index = 0; index < bucket.length; index++) {
//                indexBucketCount = bucket[index];
//                if (indexBucketCount >= topK) {
//                    // 当前bucket 就是中位数的bucket.
//                    break;
//                }
//                topK -= indexBucketCount;
//            }
//
//            // 划分到这里其实转化为一个topK的问题, 再读一遍流.
//            if (even && indexBucketCount == topK) { // 偶数的时候, 恰好划分到在左右两个子段中.
//                // (左边最大 + 右边最小) / 2
//                // 左边 [topIndex-K + (topIndex-K + 1)] / 2.
//                left = index * step;
//                right = (index + 2) * step;
//                return helperEven(nums, topK, index, step);
//            } else if (even) {
//                // 左边 [topIndex-K + (topIndex-K + 1)] / 2.
//                left = index * step;
//                right = (index + 1) * step;
//                return helperEven(nums, topK, index, step);
//            } else {
//                // 奇数, 左边topIndex-K
//                // 最小堆, 求第k个大的数
//                left = index * step;
//                right = (index + 1) * step;
//                return helperOdd(nums, topK, index, step);
//            }
//        }
//
//        private double helperOdd(int[] nums, int topK, int index, int step) {
//            PriorityQueue<Integer> min = new PriorityQueue<>();
//            for (int i = 0; i < nums.length; i++) {
//                if (nums[i] >= left && nums[i] <= right) {
//                    if (min.size() == topK) {
//                        min.poll();
//                    }
//                    min.add(nums[i]);
//                }
//            }
//            return min.peek();
//        }
//
//        private double helperEven(int[] nums, int topK, int index, int step) {
//            int topK_Next_Num = 0;
//            PriorityQueue<Integer> min = new PriorityQueue<>();
//
//            // 最小堆, 求第k个大的数, 并且求出第k+1 大的数
//            int left = index * step;
//            int right = (index + 1) * step;
//
//            for (int i = 0; i < nums.length; i++) {
//                if (nums[i] >= left && nums[i] <= right) {
//                    if (min.size() == topK) {
//                        topK_Next_Num = min.poll();
//                    }
//                    min.add(nums[i]);
//                }
//            }
//
//            int topK_num = min.peek();
//            return (topK_num + topK_Next_Num) / 2.0;
//        }
//    }
//
//    public static void main(String[] args) {
//        Median median = new Median();
//        int[] nums = new int[]{1, 2, 3, 4};
//        System.out.println(median.findMedian(nums));
//        System.out.println("------");
//
//        median = new Median();
//        nums = new int[]{1, 2, 3, 4, 5};
//        System.out.println(median.findMedian(nums));
//        System.out.println("------");
//
//        median = new Median();
//        nums = new int[]{1, 1, 1, 1};
//        System.out.println(median.findMedian(nums));
//        System.out.println("------");
//
//        median = new Median();
//        nums = new int[10000000];
//        for (int i = 0; i < 10000000; i++) {
//            nums[i] = i;
//        }
//
//        System.out.println(median.findMedian(nums));
//        System.out.println("------");
//
//        median = new Median();
//        nums = new int[100000000];
//        for (int i = 0; i < 100000000; i++) {
//            nums[i] = 1;
//        }
//        System.out.println(median.findMedian(nums));
//        System.out.println("------");
//
//        median = new Median();
//        nums = new int[100000 - 1];
//        for (int i = 0; i < 100000 - 1; i++) {
//            nums[i] = i;
//        }
//        System.out.println(median.findMedian(nums));
//        System.out.println("------");
//
//        median = new Median();
//        nums = new int[100000 - 1];
//        for (int i = 0; i < 100000 - 1; i++) {
//            nums[i] = 1;
//        }
//        System.out.println(median.findMedian(nums));
//        System.out.println("------");
//
//        median = new Median();
//        nums = new int[100000 - 1];
//        for (int i = 100000 - 1 - 1; i >=0; i--) {
//            nums[i] = i;
//        }
//        System.out.println(median.findMedian(nums));
//        System.out.println("------");
//    }
//}
