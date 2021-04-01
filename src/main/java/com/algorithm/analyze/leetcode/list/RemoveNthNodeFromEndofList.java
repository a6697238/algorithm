package com.algorithm.analyze.leetcode.list;

/**
 * @author Lu Hou
 * @date 2018/1/11
 * @time 上午12:29
 * <p>
 * <p>
 * Given linked list: 1->2->3->4->5, and n = 2.
 * <p>
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 */
public class RemoveNthNodeFromEndofList {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null)
            return null;

        ListNode faster = head;
        ListNode slower = head;

        for(int i = 0; i<n; i++)
            faster = faster.next;

        if(faster == null){
            head = head.next;
            return head;
        }

        while(faster.next != null){
            slower = slower.next;
            faster = faster.next;
        }

        slower.next = slower.next.next;
        return head;

    }


}
