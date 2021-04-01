package com.algorithm.analyze.leetcode.tree;

/**
 * @author Lu Hou
 */
public class MaximumDepthofBinaryTree {

    public int maxDepth(TreeNode root) {
        if(null==root){
            return 0;
        }

        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;

    }


}
