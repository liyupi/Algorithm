package com.yupi.algorithm.leetcode.linkedlist;

/**
 * 功能描述：合并k个排序列表
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class MergeKLists {


    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        int n = lists.length;
        while (n > 1) {
            int k = (n + 1) / 2;
            int half = n / 2;
            for (int i = 0; i < half; i++) {
                lists[i] = mergeTwoLists(lists[i], lists[i + k]);
            }
            n = k;
        }

        return lists[0];
    }

    public ListNode mergeTwoLists(ListNode node1, ListNode node2) {
        if (node1 == null) {
            return node2;
        }
        if (node2 == null) {
            return node1;
        }
        ListNode head;
        if (node1.val <= node2.val) {
            head = node1;
            head.next = mergeTwoLists(node1.next, node2);
        } else {
            head = node2;
            head.next = mergeTwoLists(node1, node2.next);
        }
        return head;
    }

}