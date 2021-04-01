package com.algorithm.analyze.niuke;

import com.algorithm.analyze.tree.TreeNode;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class Solution {

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;

        print(treeNode1);
    }

    public static void print(TreeNode treeNode){
        Queue<TreeNode> queue = new LinkedBlockingQueue<>();
        queue.add(treeNode);
        while (!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                if (i==0){
                    System.out.println(node.count);
                }
                if(null!=node.left){
                    queue.add(node.left);
                }
                if(null!=node.right){
                    queue.add(node.right);
                }
            }
        }
    }


}