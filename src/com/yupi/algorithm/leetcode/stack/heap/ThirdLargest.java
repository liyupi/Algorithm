package com.yupi.algorithm.leetcode.stack.heap;

import java.util.PriorityQueue;

/**
 * 功能描述：第三大的数
 *
 * 思路：按第K大数做，维护一个最大堆
 *
 * @author Yupi Li
 * @date 2018/10/04 09:37
 */

public class ThirdLargest {

    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

    public int thirdMax(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            insert(nums[i]);
        }
        if(priorityQueue.size() < 3) {
            while(priorityQueue.size() != 1) {
                priorityQueue.poll();
            }
        }
        return priorityQueue.poll();
    }

    private void insert(int num) {
        if (priorityQueue.contains(num)) {
            return;
        }
        if (priorityQueue.size() < 3) {
            priorityQueue.offer(num);
        } else if (priorityQueue.peek() < num) {
            priorityQueue.poll();
            priorityQueue.offer(num);
        }
    }


}