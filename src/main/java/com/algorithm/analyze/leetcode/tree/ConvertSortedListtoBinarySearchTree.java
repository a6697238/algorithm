package com.algorithm.analyze.leetcode.tree;

import com.algorithm.analyze.leetcode.list.ListNode;

/**
 * AUTO-GENERATED: houlu @ 2019/1/20 上午9:20
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class ConvertSortedListtoBinarySearchTree {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);

        listNode1.next = listNode2;
        listNode2.next = listNode3;

        sortedListToBST(listNode1);
    }

    public static TreeNode sortedListToBST(ListNode head) {
        if (null == head) {
            return null;
        }

        TreeNode root = null;
        if (head.next == null) {
            root = new TreeNode(head.val);
            root.left = null;
            root.right = null;
            return root;
        }

        ListNode fast = head;
        ListNode slow = head;
        ListNode pre = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            pre = slow;
            slow = slow.next;
        }

        ListNode mid = slow;
        ListNode nexHead =  slow.next;
        pre.next = null;

        root = new TreeNode(mid.val);

        TreeNode left = sortedListToBST(head);
        TreeNode right = sortedListToBST(nexHead);

        root.left = left;
        root.right = right;

        return root;


    }

}
