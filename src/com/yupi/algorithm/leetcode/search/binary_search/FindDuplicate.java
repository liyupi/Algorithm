package com.yupi.algorithm.leetcode.search.binary_search;

/**
 * 功能描述：寻找重复数
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class FindDuplicate {

    public int findDuplicate(int[] nums) {
        int n = nums.length - 1;
        int left = 1;
        int right = n;
        while (left < right) {
            int middle = left + (right - left) / 2;
            int num = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= middle) {
                    num++;
                }
            }
            if (num <= middle) {
                left = middle + 1;
                continue;
            }
            right = middle;
        }
        return left;
    }

}