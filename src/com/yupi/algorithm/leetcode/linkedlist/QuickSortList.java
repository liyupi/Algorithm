package com.yupi.algorithm.leetcode.linkedlist;

/**
 * 功能描述：排序链表（快速排序）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class QuickSortList {

    public ListNode sortList(ListNode head) {
        quickSort(head,null);
        return head;
    }

    public void quickSort(ListNode head, ListNode end) {
        if (head == null || head == end) {
            return;
        }
        int val = head.val;
        ListNode index = head;
        ListNode cur = head.next;
        while (cur != end) {
            if (cur.val < val) {
                index = index.next;
                swapVal(cur, index);
            }
            cur = cur.next;
        }
        head.val = index.val;
        index.val = val;
        quickSort(head, index);
        quickSort(index.next, end);
    }

    private void swapVal(ListNode node1, ListNode node2) {
        int temp = node1.val;
        node1.val = node2.val;
        node2.val = temp;
    }
}