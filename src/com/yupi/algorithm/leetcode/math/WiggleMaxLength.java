package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：摆动序列
 * 思路：自认为很牛逼的解法，贪心法，只要上升或下降状态改变计数器就加1，需要考虑元素相等的情况
 */

public class WiggleMaxLength {

    public int wiggleMaxLength(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length < 2) {
            return 1;
        }
        int res = 1;
        boolean up = false;
        boolean first = true;
        for (int i = 1; i < nums.length; i++) {
            if (first) {
                if (nums[i] != nums[i - 1]) {
                    first = false;
                    res++;
                    up = nums[i] > nums[i - 1];
                }
                continue;
            }
            if (up) {
                if (nums[i] < nums[i - 1]) {
                    up = false;
                    res++;
                }
            } else {
                if (nums[i] > nums[i - 1]) {
                    up = true;
                    res++;
                }
            }
        }
        return res;
    }


}