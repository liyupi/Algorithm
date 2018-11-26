package com.yupi.algorithm.leetcode.linkedlist;

/**
 * 功能描述：插入排序链表
 *
 * 思路：注意首尾的特殊性
 */

public class InsertionSortList {

    public ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pos = head;
        while (pos.next != null) {
            ListNode el = pos.next;
            if (el.val >= pos.val) {
                pos = el;
                continue;
            }
            pos.next = el.next;
            ListNode temp = head;
            ListNode pre = head;
            if (el.val <= head.val) {
                el.next = head;
                head = el;
                continue;
            }
            while (el.val > temp.val) {
                pre = temp;
                temp = temp.next;
            }
            pre.next = el;
            el.next = temp;
        }
        return head;
    }

}