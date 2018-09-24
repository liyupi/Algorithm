package com.yupi.algorithm.leetcode.stack.heap;

import java.util.PriorityQueue;

/**
 * 功能描述：第K大数（维护最小堆)
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class KthLargest {
    private int k;
    private PriorityQueue<Integer> priorityQueue;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            insert(nums[i]);
        }
    }

    public void insert(int val) {
        if (priorityQueue.size() < k) {
            priorityQueue.offer(val);
            return;
        }
        if (val > priorityQueue.peek()) {
            priorityQueue.poll();
            priorityQueue.offer(val);
        }
    }

    public int add(int val) {
        insert(val);
        return priorityQueue.peek();
    }
}
