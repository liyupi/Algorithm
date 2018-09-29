package com.yupi.algorithm.leetcode.linkedlist;

/**
 * 功能描述：删除链表当前节点
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class DeleteNode {


    public void deleteNode( ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}