package com.algorithm.analyze.leetcode.tree;

/**
 * @author Lu Hou
 */
public class SubtreeofAnotherTree {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (isSame(s, t)) return true;
        if(null!=s){
            return isSubtree(s.left, t) || isSubtree(s.right, t);
        }else {
            return false;
        }
    }

    public static boolean isSame(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        if (t1.val != t2.val) {
            return false;
        }
        return isSame(t1.left, t2.left) && isSame(t1.right, t2.right);
    }

}
