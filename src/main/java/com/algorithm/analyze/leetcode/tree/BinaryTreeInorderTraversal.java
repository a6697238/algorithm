package com.algorithm.analyze.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lu Hou
 */
public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        traversal(root,result);
        return result;
    }

    public static void traversal(TreeNode root,List<Integer> result){
        if(root==null){
            return;
        }
        result.add(root.val);
        traversal(root.left,result);
        traversal(root.right,result);
    }

}
