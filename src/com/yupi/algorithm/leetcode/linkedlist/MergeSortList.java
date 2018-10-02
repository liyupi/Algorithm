package com.yupi.algorithm.leetcode.linkedlist;

/**
 * 功能描述：排序链表（归并排序）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class MergeSortList {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // 快慢指针法拆分成两部分
        ListNode fast = head;
        ListNode slow = head;
        ListNode pre = slow;
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        return mergeTwoList(sortList(head), sortList(slow));
    }

    // 合并两个链表
    private ListNode mergeTwoList(ListNode sortList, ListNode sortList1) {
        if (sortList == null) {
            return sortList1;
        }
        if (sortList1 == null) {
            return sortList;
        }
        ListNode head;
        if (sortList.val < sortList1.val) {
            head = sortList;
            head.next = mergeTwoList(sortList.next, sortList1);
        } else {
            head = sortList1;
            head.next = mergeTwoList(sortList,sortList1.next);
        }
        return head;
    }


    private void swapVal(ListNode node1, ListNode node2) {
        int temp = node1.val;
        node1.val = node2.val;
        node2.val = temp;
    }
}