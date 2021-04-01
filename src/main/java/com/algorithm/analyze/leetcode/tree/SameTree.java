package com.algorithm.analyze.leetcode.tree;

/**
 * AUTO-GENERATED: houlu @ 2019/1/12 上午9:23
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(null == p && null == q){
            return true;
        }
        if(null==p){
            return false;
        }
        if(null==q){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }

        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }



}
