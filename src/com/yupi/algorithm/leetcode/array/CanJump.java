package com.yupi.algorithm.leetcode.array;

/**
 * 功能描述：跳跃游戏
 * <p>
 * 思路：一次遍历，记录每次能达到的最大位置，若达不到当前位置，返回false
 */

public class CanJump {

    public boolean canJump(int[] nums) {
        int maxPos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (maxPos >= i) {
                maxPos = Math.max(maxPos, nums[i] + i);
            } else {
                return false;
            }
        }
        return true;
    }


}