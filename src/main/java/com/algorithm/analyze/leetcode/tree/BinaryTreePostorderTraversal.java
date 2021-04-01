package com.algorithm.analyze.leetcode.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * AUTO-GENERATED: houlu @ 2019/1/16 下午10:58
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class BinaryTreePostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(null==root){
            return list;
        }
        Stack<TreeNode> s = new Stack<TreeNode>();
        Stack<TreeNode> out = new Stack<TreeNode>();

        s.push(root);
        while (!s.isEmpty()) {
            TreeNode cur = s.pop();
            out.push(cur);

            if (cur.left != null) {
                s.push(cur.left);
            }
            if (cur.right != null) {
                s.push(cur.right);
            }
        }

        while (!out.isEmpty()) {
            list.add(out.pop().val);
        }
        return list;

    }


}
