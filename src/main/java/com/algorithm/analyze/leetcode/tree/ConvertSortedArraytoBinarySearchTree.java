package com.algorithm.analyze.leetcode.tree;

/**
 * AUTO-GENERATED: houlu @ 2019/1/12 上午10:59
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class ConvertSortedArraytoBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums,0,nums.length-1);
    }

    public TreeNode buildTree(int[] num, int low, int high){
        if(low>high)
            return null;

        int mid = (low+high)/2;
        TreeNode node = new TreeNode(num[mid]);
        node.left = buildTree(num,low,mid-1);
        node.right = buildTree(num,mid+1,high);
        return node;
    }



}
