package com.algorithm.analyze.leetcode.tree;

/**
 * @author Lu Hou
 */
public class PathSumIII {

    public static int k = 0;

    public int pathSum(TreeNode root, int sum) {
        helper(root,sum);
        return k;
    }

    public static void helper(TreeNode root,int sum){
        if(root==null){
            return;
        }
        if(root.val==sum){
            k++;
        }
        helper(root.left,sum-root.val);
        helper(root.right,sum-root.val);

    }

}
