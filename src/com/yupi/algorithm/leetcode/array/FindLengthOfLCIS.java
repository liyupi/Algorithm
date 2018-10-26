package com.yupi.algorithm.leetcode.array;

/**
 * 功能描述：最长连续递增子序列
 */

public class FindLengthOfLCIS {

    public int findLengthOfLCIS(int[] nums) {
        int max = 1;
        if (nums.length < 2) {
            return nums.length;
        }
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 1;
            }
        }
        return max;
    }

}