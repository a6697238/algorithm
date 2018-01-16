package com.algorithm.analyze.leetcode.tree;

/**
 * @author Lu Hou
 */
public class SymmetricTree {

    public static void main(String[] args) {
        TreeNode t1= new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(2);
        TreeNode t4 = new TreeNode(3);
        TreeNode t5 = new TreeNode(3);
        TreeNode t6 = new TreeNode(4);
        TreeNode t7 = new TreeNode(4);

        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t6;

        t3.left = t7;
        t3.right = t5;
        System.out.println(isSymmetric(t1));

    }

    public static boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return isMirror(root.left,root.right);
    }

    public static boolean isMirror(TreeNode t1,TreeNode t2){
        if(t1==null&&t2==null){
            return true;
        }
        if((t1==null&&t2!=null)||(t1!=null&&t2==null)){
            return false;
        }
        if(t1.val!=t2.val){
            return false;
        }

        return isMirror(t1.left,t2.right)&&isMirror(t1.right,t2.left);
    }


}
