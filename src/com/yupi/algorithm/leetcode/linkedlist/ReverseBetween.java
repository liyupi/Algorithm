package com.yupi.algorithm.leetcode.linkedlist;

/**
 * 功能描述：反转链表Ⅱ
 * <p>
 * 思路：记录反转前的节点位置以及反转后链表的头位置，依次将反转区的元素添加至头并设置为新头
 * 最后再与反转前的节点连接
 */

public class ReverseBetween {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode mNode = head;
        ListNode pre = head;
        for (int i = 1; i < m; i++) {
            pre = mNode;
            mNode = mNode.next;
        }
        int count = n - m;
        ListNode mHead = mNode;
        while (count-- > 0) {
            ListNode temp = mNode.next;
            mNode.next = temp.next;
            temp.next = mHead;
            mHead = temp;
        }
        if (mNode == head) {
            return mHead;
        }
        pre.next = mHead;
        return head;
    }

}