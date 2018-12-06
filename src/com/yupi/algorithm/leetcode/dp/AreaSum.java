package com.yupi.algorithm.leetcode.dp;

/**
 * 功能描述：一维区域和检索
 * 思路：动态规划，i到j的和为dp[j] - dp[i - 1]
 */

public class AreaSum {

    class NumArray {

        private int[] dp;

        public NumArray(int[] nums) {
            if (nums.length == 0) {
                return;
            }
            dp = new int[nums.length];
            dp[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                dp[i] = dp[i - 1] + nums[i];
            }
        }

        public int sumRange(int i, int j) {
            if (i == 0) {
                return dp[j];
            }
            return dp[j] - dp[i - 1];
        }
    }
}