package com.algorithm.analyze.leetcode.tree;

/**
 * @author Lu Hou
 */
public class ValidateBinarySearchTree {

    public static void main(String[] args) {
        TreeNode t10 = new TreeNode(10);
        TreeNode t5 = new TreeNode(5);
        TreeNode t15 = new TreeNode(15);
        TreeNode t6 = new TreeNode(6);
        TreeNode t20 = new TreeNode(20);

        t10.left = t5;
        t10.right = t15;
        t15.left = t6;
        t15.right = t20;

        System.out.println(isValidBST(t10));
    }

    public static boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;
        return validate(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean validate(TreeNode root, int min, int max) {
        if (root == null) return true;
        if (root.val <= min || root.val >= max) return false;
        return validate(root.left, min, root.val) && validate(root.right, root.val, max);
    }


}
