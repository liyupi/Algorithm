package com.yupi.algorithm.leetcode.search.binary_search;

/**
 * 功能描述：二分查找寻找峰值
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class FindMaxValue {

    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (left == right) {
                return left;
            }
            int middle = left + (right - left) / 2;
            if (nums[middle] < nums[middle + 1]) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println(new FindMaxValue().findPeakElement(new int[]{2, 4, 3, 4, 5, 6, 7}));
    }
}