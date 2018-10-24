package com.yupi.algorithm.leetcode.array;

/**
 * 功能描述：子数组最大平均数
 *
 * 思路：滑动窗口
 *
 */

public class FindMaxAverage {

    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double max = sum;
        for (int i = k; i < nums.length; i++) {
            sum -= nums[i - k];
            sum += nums[i];
            max = Math.max(max, sum);
        }
        return max / k;
    }

}