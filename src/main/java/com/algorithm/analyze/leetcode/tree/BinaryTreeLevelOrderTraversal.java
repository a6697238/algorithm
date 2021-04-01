package com.algorithm.analyze.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author Lu Hou
 */
public class BinaryTreeLevelOrderTraversal {

    public static void main(String[] args) {
        TreeNode t10 = new TreeNode(10);
        TreeNode t5 = new TreeNode(5);
        TreeNode t15 = new TreeNode(15);
        TreeNode t6 = new TreeNode(6);
        TreeNode t20 = new TreeNode(20);

        t10.left = t5;
        t10.right = t15;
        t15.left = t6;
        t15.right = t20;

        levelOrder(t10);
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        if (null != root) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            List<Integer> rList = new ArrayList<Integer>();
            int time = queue.size();
            for (int i = 0; i < time; i++) {
                TreeNode temp = queue.poll();
                rList.add(temp.val);
                if (null != temp.left) {
                    queue.add(temp.left);
                }
                if (null != temp.right) {
                    queue.add(temp.right);
                }
            }
            lists.add(rList);
        }
        return lists;
    }

}
