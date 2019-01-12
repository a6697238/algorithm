package com.algorithm.analyze.leetcode.list;

/**
 * AUTO-GENERATED: houlu @ 2019/1/12 上午11:10
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class RemoveDuplicatesfromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null){
            if(slow.val==fast.val){
                fast = fast.next;
                slow.next = fast;
            }else {
                fast = fast.next;
                slow = slow.next;
            }
        }
        return head;

    }

}
