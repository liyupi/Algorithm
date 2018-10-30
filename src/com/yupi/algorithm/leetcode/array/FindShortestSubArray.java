package com.yupi.algorithm.leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能描述：数组的度
 *
 * 思路：map记录最大值即可
 *
 */

public class FindShortestSubArray {

    public int findShortestSubArray(int[] nums) {
        Map<Integer, Node> map = new HashMap<>();
        int maxCount = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new Node(i, i, 0));
            }
            Node node = map.get(nums[i]);
            node.count++;
            node.right = i;
            if (node.count > maxCount) {
                maxCount = node.count;
                list.clear();
                list.add(nums[i]);
            } else if (node.count == maxCount) {
                list.add(nums[i]);
            }
        }
        int res = nums.length;
        for (int num : list) {
            res = Math.min(res, map.get(num).right - map.get(num).left);
        }
        return res + 1;
    }

    class Node {
        int left;
        int right;
        int count;

        public Node(int left, int right, int count) {
            this.left = left;
            this.right = right;
            this.count = count;
        }
    }

}