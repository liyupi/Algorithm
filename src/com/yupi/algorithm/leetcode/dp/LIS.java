package com.yupi.algorithm.leetcode.dp;

/**
 * 功能描述：最长上升子序列
 * 思路：dp时间复杂度为n^2，可以使用插值+二分法，讲解的很不错
 * https://blog.csdn.net/lw_power/article/details/80758674
 */

public class LIS {

    int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int res = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > dp[res - 1]) {
                dp[res++] = nums[i];
            } else {
                binarySearch(dp, res, nums[i]);
            }
        }
        return res;
    }

    void binarySearch(int[] nums, int end, int num) {
        int left = 0;
        int right = end - 1;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (num < nums[middle]) {
                right = middle;
            } else if (num > nums[middle]) {
                left = middle + 1;
            } else {
                return;
            }
        }
        nums[left] = num;
    }

}