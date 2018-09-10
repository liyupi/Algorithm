package com.yupi.algorithm.leetcode.search.binary_search;

/**
 * 功能描述：查找数组中某值所在的索引范围
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class RangeSearch {

    public static void main(String[] args) {
        new RangeSearch().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
    }

    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle = 0;
        boolean flag = false;
        while (left <= right) {
            middle = left + (right - left) / 2;
            if (nums[middle] < target) {
                left = middle + 1;
            } else if (nums[middle] > target) {
                right = middle - 1;
            } else {
                flag = true;
                break;
            }
        }
        if (!flag) {
            return new int[]{-1, -1};
        }
        for (int i = middle; i >= 0; i--) {
            if (nums[i] == target) {
                left = i;
            } else {
                break;
            }
        }
        for (int i = middle; i < nums.length; i++) {
            if (nums[i] == target) {
                right = i;
            } else {
                break;
            }
        }
        return new int[]{left, right};
    }

}