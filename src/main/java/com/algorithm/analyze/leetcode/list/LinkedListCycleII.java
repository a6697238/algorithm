package com.algorithm.analyze.leetcode.list;

/**
 * AUTO-GENERATED: houlu @ 2019/1/20 上午11:46
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class LinkedListCycleII {

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // 1） 找到快慢指针相遇点
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) { // Collision
                break;
            }
        }

        // 错误检查，这是没有环的情况
        if (fast == null || fast.next == null) {
            return null;
        }

        // 2）现在，相遇点离环的开始处的距离等于链表头到环开始处的距离，
        // 这样，我们把慢指针放在链表头，快指针保持在相遇点，然后
        // 同速度前进，再次相遇点就是环的开始处！
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // 再次相遇点就是环的开始处
        return fast;


    }

}
