package com.yupi.algorithm.leetcode.search.binary_search;

/**
 * 功能描述：找山峰
 *
 * 思路：二分查找模板题
 */

public class PeakIndex {

    public int peakIndexInMountainArray(int[] A) {
        int left = 0;
        int right = A.length - 1;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (A[middle] <= A[middle + 1]) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return left;
    }
}