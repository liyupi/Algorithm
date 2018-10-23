package com.yupi.algorithm.leetcode.math;

import java.util.Arrays;

/**
 * 功能描述：三个数的最大乘积
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class MaximumProduct {

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int res = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        if (nums[0] > 0) {
            return res;
        }
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1], res);
    }
}