package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：和最近人的最大距离
 *
 * 思路：注意判断最左和最右位置，双指针法即可
 */

public class MaxDistToClosest {

    public int maxDistToClosest(int[] seats) {
        int max = 0;
        int left = 0;
        int right = -1;
        int first = -1;
        for (int i = 0; i < seats.length; i++) {
            right++;
            if (seats[i] == 1) {
                if(first == -1) {
                    first = right - left;
                }
                max = Math.max(max, right - left);
                left = right;
            }
        }
        int last = seats.length - left - 1;
        int maxFL = Math.max(first,last);
        return maxFL >= max / 2 ? maxFL : max / 2;
    }
}