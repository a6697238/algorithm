package com.algorithm.analyze.leetcode.tree;

/**
 * @author Lu Hou
 */
public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if(null==root){
            return root;
        }
        TreeNode treeNode = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(treeNode);
        return root;
    }
}
