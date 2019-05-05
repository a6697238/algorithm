package com.algorithm.analyze.leetcode.tree;

/**
 * AUTO-GENERATED: houlu @ 2019/1/19 上午9:18
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class LowestCommonAncestorofaBinarySearchTree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(null == root || null==p || null==q){
            return null;
        }

        if(root==p || root==q){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);

        if(right==null){
            return left;
        }else if(left == null){
            return right;
        }
        return root;

    }
}
