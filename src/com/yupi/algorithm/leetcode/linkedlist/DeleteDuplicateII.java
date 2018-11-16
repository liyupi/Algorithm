package com.yupi.algorithm.leetcode.linkedlist;

/**
 * 功能描述：删除排序链表中的重复元素Ⅱ
 * <p>
 * 思路：递归
 */

public class DeleteDuplicateII {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        boolean same = false;
        while (head.next != null) {
            if (head.next.val == head.val) {
                head = head.next;
                same = true;
            } else {
                break;
            }
        }
        head.next = deleteDuplicates(head.next);
        if (same) {
            head = head.next;
        }
        return head;
    }
}