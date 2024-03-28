package com.algorithm.analyze.link;

import com.algorithm.analyze.leetcode.list.ListNode;
import java.util.HashMap;
import java.util.Map;

/**
 * 类名称: LinkDemo <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/7/12 下午2:37
 */
public class LinkDemo {
    


    public static LinkNode reverseList(LinkNode linkNode) {
        if (null == linkNode || null == linkNode.next) {
            return linkNode;
        }

        LinkNode reHead = reverseList(linkNode.next);
        linkNode.next.next = linkNode;
        linkNode.next = null;
        return reHead;
    }

    public static LinkNode reverseListUn(LinkNode linkNode) {

        // 如果链表为空或只有一个节点，无需反转，直接返回原链表表头
        if (linkNode == null || linkNode.next == null) {
            return linkNode;
        }

        LinkNode reHead = null;         // 反转后新链表指针
        LinkNode cur = linkNode;

        while (cur != null) {
            LinkNode preCur = cur;      // 用preCur保存住对要处理节点的引用
            cur = cur.next;             // cur更新到下一个节点
            preCur.next = reHead;   // 更新要处理节点的next引用
            reHead = preCur;            // reHead指向要处理节点的前一个节点
        }
        return reHead;
    }


    public static LinkNode mergeLink(LinkNode linkNode1, LinkNode linkNode2) {
        if (null == linkNode1) {
            return linkNode2;
        }

        if (null == linkNode2) {
            return linkNode1;
        }
        LinkNode reHead = null;
        if (linkNode1.count < linkNode2.count) {
            reHead = linkNode1;
            reHead.next = mergeLink(linkNode1.next, linkNode2);
        } else {
            reHead = linkNode2;
            reHead.next = mergeLink(linkNode1, linkNode2.next);
        }
        return reHead;
    }

    public static void reversePrint(LinkNode linkNode) {
        if (linkNode == null) {
            return;
        } else {
            reversePrint(linkNode.next);
            System.out.print(linkNode.count + "----");
        }
    }


    public static void printList(LinkNode linkNode) {
        while (linkNode.next != null) {
            System.out.print(linkNode.count + "---");
            linkNode = linkNode.next;
        }
        System.out.print(linkNode.count);
        System.out.println("");
    }


    public static void main(String[] args) {
        LinkNode linkNode1 = new LinkNode(1);
        LinkNode linkNode2 = new LinkNode(2);
        LinkNode linkNode3 = new LinkNode(3);
        LinkNode linkNode4 = new LinkNode(4);
        LinkNode linkNode5 = new LinkNode(5);

        linkNode1.next = linkNode2;
        linkNode2.next = linkNode3;
        linkNode3.next = linkNode4;
        linkNode4.next = linkNode5;

//        prinList(linkNode1);
//        printList(reverseList(linkNode1));
        printList(reverseListUn(linkNode1));
//        printList(mergeLink(linkNode1,linkNode2));
//        reversePrint(linkNode1);
//        printList(mergeList(linkNode1,linkNode2));
    }
}
