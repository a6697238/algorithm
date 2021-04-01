package com.algorithm.analyze.leetcode.tree;

/**
 * AUTO-GENERATED: houlu @ 2019/1/16 下午10:43
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class SumRoottoLeafNumbers {

    public int sumNumbers(TreeNode root) {
        return sumNumbersDFS(root,0);
    }

    public static int sumNumbersDFS(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }

        sum = sum * 10 + root.val;
        if (null == root.left && null == root.right) {
            return sum;
        }
        return sumNumbersDFS(root.left,sum) + sumNumbersDFS(root.right,sum);

    }


}
