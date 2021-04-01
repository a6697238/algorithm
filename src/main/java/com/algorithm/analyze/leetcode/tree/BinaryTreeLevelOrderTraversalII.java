package com.algorithm.analyze.leetcode.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * AUTO-GENERATED: houlu @ 2019/1/12 上午9:39
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class BinaryTreeLevelOrderTraversalII {

    public static void main(String[] args) {

        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(1);
        TreeNode treeNode3 = new TreeNode(1);
        TreeNode treeNode4 = new TreeNode(1);
        TreeNode treeNode5 = new TreeNode(1);
        TreeNode treeNode6 = new TreeNode(1);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;

        levelOrderBottom(treeNode1);


    }


    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Queue<TreeNode> linkQueue = new LinkedList<TreeNode>();

        if (null != root) {
            linkQueue.offer(root);
        }
        while (!linkQueue.isEmpty()) {
            List<Integer> levelList = new ArrayList<Integer>();
            int repeat = linkQueue.size();
            for (int i = 0; i < repeat; i++) {
                TreeNode node = linkQueue.poll();
                levelList.add(node.val);
                if (node.left != null) {
                    linkQueue.offer(node.left);
                }

                if (node.right != null) {
                    linkQueue.offer(node.right);
                }
            }
            result.add(levelList);
        }
//        Collections.reverse(result);
        return result;
    }

}
