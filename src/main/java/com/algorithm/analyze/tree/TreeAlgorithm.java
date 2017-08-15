package com.algorithm.analyze.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 类名称: TreeAlgorithm <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/7/13 上午12:25
 */
public class TreeAlgorithm {

    public static int getDepthRec(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = getDepthRec(root.left);
        int rightDepth = getDepthRec(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static ResultRet getMaxDistanceRec(TreeNode root) {
        ResultRet ret = new ResultRet(-1, -1);
        if (null == root) {
            return ret;
        }
        ResultRet leftResult = getMaxDistanceRec(root.left);
        ResultRet rightResult = getMaxDistanceRec(root.right);
        ret.depth = Math.max(leftResult.depth, rightResult.depth) + 1;

        int cross = leftResult.depth + rightResult.depth + 2;
        int distance = Math.max(cross, leftResult.depth);
        distance = Math.max(distance, rightResult.depth);
        ret.maxDistance = distance;
        return ret;
    }


    public static int getLeafNum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (null == root.left && null == root.right) {
            return 1;
        }
        return getLeafNum(root.left) + getLeafNum(root.right);
    }

    public static int getTreeNum(TreeNode root) {
        if (null == root) {
            return 0;
        }
        int leftNum = getTreeNum(root.left);
        int rightNum = getTreeNum(root.right);
        return leftNum + rightNum + 1;
    }


    public static int getKNum(TreeNode root, int k) {
        if (null == root) {
            return 0;
        }
        if (null != root && k == 0) {
            return 1;
        }
        return getKNum(root.left, k - 1) + getKNum(root.right, k - 1);
    }

    public static TreeNode getCommonNode(TreeNode root, TreeNode r1, TreeNode r2) {
        if (null == root || null == r1 || null == r2) {
            return null;
        }
        if(root==r1||root==r2){
            return root;
        }

        TreeNode left = getCommonNode(root.left, r1, r2);
        TreeNode right = getCommonNode(root.right, r1, r2);

        if (null == left) {
            return right;
        }
        if (null == right) {
            return left;
        }
        return root;

    }
    public static void printLevel(TreeNode root,List<List<TreeNode>> list,int level){
        if(root==null){
            return;
        }
        if(level >= list.size()){
            list.add(new ArrayList<TreeNode>());
        }

        list.get(level).add(root);
        printLevel(root.left,list,level+1);
        printLevel(root.right,list,level+1);
    }

    public static void main(String[] args) {
        TreeNode r1 = new TreeNode(1);
        TreeNode r2 = new TreeNode(2);
        TreeNode r3 = new TreeNode(3);
        TreeNode r4 = new TreeNode(4);
        TreeNode r5 = new TreeNode(5);
        TreeNode r6 = new TreeNode(6);
        TreeNode r7 = new TreeNode(7);

        r1.left = r2;
        r1.right = r3;
        r2.left = r4;
        r2.right = r5;
        r3.right = r6;
        r4.left = r7;


//        System.out.println(getDepthRec(r1));
//        System.out.println(getTreeNum(r1));
//        System.out.println(getLeafNum(r1));
//        System.out.println(getKNum(r1,1));
//        System.out.println(getCommonNode(r1,r5,r7).count);
//        System.out.println(getMaxDistanceRec(r1).maxDistance);
//        List<List<TreeNode>> lists = new ArrayList<List<TreeNode>>();
//        printLevel(r1,lists,0);
//        for(List<TreeNode> treeNodeList : lists){
//            for(TreeNode treeNode : treeNodeList){
//                System.out.print(treeNode.count);
//            }
//            System.out.println();
//        }


    }




}
