package com.algorithm.analyze.leetcode.list;

/**
 * AUTO-GENERATED: houlu @ 2019/1/13 下午6:06
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class OddEvenLinkedList {

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
        oddEvenList(l1);
    }

    public static ListNode oddEvenList(ListNode head) {
        if(head != null ){

            ListNode odd = head, even = head.next, evenHead = even;
            while(even != null && even.next != null){
                odd.next = odd.next.next;
                even.next = even.next.next;
                odd = odd.next;
                even = even.next;
            }
            odd.next = evenHead;
        }
        return head;
    }

}
