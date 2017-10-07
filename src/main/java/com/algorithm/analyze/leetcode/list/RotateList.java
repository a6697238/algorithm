package com.algorithm.analyze.leetcode.list;

/**
 * @author Lu Hou
 * @date 2017/10/6
 * @time 下午6:17
 * <p>
 * leetCode 61题
 * <p>
 * https://leetcode.com/problems/rotate-list/description/
 * <p>
 * Given a list, rotate the list to the right by k places, where k is non-negative.
 * For example:
 * Given 1->2->3->4->5->NULL and k = 2,
 * return 4->5->1->2->3->NULL.
 */

public class RotateList {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode1.next=listNode2;
        rotateRight(listNode1,2);
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0){
            return head;
        }

        //求解需要旋转多少次，如果 链表长度 n，旋转 k 次，实际需要旋转的点为 k%n
        int length = 1;
        ListNode len = head;
        while (len.next!=null){
            len = len.next;
            length++;
        }
        k = k%length;

        //开始旋转，双指针
        ListNode start = head;
        ListNode end = head;
        while (k>0){
            end = end.next;
            k--;
        }
        while (end.next!=null&&end!=null){
            start = start.next;
            end = end.next;
        }
        end.next = head;
        ListNode reHead = start.next;
        start.next = null;

        return reHead;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}



