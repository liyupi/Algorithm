package com.yupi.algorithm.leetcode.design;

import java.util.Random;

/**
 * 功能描述：打乱数组
 *
 * @author Yupi Li
 * @date 2018/10/3 09:37
 */

class Shuffle {

    private Random random = new Random();
    private int[] nums;
    private int[] shuffledNums;

    public Shuffle(int[] nums) {
        this.nums = nums;
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        return nums;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        shuffledNums = new int[nums.length];
        System.arraycopy(nums, 0, shuffledNums, 0, nums.length);
        for (int i = 0; i < nums.length; i++) {
            int n = random.nextInt(i + 1);
            int temp = shuffledNums[i];
            shuffledNums[i] = shuffledNums[n];
            shuffledNums[n] = temp;
        }
        return shuffledNums;
    }
}