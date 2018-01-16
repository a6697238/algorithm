package com.algorithm.analyze.leetcode.tree;

/**
 * @author Lu Hou
 */
public class MergeTwoBinaryTrees {

    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(null==t1) return t2;
        if(null == t2) return t1;
        TreeNode treeNode = new TreeNode(0);
        treeNode.val = t1.val+t2.val;
        treeNode.left = mergeTrees(t1.left,t2.left);
        treeNode.right = mergeTrees(t1.right,t2.right);
        return treeNode;
    }



}
