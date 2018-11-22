package com.yupi.algorithm.leetcode.linkedlist;

/**
 * 功能描述：重排链表
 *
 * 思路：好题，用到了快慢指针法，链表反转以及链表合并
 */

public class ReorderList {

    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }
        ListNode faster = head;
        ListNode slower = head;
        while (faster != null && faster.next != null) {
            faster = faster.next.next;
            slower = slower.next;
        }
        ListNode mid = slower.next;
        slower.next = null;
        ListNode head2 = reverse(mid);
        merge(head, head2);
    }

    ListNode reverse(ListNode head) {
        ListNode pre = head;
        while (head.next != null) {
            ListNode next = head.next;
            head.next = head.next.next;
            next.next = pre;
            pre = next;
        }
        return pre;
    }

    void merge(ListNode head1, ListNode head2) {
        while (head2 != null) {
            ListNode temp = head1.next;
            head1.next = head2;
            ListNode nextHead2 = head2.next;
            head2.next = temp;
            head1 = temp;
            head2 = nextHead2;
        }
    }
}