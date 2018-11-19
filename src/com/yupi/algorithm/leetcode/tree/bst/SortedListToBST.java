package com.yupi.algorithm.leetcode.tree.bst;

import com.yupi.algorithm.leetcode.linkedlist.ListNode;

/**
 * 功能描述：有序链表转二叉搜索树
 *
 * 思路：二叉搜索树中序遍历即为有序数组，因此每次先找中间元素，用快慢指针法
 */

public class SortedListToBST {

    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode faster = head;
        ListNode slower = head;
        ListNode pre = head;
        while (faster != null && faster.next != null) {
            faster = faster.next.next;
            pre = slower;
            slower = slower.next;
        }
        TreeNode treeNode = new TreeNode(slower.val);
        treeNode.right = sortedListToBST(slower.next);
        pre.next = null;
        treeNode.left = sortedListToBST(head);
        return treeNode;
    }
}