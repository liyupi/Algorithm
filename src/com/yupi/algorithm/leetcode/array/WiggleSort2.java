package com.yupi.algorithm.leetcode.array;

import java.util.Arrays;

/**
 * 功能描述：摆动排序II
 * 思路：解法1：快排，然后一分为二，依次取左部分末尾和右部分末尾
 *       解法2：时间复杂度要求o(n)，空间复杂度要求o(1)，暂时不会
 */

public class WiggleSort2 {

    /**
     * 解法1
     * @param nums
     */
    public void wiggleSort(int[] nums) {
        int[] temp = nums.clone();
        Arrays.sort(temp);
        int right = nums.length - 1;
        int left = (nums.length + 1) / 2;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (i & 1) == 0 ? temp[left--] : temp[right--];
        }
    }

}