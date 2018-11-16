package com.yupi.algorithm.leetcode.linkedlist;

/**
 * 功能描述：分割链表
 * <p>
 * 思路：新建两个链表分别存储大于和小于，最后合并
 */

public class Partition {

    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(1);
        ListNode big = new ListNode(1);
        ListNode smallHead = small;
        ListNode bigHead = big;
        while (head != null) {
            if (head.val < x) {
                small.next = new ListNode(head.val);
                small = small.next;
            } else {
                big.next = new ListNode(head.val);
                big = big.next;
            }
            head = head.next;
        }
        small.next = bigHead.next;
        return smallHead.next;
    }
}