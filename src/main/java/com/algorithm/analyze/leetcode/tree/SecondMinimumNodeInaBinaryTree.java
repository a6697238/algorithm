package com.algorithm.analyze.leetcode.tree;

import java.util.Stack;

/**
 * AUTO-GENERATED: houlu @ 2019/1/17 下午10:38
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class SecondMinimumNodeInaBinaryTree {

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(5);
        TreeNode treeNode2 = new TreeNode(8);
        TreeNode treeNode3 = new TreeNode(5);

        treeNode2.left = treeNode1;
        treeNode2.right = treeNode3;

        findSecondMinimumValue(treeNode2);
    }


    public static int findSecondMinimumValue(TreeNode root) {

        if(root==null){
            return -1;
        }
        int count = 0;
        int last = Integer.MIN_VALUE;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;
        while (true){
            while (cur!=null){
                stack.push(cur);
                cur = cur.left;
            }

            if(stack.isEmpty()){
                break;
            }

            cur = stack.pop();
            if(cur.val>last){
                last = cur.val;
                count++;
            }
            if(count==2){
                return cur.val;
            }
            cur = cur.right;
        }
        return -1;

    }

}
