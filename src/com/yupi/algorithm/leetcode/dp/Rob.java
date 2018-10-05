package com.yupi.algorithm.leetcode.dp;

/**
 * 功能描述：打家劫舍（简单dp）
 *
 * @author Yupi Li
 * @date 2018/10/04 09:37
 */

public class Rob {

    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length + 2];
        dp[1] = nums[0];
        for (int i = 2; i <= nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);
        }
        return dp[nums.length];
    }
}