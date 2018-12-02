package com.yupi.algorithm.leetcode.dp;

/**
 * 功能描述：打家劫舍II
 * 思路：利用两个dp找最大值，分别为劫第一个和不劫第一个
 */

public class RobHouse2 {

    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        // 不选第一个
        int[] dp = new int[nums.length];
        dp[1] = nums[1];
        // 选第一个
        int[] dp2 = new int[nums.length];
        dp2[0] = 0;
        dp2[1] = nums[0];
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
            dp2[i] = Math.max(nums[i - 1] + dp2[i - 2], dp2[i - 1]);
        }
        return Math.max(dp[nums.length - 1], dp2[nums.length - 1]);
    }


}