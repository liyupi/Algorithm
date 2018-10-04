package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：寻找缺失的数
 *
 * @author Yupi Li
 * @date 2018/10/04 09:37
 */

public class MissingNumber {

    public int missingNumber(int[] nums) {
        long sum = nums.length * (nums.length + 1) / 2;
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
        }
        return (int) sum;
    }
}