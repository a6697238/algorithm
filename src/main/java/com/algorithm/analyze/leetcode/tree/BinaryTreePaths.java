package com.algorithm.analyze.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * AUTO-GENERATED: houlu @ 2019/1/16 下午11:15
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class BinaryTreePaths {

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode5 = new TreeNode(5);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode5;

        binaryTreePaths(treeNode1);

    }

    public static List<String> binaryTreePaths(TreeNode root) {

        List<String> list = new ArrayList<String>();
        getPath(list, "", root);
        return list;

    }

    public static void getPath(List<String> list, String str, TreeNode root) {
        if (root == null) {
            return;
        }

        if (root.right == null && root.left == null) {
            list.add(str + root.val);
            return;
        }

        getPath(list, str+root.val + "->", root.left);
        getPath(list, str+root.val + "->", root.right);

    }

}
