package com.algorithm.analyze.leetcode.tree;

/**
 * AUTO-GENERATED: houlu @ 2019/1/16 下午10:27
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class FlattenBinaryTreetoLinkedList {

    public void flatten(TreeNode root) {
        if(root == null) return;
        TreeNode left = root.left;
        TreeNode right =root.right;
        flatten(left);
        flatten(right);
        root.left = null;
        if(left == null && right == null) return;
        if(left == null) {
            root.right = right;
            return;
        }
        if(right == null) {
            root.right = left;
            return;
        }
        TreeNode current = left;
        while(current.right!=null) {
            current = current.right;
        }
        current.right = right;
        root.right = left;


    }


}
