package com.yupi.algorithm.leetcode.search.binary_search;

import java.util.Arrays;

/**
 * 功能描述：找出第k小的距离对
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class FindKMinDistancePair {

    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums[nums.length - 1] - nums[0];
        while (left < right) {
            int middle = left + (right - left) / 2;
            int count = 0;

            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] - nums[i] <= middle) {
                        count++;
                    } else {
                        break;
                    }
                }
            }
            if (count < k) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return right;
    }

}