package com.yupi.algorithm.leetcode.dp;

/**
 * 功能描述：最大子序列和
 *
 * 思路：动态规划，如果当前和小于0，则可以全部舍去，以新的值作为和，同时用max更新最大值
 * 状态转移方程：dp[i] = dp[i - 1] < 0 ? nums[i] : dp[i - 1] + nums[i]
 *
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class MaxSubArraySum {

    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = nums[0];
        // 可以只用1个变量记录总和，无需使用dp数组
        for (int i = 1; i < nums.length; i++) {
            if (sum > 0) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }
            max = Math.max(sum, max);
        }
        return max;
    }

}