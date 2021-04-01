package com.algorithm.analyze.leetcode.tree;

import java.util.Stack;

/**
 * AUTO-GENERATED: houlu @ 2019/1/17 下午10:16
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class KthSmallestElementinaBST {

    public int kthSmallest(TreeNode root, int k) {
        if(root==null){
            return -1;
        }
        int count = 0;
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
            count++;
            if(count==k){
                return cur.val;
            }
            cur = cur.right;
        }
        return -1;
    }


}
