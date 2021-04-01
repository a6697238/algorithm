package com.algorithm.analyze.leetcode.tree;

import static java.lang.Math.abs;

/**
 * AUTO-GENERATED: houlu @ 2019/1/12 上午8:54
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class BalancedBinaryTree {


    public boolean isBalanced(TreeNode root) {

        if (root == null) {
            return true;
        }

        int left = getDepth(root.left);
        int right = getDepth(root.right);
        if (left - right > 1 || left - right < -1) {
            return false;
        } else {
            return isBalanced(root.left) && isBalanced(root.right);
        }


    }

    public static int getDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = getDepth(root.left) ;
        int right = getDepth(root.right) ;
        return Math.max(left, right) + 1;

    }

}
