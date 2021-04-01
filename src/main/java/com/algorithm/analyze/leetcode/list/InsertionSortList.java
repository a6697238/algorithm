package com.algorithm.analyze.leetcode.list;

import java.util.Collections;

/**
 * AUTO-GENERATED: houlu @ 2019/1/20 上午11:48
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class InsertionSortList {

    public static void main(String[] args) {
        ListNode listNode3 = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode1 = new ListNode(1);

        listNode3.next = listNode2;
        listNode2.next = listNode1;
        insertionSortList(listNode3);
    }


    public static ListNode insertionSortList(ListNode head) {
        if(head == null)
            return null;
        ListNode helper = new ListNode(0);
        ListNode pre = helper;
        ListNode cur = head;
        while(cur!=null)
        {
            ListNode next = cur.next;
            pre = helper;
            while(pre.next!=null && pre.next.val<=cur.val)
            {
                pre = pre.next;
            }
            cur.next = pre.next;
            pre.next = cur;
            cur = next;
        }
        return helper.next;
    }
}
