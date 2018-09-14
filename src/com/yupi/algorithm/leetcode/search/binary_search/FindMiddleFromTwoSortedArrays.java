package com.yupi.algorithm.leetcode.search.binary_search;

/**
 * 功能描述：寻找两个排序数组的中位数
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class FindMiddleFromTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m > n) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int l1 = 0, l2 = 0, r1 = 0, r2 = 0, c1, c2, left = 0, right = 2 * m;
        while (left <= right) {
            c1 = left + (right - left) / 2;
            c2 = m + n - c1;
            l1 = c1 == 0 ? Integer.MIN_VALUE : nums1[(c1 - 1) / 2];
            r1 = c1 == 2 * m ? Integer.MAX_VALUE : nums1[c1 / 2];
            l2 = (c2 == 0) ? Integer.MIN_VALUE : nums2[(c2 - 1) / 2];
            r2 = (c2 == 2 * n) ? Integer.MAX_VALUE : nums2[c2 / 2];
            if (l1 > r2) {
                right = c1 - 1;
            } else if (l2 > r1) {
                left = c1 + 1;
            } else {
                break;
            }
        }
        return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
    }

}