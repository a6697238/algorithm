package com.algorithm.analyze.leetcode.tree;

import java.util.Stack;

/**
 * @author Lu Hou
 * @date 2017/10/15
 * @time 下午3:28
 */
public class PathSum {

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null) return false;
        Stack<TreeNode> treeStack = new Stack();
        Stack<Integer> sumStack = new Stack<Integer>();
        treeStack.push(root);
        sumStack.push(root.val);
        while (!treeStack.isEmpty()){
            TreeNode tree = treeStack.pop();
            int now = sumStack.pop();
            if(tree.left==null&&tree.right==null){
                if (sum==now) return true;
            }
            if(tree.right!=null){
                treeStack.push(tree.right);
                sumStack.push(now+tree.right.val);
            }
            if(tree.left!=null){
                treeStack.push(tree.left);
                sumStack.push(now+tree.left.val);
            }
        }
        return false;
//        return findRec(root,sum,0);
    }

    public boolean findRec(TreeNode root,int want,int now){
        if(root==null) return false;
        if(root.left==null&&root.right==null){
            return  want==now+root.val;
        }else {
            return (findRec(root.left,want,now+root.val)||findRec(root.right,want,now+root.val));
        }
    }



}
