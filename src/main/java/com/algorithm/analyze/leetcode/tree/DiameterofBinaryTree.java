package com.algorithm.analyze.leetcode.tree;

/**
 * @author Lu Hou
 */
public class DiameterofBinaryTree {

    public int diameterOfBinaryTree(TreeNode root) {
        if(null==root){
            return 0;
        }
        return Math.max(findLength(root).dep,findLength(root).cross);
    }

    private static ResSet findLength(TreeNode root){
        ResSet resSet = new ResSet();
        if(root==null){
            return resSet;
        }
        resSet.dep = Math.max(findLength(root.left).dep,findLength(root.right).dep)+1;
        resSet.cross = findLength(root.left).dep +findLength(root.right).dep+2;
        return resSet;
    }

    private static class ResSet{
        public int dep = -1;
        public int cross = -1;
    }
}
