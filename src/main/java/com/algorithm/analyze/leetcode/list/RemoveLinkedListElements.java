package com.algorithm.analyze.leetcode.list;

/**
 * AUTO-GENERATED: houlu @ 2019/1/13 下午5:40
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
public class RemoveLinkedListElements {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);

        l1.next = l2;
        l2.next = l3;
        removeElements(l1, 3);
    }

    public static ListNode removeElements(ListNode head, int val) {

        if(head==null)//需要判空
            return head;
        ListNode correct=new ListNode(0);//建立新节点，next指向head
        correct.next=head;
        ListNode pre=correct;//前一个指针
        ListNode cur=correct.next;//当前指针
        while(cur.next!=null)//当前指针的next不为空
        {
            if(cur.val==val)//删除
            {
                pre.next=cur.next;
            }
            else
            {
                pre=pre.next;
            }
            cur=cur.next;
        }
        if(cur.val==val)//最后需要判断cur是否为val，如果是，那么前一个指针直接指向null
            pre.next=null;
        return correct.next;//返回head指针

    }

}
