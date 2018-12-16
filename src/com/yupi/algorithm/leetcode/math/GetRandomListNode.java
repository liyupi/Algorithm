package com.yupi.algorithm.leetcode.math;

import com.yupi.algorithm.leetcode.linkedlist.ListNode;

/**
 * 功能描述：返回链表随机节点
 * 思路：蓄水池抽样原理：遍历整个链表，是否取第i个元素的概率为1/(i + 1)，返回值不断覆盖，每个节点几率都相等
 */

public class GetRandomListNode {

    class Solution {

        ListNode head;

        /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
        public Solution(ListNode head) {
            this.head = head;
        }

        /** Returns a random node's value. */
        public int getRandom() {
            int res = head.val;
            int i = 2;
            ListNode cur = head.next;
            while (cur != null) {
                int rand = (int)(Math.random() * i);
                if (rand == 0) {
                    res = cur.val;
                }
                i++;
                cur = cur.next;
            }
            return res;
        }
    }

}