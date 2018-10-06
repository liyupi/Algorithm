package com.yupi.algorithm.leetcode.linkedlist;

/**
 * 功能描述：删除链表中重复节点
 * 
 * 注意陷阱：如"aaa   "
 *
 * @author Yupi Li
 * @date 2018/10/04 09:37
 */

public class DeleteDuplicate {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pos = head;
        while (pos.next != null) {
            if (pos.val == pos.next.val) {
                pos.next = pos.next.next;
            } else {
                pos = pos.next;
            }
        }
        return head;
    }

}