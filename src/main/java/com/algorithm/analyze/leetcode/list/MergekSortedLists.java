package com.algorithm.analyze.leetcode.list;

/**
 * AUTO-GENERATED: houlu @ 2019/1/14 下午10:11
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class MergekSortedLists {


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l3 = new ListNode(3);
        l1.next = l3;

        ListNode l2 = new ListNode(2);
        ListNode l4 = new ListNode(4);
        l2.next = l4;


        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        l5.next = l6;

        ListNode[] listNodes = new ListNode[]{l1,l2,l5};
        mergeKLists(listNodes);

    }

    public static ListNode mergeKLists(ListNode[] lists) {

        ListNode newHead = null;
        for(int i=0;i<lists.length;i++){
             newHead = mergeTwoList(lists[i],newHead);
        }
        return newHead;
    }

    public static ListNode mergeTwoList(ListNode listNode1,ListNode listNode2){
        if(null==listNode1){
            return listNode2;
        }
        if(null==listNode2){
            return listNode1;
        }

        ListNode newHead = new ListNode(0);
        ListNode cur = newHead;
        while (listNode1!=null&&null!=listNode2){
            if(listNode1.val<listNode2.val){
                cur.next=listNode1;
                listNode1 = listNode1.next;
            }else {
                cur.next=listNode2;
                listNode2 = listNode2.next;
            }
            cur = cur.next;
        }
        if(null!=listNode1){
            cur.next = listNode1;
        }
        if(null!=listNode2){
            cur.next = listNode2;
        }
        return newHead.next;
    }


}
