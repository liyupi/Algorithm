package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：接雨水
 * 思路：如果一味从左到右或从右到左记录最大值后累加求和，会被最高的位置干扰导致少算一边
 * 因此需要先找到最高的位置，再分别对从左到右和从右到左累加求和
 */

public class trap {

    public int trap(int[] height) {
        if (height.length == 0) {
            return 0;
        }
        int max = 0;
        int maxPos = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > max) {
                max = height[i];
                maxPos = i;
            }
        }
        int res = 0;
        int leftMax = height[0];
        for (int i = 1; i < maxPos; i++) {
            if (height[i] <= leftMax) {
                res += leftMax - height[i];
            } else {
                leftMax = height[i];
            }
        }
        int rightMax = height[height.length - 1];
        for (int i = height.length - 2; i > maxPos; i--) {
            if (height[i] <= rightMax) {
                res += rightMax - height[i];
            } else {
                rightMax = height[i];
            }
        }
        return res;
    }
}