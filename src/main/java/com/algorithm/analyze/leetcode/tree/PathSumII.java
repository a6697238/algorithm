package com.algorithm.analyze.leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Lu Hou
 * @date 2017/10/15
 * @time 下午3:28
 */
public class PathSumII {
    public static void main(String[] args) {
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode8 = new TreeNode(8);
        TreeNode treeNode11 = new TreeNode(11);
        TreeNode treeNode13 = new TreeNode(13);
        TreeNode treeNode44 = new TreeNode(4);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode55 = new TreeNode(5);
        TreeNode treeNode1 = new TreeNode(1);

        treeNode5.left = treeNode4;
        treeNode5.right = treeNode8;
        treeNode4.left = treeNode11;
        treeNode11.left = treeNode7;
        treeNode11.right = treeNode2;
        treeNode8.left = treeNode13;
        treeNode8.right = treeNode44;
        treeNode44.left = treeNode55;
        treeNode44.right = treeNode1;

        pathSum(treeNode5,22);
    }

    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> pathList = new ArrayList<List<Integer>>();
        findSumRec(pathList,new ArrayList<Integer>(),sum,root);
        return pathList;
    }

    public static void findSumRec(List<List<Integer>> pathList,List<Integer> treeNodeList,int sum,TreeNode root){
        if(null==root){
            return;
        }
        if(sum==root.val&&null==root.left&&null==root.right){
            List<Integer> treeNodes = new ArrayList<Integer>();
            treeNodeList.add(root.val);
            treeNodes.addAll(treeNodeList);
            pathList.add(treeNodes);
            treeNodeList.remove(treeNodeList.size()-1);
        }else {
            if(null!=root.left) {
                treeNodeList.add(root.val);
                findSumRec(pathList,treeNodeList,sum-root.val,root.left);
                treeNodeList.remove(treeNodeList.size()-1);
            }
            if(null!=root.right){
                treeNodeList.add(root.val);
                findSumRec(pathList,treeNodeList,sum-root.val,root.right);
                treeNodeList.remove(treeNodeList.size()-1);
            }
        }
    }



}
