package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：递增的三元子序列
 * 思路：记录一个长度为2的递增子序列，并保证该序列元素最小
 */

public class IncreasingTriplet {

    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        int nextMin = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= min) {
                min = num;
            } else if (num <= nextMin){
                nextMin = num;
            } else {
                return true;
            }
        }
        return false;
    }

}