package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：最小移动次数使数组各元素相等
 *
 * 思路：逆向思维，每次相当于最大的数-1，那么移动次数和为每个元素减去最小元素的和
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class MinMoves {


    public int minMoves(int[] nums) {
        int min = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            min = Math.min(nums[i], min);
        }
        return sum - nums.length * min;
    }
    
}