package com.algorithm.analyze.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * AUTO-GENERATED: houlu @ 2019/1/13 下午9:06
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        helper(list,root);
        return list;
    }

    public void helper(List<Integer> list,TreeNode treeNode){
        if(treeNode==null){
            return;
        }
        list.add(treeNode.val);
        helper(list,treeNode.left);
        helper(list,treeNode.right);
    }
}
