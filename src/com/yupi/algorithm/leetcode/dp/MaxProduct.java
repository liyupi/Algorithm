package com.yupi.algorithm.leetcode.dp;

/**
 * 功能描述：乘积最大子序列
 * <p>
 * 思路：dp的思想，记录以每个位置的数作为乘积最后一项的最大值/最小值（负数）
 * 然后用res记录过程中的最大值即可
 */

public class MaxProduct {

    public int maxProduct(int[] nums) {
        int len = nums.length;
        int res = nums[0];
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < len; i++) {
            int temp = max;
            max = Math.max(max * nums[i], Math.max(min * nums[i], nums[i]));
            min = Math.min(temp * nums[i], Math.min(min * nums[i], nums[i]));
            res = Math.max(res, max);
        }
        return res;
    }
}