package com.algorithm.analyze.leetcode.list;

/**
 * AUTO-GENERATED: houlu @ 2019/1/13 下午7:17
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class ReorderList {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        reorderList(l1);
    }

    public static void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode half = slow.next;
        slow.next = null;

        ListNode reHead = null;
        ListNode cur = half;
        while (cur != null) {
            ListNode preCur = cur;
            cur = cur.next;
            preCur.next = reHead;
            reHead = preCur;
        }

        fast = reHead;

        while (fast != null) {
            ListNode temp = head.next;
            head.next = fast;
            fast = fast.next;
            head.next.next = temp;
            head = head.next.next;
        }
    }

}
