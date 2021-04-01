package com.algorithm.analyze.leetcode.tree;

import com.algorithm.analyze.tree.TreeNode;

/**
 * @author Lu Hou
 */
public class ConvertBSTtoGreaterTree {

    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode newTree = copyTree(root);
        return null;
    }

    private static TreeNode copyTree(TreeNode root) {
        if (null == root || (root.left == null && root.right == null)) {
            return root;
        }
        TreeNode treeNode = new TreeNode(root.count);
        treeNode.left = copyTree(root.left);
        treeNode.right = copyTree(root.right);
        return treeNode;
    }

}
