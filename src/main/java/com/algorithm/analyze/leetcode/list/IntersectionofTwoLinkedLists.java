package com.algorithm.analyze.leetcode.list;

import com.algorithm.analyze.leetcode.list.ListNode;

/**
 * @author Lu Hou
 */
public class IntersectionofTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(null==headA||null==headB){
            return null;
        }
        ListNode pa = headA;
        ListNode pb = headB;
        int lenA = 0;
        int lenB = 0;
        while (pa!=null){
            pa = pa.next;
            lenA++;
        }
        while (pb!=null){
            pb = pb.next;
            lenB++;
        }
        int diff = lenA-lenB;
        pa = headA;
        pb = headB;
        if(diff>0){
            while (diff>0){
                pa = pa.next;
                diff--;
            }
        }else {
            while (diff<0){
                pb = pb.next;
                diff++;
            }
        }
        while (pa!=null&&pb!=null&&pa!=pb){
            pa=pa.next;
            pb=pb.next;
        }
        return pa;
    }

}
