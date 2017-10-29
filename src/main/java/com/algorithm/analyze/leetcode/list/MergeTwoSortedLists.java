package com.algorithm.analyze.leetcode.list;

/**
 * @author Lu Hou
 * @date 2017/10/18
 * @time 下午9:07
 */
public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        mergeTwoLists(l1,l2);

    }


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(null==l1) return l2;
        if(null==l2) return l1;
        ListNode newHead  = new ListNode(0);
        ListNode cur = newHead;
        while (l1!=null&&l2!=null){
            if(l1.val<l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if (l1!=null){
            cur.next = l1;
        }
        if (l2!=null){
            cur.next = l2;
        }
        return newHead.next;
    }
}
