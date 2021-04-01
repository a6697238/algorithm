package com.algorithm.analyze.leetcode.tree;

/**
 * AUTO-GENERATED: houlu @ 2019/1/17 下午10:49
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class SumofLeftLeaves {

    public static void main(String[] args) {
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode9 = new TreeNode(9);
        TreeNode treeNode20 = new TreeNode(20);
        TreeNode treeNode15 = new TreeNode(15);
        TreeNode treeNode7 = new TreeNode(7);

        treeNode3.left = treeNode9;
        treeNode3.right = treeNode20;
        treeNode20.left = treeNode15;
        treeNode20.right = treeNode7;

        sumOfLeftLeaves(treeNode3);

    }

    public static int sumOfLeftLeaves(TreeNode root) {
       return getLeftVal(root,true);
    }

    public static int getLeftVal(TreeNode root,boolean isLeft) {
        if(root==null){
            return 0;
        }

        if(root.left==null&&root.right==null&&!isLeft){
            return 0;
        }

        if(root.left==null&&root.right==null&&isLeft){
            return root.val;
        }

        int left = getLeftVal(root.left,true);
        int right = getLeftVal(root.right,false);
        return left+right;

    }

}
