package com.algorithm.analyze.leetcode.list;

/**
 * @author Lu Hou
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head; // 快指针每次前进两步
        ListNode slow = head; // 慢指针每次前进一步

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) { // 相遇，存在环
                return true;
            }
        }
        return false;

    }

}
